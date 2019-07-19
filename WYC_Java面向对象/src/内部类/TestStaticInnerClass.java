package 内部类;

/**
 * -测试静态内部类
 * 
 * @author 王以诚
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {
		// 当实例化一个静态内部类时，不需要实例化outer的对象，只需要outer类即可
		Outer2.Inner2 inner = new Outer2.Inner2();
	}
}

class Outer2 {
	static class Inner2 {
		// 静态内部类中可以包含static修饰的变量
		static int i = 199;
	}	
}
