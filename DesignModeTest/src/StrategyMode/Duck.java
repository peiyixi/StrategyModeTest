package StrategyMode;

import flying.flyingbehavior;
import quack.QuackBehavior;

public abstract class Duck {

	protected flyingbehavior flying;
	protected QuackBehavior quackBehavior;

	public Duck() {

	}
    //鸭子的外观
	public abstract void display();
    //鸭子的叫声
	public void performQuack() { 
		quackBehavior.quack();
	}
    //鸭子飞行
	public void performFly() {
		flying.fly();
	}
    //更改飞行行为
	public void setFlyBehavior(flyingbehavior fb) {
		flying = fb;
	}
    //更改叫声行为
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}
