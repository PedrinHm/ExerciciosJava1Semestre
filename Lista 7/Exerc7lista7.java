import java.util.Scanner;
public class Exerc7lista7 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i, nfun;
	String nome, nomebaixo= "a", nomealto= "a";
	float salario, media=0, salarioalto, salariobaixo;
	
	System.out.printf("Digite a quantidade de funcionários: ");
	nfun = sc.nextInt();
    System.out.printf("Digite o nome do funcionário, e, seguida o seu salário: ");
	nome = sc.next();
	salario = sc.nextFloat();
	salariobaixo = salario;
	salarioalto = salario;
	nomealto = nome;
	nomebaixo = nome;
	for(i = 1; i < nfun; i++){
		media += salario;
		System.out.printf("Digite o nome do funcionário, e, seguida o seu salário: ");
		nome = sc.next();
		salario = sc.nextFloat();
		
		if(salario>salarioalto){
			salarioalto = salario;
			nomealto = nome;
		}
		if(salario<salariobaixo){
			salariobaixo = salario;
		    nomebaixo = nome;	
		}
	}
	
	media = (float)media/nfun;
	System.out.printf("\nA média de salários é: %f \nA quantidade de funcionários é: %d \nO funcionário com salário mais alto é o "+nomealto+" com o salário: %f \nO funcionário com salário mais baixo é o "+nomebaixo+" com o salário: %f" ,media,nfun,salarioalto,salariobaixo);
	}
}