import java.util.Scanner;
public class Exerc7TLista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int hinicio, hfim, minicio, mfim, dhora, dminuto;

	System.out.printf("Hora de ínicio: ");
	hinicio = sc.nextInt();
	System.out.printf("Minuto inicial: ");
	minicio = sc.nextInt();
	System.out.printf("hora final: ");
	hfim = sc.nextInt();
	System.out.printf("Minuto final: ");
	mfim = sc.nextInt();
	
	if(minicio>mfim){
		mfim = mfim+60;
		hfim = hfim-1;
	}
	if(hinicio>hfim){
		hfim = hfim+24;
	}
	dminuto = mfim-minicio;
	dhora = hfim-hinicio;
	
	System.out.printf("O jogo durou "+dhora+"horas e "+dminuto+" Minutos.");
	}
	}
	
	
