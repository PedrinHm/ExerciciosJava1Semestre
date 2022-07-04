import java.util.Scanner;
public class Exerc4lista2 {
	public static void main(String args[]){
		double raio, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio da circunferência: ");
		raio = sc.nextFloat();
		
		area = 3.14159*(Math.pow(raio, 2));
		
		System.out.println("A area da circunferencia e: " + area);		
	}
}