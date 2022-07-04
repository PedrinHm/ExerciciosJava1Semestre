import java.util.Scanner;
public class Exerc2{
	public static void main(String args[]){
		
		float salafim, salariobase, gratificacao, imposto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o salario base do funcionario? ");
		salariobase = sc.nextFloat();
		gratificacao = salariobase *(float) 0.05;
		imposto = salariobase *(float) 0.07;
		salafim = salariobase + gratificacao - imposto;
		System.out.println("O salario final e: " + salafim);
		
		
	}
	
}