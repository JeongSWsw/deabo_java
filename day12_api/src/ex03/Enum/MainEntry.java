package ex03.Enum;

enum UserStatus {
	PENGING,
	ACTIVE,
	INACTIVE,
	DELETE;
}

public class MainEntry {
	public static void main(String[] args) {
		// 1. 직접 사용 가능
		System.out.println(UserStatus.DELETE);
		System.out.println("---------------");
		
		// 2.
		for(UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
	}
}
