package 抽象类;

/**
 * -抽象类的意义就在于：为子类提供统一的、规范的模板。子类必须实现相关的抽象方法
 * 
 * @author 王以诚
 */

public abstract class Animal {

	// 抽象类特征
	// 第一：没有实现
	// 第二：子类必须实现
	// 第三：抽象类中可以没有抽象方法
	// abstract public void shout();

	public void run() {
		System.out.println("跑啊跑！");
	}
	
	public static void main(String[] args) {
		Animal a = new Dog();
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("汪汪汪！");
	}
}
