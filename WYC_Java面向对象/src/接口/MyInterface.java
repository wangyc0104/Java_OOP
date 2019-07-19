package 接口;

/**
 * -接口就是契约，制定好后大家遵守 <br>
 * -接口是比抽象类还要抽象的类 <br>
 * -接口里只有抽象方法 <br>
 * -接口可以实现多继承<br>
 * 
 * @author 王以诚
 */
public interface MyInterface {

	// 接口里面只能定义常量，默认是public static final
	/* public static final */ int MAX_AGE = 100;

	// 接口里面只有公有的抽象方法
	/* public abstract */ void test01();
}

class MyClass implements MyInterface {
	// 实现了接口的类必须要实现接口的抽象方法
	public void test01() {
		System.out.println(MAX_AGE);
		System.out.println("MyClass.text01()");
	}
}