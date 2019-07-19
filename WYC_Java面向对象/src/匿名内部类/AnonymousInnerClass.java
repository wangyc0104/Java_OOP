package 匿名内部类;

/**
 * -测试匿名内部类（没有名字，只使用一次）
 * 
 * @author 王以诚
 */
public class AnonymousInnerClass {
	public static void test01(AA a) {
		a.aa();
	}

	public static void main(String[] args) {
		AnonymousInnerClass.test01(new AA() {
			public void aa() {
				// 直接在这里写一个AA接口的实现方法块，此方法只会调用一次
			}
		});
	}
}

interface AA {
	void aa();
}
