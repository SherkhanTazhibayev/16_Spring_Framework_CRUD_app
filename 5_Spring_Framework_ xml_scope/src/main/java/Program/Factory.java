package Program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Factory {

    @Value("${factory.name}")
    private String name;

    @Value("${factory.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    private Car car;
    private Car car2;

//    @Autowired
    public Factory(@Qualifier("japan") Car car,
                   @Qualifier("germany") Car car2) {
        this.car = car;
        this.car2 = car2;
    }




//    private Japan japan;
//    private Germany germany;

//    @Autowired
//    public Factory(Japan japan,
//                   Germany germany){
//        this.japan = japan;
//        this.germany = germany;
//    }

//    public String production(){
//        return "Production: " + japan.getModel();
//    }

    public String production(){
        return "Production: " + car.getModel() + " " + car2.getModel();
    }

}
