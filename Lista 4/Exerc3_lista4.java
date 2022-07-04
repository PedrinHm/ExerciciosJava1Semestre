import java.util.Scanner;
public class Exerc3_lista4 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String cod;
	float preco, quant;
	
	System.out.printf("\nCódigo Preço  \n'ABCD' R$ 5,30\n 'XYPK' R$ 6,00 \n'KLMP' R$ 3,20 \n'QRST' R$ 2,50 \nDigite um código e depois a quantidade: ");
	cod = sc.nextLine();
	quant = sc.nextFloat();
	
	switch (cod) {
			case "ABCD":
			preco = (float)5.30*quant;
			System.out.println("Preço total: " + preco);
			break;
			case "XYPK":
			preco = (float)6.00*quant;
			System.out.println("Preço total: " + preco);
			break;
			case "KLMP":
			preco = (float)3.20*quant;
			System.out.println("Preço total: " + preco);
			break;
			case "QRST":
			preco = (float)2.50*quant;
			System.out.println("Preço total: " + preco);
			break;
			default:
			System.out.println("Código inválido");
	}
	
	
	
	}
}