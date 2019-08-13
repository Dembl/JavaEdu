package misc;

import inter.Noiseable;

import java.io.Serializable;

public class Car extends Vehicle implements Noiseable {
    private String model;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void sound(){
        System.out.println("brrrr-pih-pih");
    }

    public void move() {
        System.out.println("I move at " + this.getMaxSpeed() + " kmph");
    }
}
