package misc;

import inter.Noiseable;


public class Plane extends Vehicle implements Noiseable{
    private String engineType;
    private String type;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sound() {
        System.out.println("UUUUUUUUUUUUUUUUUH");
    }

    @Override
    public void move() {
        System.out.println("I fly at " + this.getMaxSpeed() + " kmph");
    }
}
