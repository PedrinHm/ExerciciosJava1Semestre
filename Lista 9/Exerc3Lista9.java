import java.util.Scanner;
public class Exerc3lista9 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    int i, contador, acum=1, n, n1=0;
    
	System.out.println("Digite a quantia de números que serão lidos: ");
    contador = sc.nextInt();

     for(i=1; i<=contador; i++){
	 	n=0;
        n1 = 0;
		acum = 1;
		
        System.out.printf("\nConta Nº %d \nDigite um número: ",i);
        n = sc.nextInt();
		n1=n;
     while(acum!=n){

		n1=n1*acum;
     	acum++;
	 }
	 System.out.printf("\nO fatorial de %d é %d.\n\n---------------------",n,n1);
	 }
	System.out.println("\n\nFim da execução do programa.");
    }
}