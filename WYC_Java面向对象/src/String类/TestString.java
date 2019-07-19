package String类;

public class TestString {
	public static void main(String[] args) {
		// 直接赋值的"abc"会被放到常量池中，不会被实例化第2次。
		String str1 = "abc";
		String str2 = new String("def");
		String str3 = "abc" + "defgh";
		String str4 = "18" + 19;
		System.out.println(str4);

		System.out.println("#############");
		String str10 = "WangYicheng"; // 常量池中String对象
		String str11 = "WangYicheng"; // 常量池中String对象
		String str12 = new String("WangYicheng"); // 一个新的String对象

		// ==号只比较String的引用地址
		System.out.println("str10==str11  " + (str10 == str11));
		System.out.println("str10==str11  " + (str11 == str12));
		
		// .equals方法比较的是String内容
		System.out.println(str12.equals(str11));
	}
}
