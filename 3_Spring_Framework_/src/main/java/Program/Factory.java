package Program;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private List<Car> carList = new ArrayList<>();

    private String model;
    private String generation;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public void produce() {
        for (Car car : carList) {
            System.out.println("produce: " + car.getModel());
        }
    }
}
