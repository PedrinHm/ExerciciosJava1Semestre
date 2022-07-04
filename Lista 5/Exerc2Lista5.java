import java.util.Scanner;
public class Exerc2Lista5 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float salarioatual, novosalario;

System.out.println("Escreva o sálario atual: ");
salarioatual = sc.nextFloat();

if(salarioatual<=1500){
	novosalario = (float)(salarioatual+(salarioatual*0.15));
System.out.println("O novo sálario é: "+ novosalario);}
    if (salarioatual>1500 && salarioatual<1751){
	     novosalario = (float)(salarioatual+(salarioatual*0.12));
	     System.out.println("O novo sálario é: "+ novosalario);}
		 if (salarioatual>1750 && salarioatual<2001){
			novosalario = (float)(salarioatual+(salarioatual*0.1));
		    System.out.println("O novo sálario é: "+ novosalario);}
			if (salarioatual>2000 && salarioatual<3001){
				novosalario = (float)(salarioatual+(salarioatual*0.07));
			    System.out.println("O novo sálario é: "+ novosalario);}
				if (salarioatual>=3000){
					novosalario = (float)(salarioatual+(salarioatual*0.05));
				    System.out.println("O novo sálario é: "+ novosalario);}
			
	}
}