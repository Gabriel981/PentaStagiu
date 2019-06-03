import java.util.Scanner;

public class TriunghiPascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numarul de linii: ");
		number = scan.nextInt();
		for(int i=0; i<number; i++) {
			int val =1;
			System.out.printf("%"+(number-i)*2+"s" ,"");
			for(int j=0; j<=i;j++) {
				System.out.printf("%4d", val);
				val=val*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
