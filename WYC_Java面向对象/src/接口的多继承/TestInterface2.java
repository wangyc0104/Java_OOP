package 接口的多继承;

public class TestInterface2 {

}

interface A {
	void testa();
}

interface B {
	void testb();
}

/**
 * -接口可以多继承：接口C继承接口A和B
 */
interface C extends A, B {
	void testc();
}

class Mysubclass implements C {

	@Override
	public void testa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testc() {
		// TODO Auto-generated method stub
		
	}
	
}