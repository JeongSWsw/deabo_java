
import java.util.Scanner;

public class MainEntry {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num = sc.nextInt();; 
		int bSize=0; 
		int[] answer = new int[num];
		int a=0,b=0; // X의 위치를 저장

		for (int k = 0; k < num; k++) {	
			bSize = sc.nextInt();
			char[][] ba = new char[bSize][bSize]; 
			for (int i = 0; i < bSize; i++) {
				for (int j = 0; j < bSize; j++) {
					ba[i][j] = sc.next().charAt(0);
					if(ba[i][j] == 'X') {
						a= i;
						b =j;
					}
						
				}
			}
			int x = a;
			int y = b;
			int cnt=0;
			
			while(x>=0) {
				if(ba[x][y] == 'H') {
					cnt++;
				}else if(ba[x][y] == 'Y') {
					break;
				}
				x--;
			}
			answer[k] += cnt/2;
			
			x = a;
			y = b;
			cnt=0;
			
			while(x<bSize) {
				if(ba[x][y] == 'H') {
					cnt++;
				}else if(ba[x][y] == 'Y') {
					break;
				}
				x++;
			}
			answer[k] += cnt/2;
			
			x = a;
			y = b;
			cnt=0;
			
			while(y>=0) {
				if(ba[x][y] == 'H') {
					cnt++;
				}else if(ba[x][y] == 'Y') {
					break;
				}
				y--;
			}
			answer[k] += cnt/2;
			
			x = a;
			y = b;
			cnt=0;
			
			while(y<bSize) {
				if(ba[x][y] == 'H') {
					cnt++;
				}else if(ba[x][y] == 'Y') {
					break;
				}
				y++;
			}
			answer[k] += cnt/2;
			
		}
		
		for (int i = 0; i < num; i++) {
			System.out.printf("#%d %d\n",i+1,answer[i]);
		}

	}
}
