package car;

/**
 * Created by sharovahelene on 04.03.15.
 */
public abstract class Car {

    public abstract int amortization();

    public abstract int repair();

    public int calculateCost(){

        return amortization() + repair();
    }

}
