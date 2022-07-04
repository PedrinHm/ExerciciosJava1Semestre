import java.util.Scanner;
public class Exerc4_lista4 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int cod;
	float salario;
	System.out.printf("\nCódigo Cargo \n1 Escriturário \n2 Secretário  \n3 Caixa  \n4 Gerente  \n5 Diretor  \nDigite o código e seu salário em seguida: ");
	cod = sc.nextInt();
	salario = sc.nextFloat();
	
	switch (cod) {
			case 1:
			salario = salario+(salario*(float)0.5);
			System.out.println("O novo salário é: " + salario);
			break;
			case 2:
			salario = salario+(salario*(float)0.35);
			System.out.println("O novo salário é: " + salario);
			break;
			case 3:
            salario = salario+(salario*(float)0.2);
			System.out.println("O novo salário é: " + salario);
			break;
			case 4:
			salario = salario+(salario*(float)0.1);
			System.out.println("O novo salário é: " + salario);
			break;
			case 5:
			System.out.println("O salário continua o mesmo: " + salario);
			break;
			default:
			System.out.println("Código inválido");
	}
	
	
	
	}
}