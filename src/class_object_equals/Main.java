package class_object_equals;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(22);
        Car car2 = new Car(22);
        Car car4 = new Car(23);
        Car car3 = car1;

        // сравниваем по ссылкам
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        System.out.println(car1 == car2);
        System.out.println(car1 == car3);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car4.hashCode());

    }
}
