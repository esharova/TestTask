import car.Car;
import car.Ford;
import car.Opel;
import car.Travel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Переполнение
        test1();

        // Абстракция
        test2();
    }

    /**
     * В Java int - 32 битная знаковая переменная. Это означает, что первый бит хранит знак.
     * Поэтому максимальное положительное значение, которое может принимать int переменная 2^32-1 = 2147483647
     */
    private static void test1() {
        long a = 0x7ffffffc;
        long b = 0x7ffffffe;

        long c = a + b;
        System.out.println(c);
    }

    private static void test2(){

        List<Car> cars = new ArrayList<Car>();
        cars.add(new Opel());
        cars.add(new Ford());

        for(Car aCar : cars) {
            Travel travel = new Travel(aCar);
            travel.doTravel();
        }
    }
}
