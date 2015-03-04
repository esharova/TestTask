package car;

import car.Car;

/**
 * Created by sharovahelene on 04.03.15.
 */
public class Opel extends Car {
    @Override
    public int amortization() {
        return 10;
    }

    @Override
    public int repair() {
        return 200;
    }

}
