import java.util.Scanner;
public class Exerc8Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int  voltas,angulo;

	System.out.printf("\nDigite o ângulo em graus: ");
	angulo = sc.nextInt();
	if(angulo<0)
		angulo=angulo*(-1);
	
	voltas = angulo/360;
	angulo = angulo%360;
	
	
	if((angulo==0)||(angulo==90)||(angulo==180)||(angulo==270)||(angulo==360)||(angulo==-90)||(angulo==-180)||(angulo==-270)||(angulo==-360)){
		System.out.printf("\nEstá sobre um dos eixos");
	}
		else if((angulo>0)&&(angulo<90)){
		System.out.printf("\nO ângulo está no primeiro quadrante.");
	}	
		else if(angulo<180){
		System.out.printf("\nO ângulo está no segundo quadrante.");
	}
		else if(angulo<270){
		System.out.printf("\nO ângulo está no terceiro quadrante.");
	}
	else if(angulo<360){
		System.out.printf("\nO ângulo está no quarto quadrante.");
	}

	
	System.out.printf("Total de voltas: "+voltas);

	

	
	
	
		
	}
	}