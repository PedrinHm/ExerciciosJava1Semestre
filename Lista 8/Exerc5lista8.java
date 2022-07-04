import java.util.Scanner;
public class Exerc5lista8 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i=0, m=0, n=1, soma=0;
	
	while(m<n){
	System.out.printf("\nDigite dois números: ");
	m = sc.nextInt();
	n = sc.nextInt();
     for(i=m; i<=n; i++){
		soma = soma+i;
	}
		System.out.printf("\nSoma: %d",soma);
		soma=0;
	}
    System.out.printf("\nFim da execução."); 
    
	}
}