import java.util.Scanner;

public class Board_Moves {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++)
		{
			long sum = 0;
			int n = sc.nextInt();
			
			for(int i=0;i<=n/2;i++) {
				sum += 8*i*i;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
