package 接口;

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		v.fly();
		
		Honest h = new GoodMan();
		h.helpOther();
	}
}

/**
 * -飞行接口
 * 
 * @author 王以诚
 */
interface Volant {
	int FLY_HEIGHT = 1000;
	void fly();
}

/**
 * -善良接口
 * 
 * @author 王以诚
 */
interface Honest {
	void helpOther();
}


class Angel implements Volant, Honest { // 实现类可以实现多个父接口！

	public void helpOther() {
		System.out.println("Angel.helpOther()");
	}

	public void fly() {
		System.out.println("Angel.fly()");
	}
	
}

class GoodMan implements Honest {

	public void helpOther() {
		System.out.println("Goodman.helpOther()");
	}
	
}

class Birdman implements Volant {

	public void fly() {
		System.out.println("Birdman.fly()");
	}

}