import java.util.Scanner;
public class Exerc2lista2 {
		public static void main(String args[]){
		int a, b, aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Informe o valor A: ");
		a = sc.nextInt();
		System.out.println ("Informe o valor B: ");
		b= sc.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println ("valor de A: " + a + " valor de B: " + b);
			}

}
