import java.util.Scanner;
public class Exerc1lista7 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i, num, positivos=0, negativos=0;
	
	for(i = 0; i < 50; i++) {
		System.out.printf("\nDigite um número: ");
		num = sc.nextInt();
		
		if(num < 0)
			negativos++;
		else 
			positivos+= num;
	}
    System.out.printf("\nA soma dos números positivos é: %d \nA quantidade de números negativos é: %d \nQuantidade de números lidos: %d" ,positivos,negativos,i);
	
	
	}
}