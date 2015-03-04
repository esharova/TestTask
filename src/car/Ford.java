package car;

/**
 * Created by sharovahelene on 04.03.15.
 */
public class Ford extends Car {
    @Override
    public int amortization() {
        return 5;
    }

    @Override
    public int repair() {
        return 100;
    }
}
