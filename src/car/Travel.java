package car;

import java.util.Random;

/**
 * Created by sharovahelene on 04.03.15.
 */
public class Travel {

    Car car;

    public Travel(Car car){

        this.car = car;
    }

    public void doTravel(){
        if(car != null){
            System.out.println("cost >>>>> " + car.calculateCost() + someInnerLogic());
        }
    }

    private float someInnerLogic() {
        return new Random().nextFloat() + 1;
    }

}
