import java.util.Scanner;
public class Exerc3lista2 {
	public static void main(String args[]){
	float degrau, altura_usuario, ndegraus;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual a altura de cada degrau? ");
    degrau = sc.nextFloat();
	System.out.println("Quala altura que o usuário deseja subir? ");
	altura_usuario = sc.nextFloat();
	ndegraus = altura_usuario/degrau;
	
	System.out.println("O número de degraus que se deve subir é: " + ndegraus);
			}

}
