import java.util.Scanner;
public class Exerc3lista8 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int cod=0;
	float hora, salariob, salariol;
	char sexo;
	while(cod!=99999){
	System.out.println("Digite o Código: ");
	cod = sc.nextInt();
	System.out.println("Digite o sexo do professor(M – masculino; F – feminino): ");
	sexo = sc.next().charAt(0);;
	System.out.println("Digite o número de horas/aula mensal: ");
	hora = sc.nextFloat();
	
	salariob = hora*30;
	salariol = salariob;
	if(sexo=='f')
		salariol = (float)(salariol*1.05);
	else if(sexo=='m')
		salariol = (float)(salariol*1.1);
	System.out.printf("\nCódigo: %d \nSalário bruto: %f \nSalário liquido: %f",cod,salariob,salariol);
	}
	System.out.println("fim.");
	}
}