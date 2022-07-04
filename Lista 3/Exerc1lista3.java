import java.util.Scanner;
public class Exerc1lista3 {
	public static void main(String args[]){
	float salario, salario25;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual o salário do funcionário?");
	salario = sc.nextFloat();
	
	salario25 = (float)(salario*1.25);
	
	System.out.println("O novo salário é: " + salario25);
	}
}
