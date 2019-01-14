package test;

import StrategyMode.Duck;
import duckers.MallardDuck;
import duckers.ModelDuck;
import flying.FlyRocketPowered;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		 mallard.display();
		 mallard.performQuack();
		 mallard.performFly();
		 Duck model = new ModelDuck();
		 model.display();
		 model.performFly();
		 model.performQuack();
		 model.setFlyBehavior(new FlyRocketPowered());
		 model.performFly();
	}

}
