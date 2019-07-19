package 内部类;

/**
 * -测试非静态内部类
 * 
 * @author 王以诚
 */
public class TestInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

class Outer {
	private int age = 10;

	public void testOuter() {
		System.out.println("Outer.testOuter()");
	}

	// 在class编辑生成后，是平行的类文件，并没有内外之分
	// 前面加了static就是静态内部类，没加就是非静态内部类，两者都属于成员内部类
	class Inner {
		// 内部类可以直接访问外部类的成员
		// 普通内部类不能加静态值
		int age = 20;
		public void show() {
			int age = 30;
			System.out.println("外部类的成员变量 age：" + Outer.this.age);
			System.out.println("内部类的成员变量 age：" + this.age);
			System.out.println("内部类的局部变量 age：" + age);
		}
	}
	
	// 静态内部类可以看作外部类的静态成员
}