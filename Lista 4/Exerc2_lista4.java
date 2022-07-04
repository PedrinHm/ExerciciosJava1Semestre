import java.util.Scanner;
public class Exerc2_lista4 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float numero;
	int cod;
	numero = 1;
	System.out.printf("\nCódigo Operação \n101 – Raiz quadrada \n102 – A metade \n103 – 10 porcento do número \n104 – O dobro \nEscolha uma operação e em seguida dê um número: ");
	cod = sc.nextInt();
	numero = sc.nextFloat();
	switch (cod) {
			case 101:
			numero = (float)Math.sqrt(numero);
			System.out.println("Raiz quadrada: " + numero);
			break;
			case 102:
			numero = (float)numero/2;
			System.out.println("A metade: " + numero);
			break;
			case 103:
			numero = numero*(float)0.1;
			System.out.println("10% do número: " + numero);
			break;
			case 104:
			numero = (float)numero*2;
			System.out.println("O dobro do número: " + numero);
			break;
			default:
			System.out.println("Código inválido");
	}
	}
}