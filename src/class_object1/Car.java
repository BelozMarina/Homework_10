package class_object1;

public class Car {
    private int speed;
    private String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // перезапись метода toString класса Object
    @Override
    public String toString() {
        return String.format("Speed is: %d \nColor is: %s", speed, color);
    }
}
