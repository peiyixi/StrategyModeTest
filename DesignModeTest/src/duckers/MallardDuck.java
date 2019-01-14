package duckers;

import StrategyMode.Duck;
import flying.FlyWithWings;
import quack.*;


public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flying = new  FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I`m a MallardDuck");
	}
	

}
