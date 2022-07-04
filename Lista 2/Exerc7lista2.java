import java.util.Scanner;
public class Exerc7lista2 {
	public static void main(String args[]){
	double angulo, parede, escada;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual o ângulo(em graus) entre a escada e o chão: ");
	angulo = sc.nextFloat();
	System.out.println("qual a altura da parede: ");
	parede = sc.nextFloat();
	
	angulo = Math.toRadians(angulo);
	escada = parede/Math.sin(angulo);
	
	System.out.println("A altura da escada é: " + escada);
	}
	
}
	
	
	