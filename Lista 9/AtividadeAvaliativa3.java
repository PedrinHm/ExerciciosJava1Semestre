import java.util.Scanner;
public class AtividadeAvaliativa3 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int opcao=0, nmeses;
	float salario, ferias, ferias1;
	
	while(opcao!=4){
		System.out.printf("\nMenu de opções \n1. Novo salário \n2. Férias \n3. Décimo  terceiro \n4. Sair \nDigite o número da opção: ");
		opcao = sc.nextInt();
		salario = 0;
		ferias =0;
		switch(opcao){
			case(1):
				System.out.printf("Digite o salário: ");
				salario = sc.nextFloat();
	
				if(salario<=210)
					salario *=1.15;
				else if(salario<=600)
					salario *=1.1;
				else
					salario*=1.05;
					System.out.printf("O novo salário é %f.",salario);
			break;
			case(2):
				System.out.printf("Digite o salário para saber o valor de suas férias: ");
				ferias = sc.nextFloat();
				ferias1=ferias/3;
				ferias+=ferias1;
				System.out.printf("O valor das férias é: %f",ferias);
			break;
			
			case(3):
				System.out.printf("Digite o salário do funcionario: ");
				salario = sc.nextFloat();
				System.out.printf("Digite o número de meses de trabalho na empresa: ");
				nmeses = sc.nextInt();
			
				if(nmeses<13)
				salario*=nmeses;
				else
				System.out.printf("número de meses invalido.");
			
				System.out.printf("O decimo terceiro desse funcionario é: %f",salario);
			break;
			case(4):
				System.out.printf("Programa finalizado.");
			break;
			default:
			    System.out.printf("Codigo invalido");				
			}
		}
	}
}