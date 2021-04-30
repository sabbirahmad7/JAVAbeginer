
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Literal
		
		String str1 = "Hello";
		String str4 = "hello";
		
		// heap objects
		String str2 = new String ("welcome");
		String str3 = new String ("welcome");
		
		str1 = "More hello";
		str4 = "welcome2";
		System.out.println(str2.length());
		System.out.println(str1.contains("a"));
		
		
	}

}
