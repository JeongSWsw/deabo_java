package ex07.stringBuffer;

public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode());

		System.out.println("length      /         capacity");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "           /             " + size);

		sb.append("deabo");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "           /             " + size);
	
		sb.append("happyvirus");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "           /             " + size);
	
		sb.append("123456 20323");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "           /             " + size);
		
		sb.append("123456 20323");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "           /             " + size);
	
		System.out.println(sb.hashCode());
		
		sb.trimToSize(); //용량 크기 조절
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "           /             " + size);

		
	}
}
