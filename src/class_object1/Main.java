package class_object1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "blue");

        // возвращает клас объекта
        System.out.println(car.getClass());

        System.out.println(car);
    }
}
