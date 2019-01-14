package duckers;

import StrategyMode.Duck;
import flying.FlyNoWay;
import quack.MuteQuack;


public class ModelDuck extends Duck{

	public ModelDuck() {
		flying = new   FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I`m a Model Duck");
	}
	

}
