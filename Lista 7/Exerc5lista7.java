import java.util.Scanner;
public class Exerc5lista7 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
   	int i, x, qnt = 0;
		
		System.out.print("Digite um valor: ");
		x = sc.nextInt();
		for (i = 1; i <= x; i++){
			if (x % i == 0)
				qnt++;
		}
		if (qnt == 2)
			System.out.print("O valor é primo.");
		else
			System.out.print("O valor não é primo.");
	}
}
