import java.util.Scanner;
public class Exerc1_lista4 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    float quant, result;
    int cod;	
	result = 1;
	System.out.printf("\n código preço\n1001 5,32 \n1324 6,45 \n6548 2,37 \n987 5,32 \n7623 6,45 \nDigite o código do produto e em seguida a quantidade: ");
	cod = sc.nextInt();
	quant = sc.nextFloat();	
		switch (cod) {
			case 1001:
			result = (float)5.32*quant;
			break;
			case 1324:
			result = (float)6.45*quant;
			break;
			case 6548:
			result = (float)2.37*quant;
			break;
			case 987:
			result = (float)5.32*quant;
			break;
			case 7623: 
			result = (float)6.45*quant;
			default:
			result = (float)0.00;
			System.out.println("Código inválido");
			
			
		}
	System.out.printf("preço total: " + result);
		}
		

}

	