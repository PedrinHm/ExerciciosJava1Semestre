import java.util.Scanner;
public class Exerc4lista8 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i, meses=0;
	float carlos, joao;
	
	System.out.print("Digite o salário de Carlos: ");
	carlos = sc.nextFloat();
	joao = carlos/3;
	
	while(carlos>joao){
		carlos = (float)(carlos*1.02);
		joao = (float)(joao*1.05);
		meses++;
	}
	System.out.printf("Serão necessarios %d meses.",meses);
	}
}