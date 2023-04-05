package ex02.method;

public class MainEntry {
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("using error ");
			return;
		}
		
		String s1 = args[0];
		String s2 = args[1];
//		int num1 = Integer.parseInt(s1);
//		int num2 = Integer.parseInt(s2);
		
		
		System.out.println(s1+", "+s2);
		
		System.out.println("=====================");
		System.out.println("plus = "+(Integer.parseInt(s1)+Integer.parseInt(s2)));
	
	}
}

