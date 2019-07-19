package String类;

public class TestStringMethods {
	public static void main(String[] args) {
		String s1 = "core Java";
		String s2 = "Core Java";
		// 提取下票为3的字符，第一个index为0，会抛出IndexOutOfBoundsException异常
		System.out.println(s1.charAt(3));
		
		System.out.println(s2.length()); // 字符串长度，是方法（数组是属性length）
		System.out.println(s1.equalsIgnoreCase(s2)); // 比较两个字符串（忽略大小写）
		
		System.out.println(s1.indexOf("Java")); // 字符串中是否包含Java
		System.out.println(s1.indexOf("apple")); // 字符串中是否包含apple
		
		String s = s1.replace(' ', '&');
		System.out.println(s);
		
		String s3 = "";
		String s4 = "How are you?";
		
		System.out.println(s4.startsWith("How")); // true
		System.out.println(s4.endsWith("you")); // false
		
		s3 = s4.substring(4); // 提取子字符串：
		System.out.println(s3);
		
		s3 = s4.substring(4, 7); // 下标[4,7)
		System.out.println(s3);
		
		String s5 = " How old are you? ";
		String s6 = s5.trim(); // 去掉边上的字符串
		System.out.println(s5);
		System.out.println(s6);
	}
}
