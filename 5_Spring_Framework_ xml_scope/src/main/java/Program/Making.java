package Program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Making {
    public int id;
    private Factory factory;

    @Autowired
    public Making(Factory factory){
        this.id = 1;
        this.factory = factory;
    }

    @Override
    public String toString(){
        return "Making " + id + " " + factory.production();
    }

}
