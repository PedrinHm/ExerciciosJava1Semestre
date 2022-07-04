import java.util.Scanner;
public class Avaliacao2 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float a, b, c;
	int i;
	
	System.out.printf("\n1 \ta,b e c e, ordem crescente. \n2 \ta,b e c em ordem decrescente. \n3 \tO maior fica entre os outros números. \n Digite o código: ");
	i = sc.nextInt();
	
	System.out.printf("\nDigite três números diferentes: ");
	a = sc.nextFloat();
	b = sc.nextFloat();
	c = sc.nextFloat();
	
	switch(i){
		case(1):
		if((a<b)&&(a<c)){
			if(b<c){
				System.out.println("A ordem crescente é: "+a+" "+b+" "+c);
			}
		     else{
			    System.out.println("A ordem crescente é: "+a+" "+c+" "+b);
		    }
		}
		if((b<a)&&(b<c)){
			if(a<c){
				System.out.println("A ordem crescente é: "+b+" "+a+" "+c);
			}
			else{
				System.out.println("A ordem crescente é: "+b+" "+c+" "+a);
			}
			
		}
		if((c<a)&&(c<b)){
			if(a<b){
				System.out.println("A ordem crescente é: "+c+" "+a+" "+b);
			}
			else{
				System.out.println("A ordem crescente é: "+c+" "+b+" "+a);
			}
		}	
		break;
		case(2):
		if((a>b)&&(a>c)){
			if(b>c){
				System.out.println("A ordem decrescente é: "+a+" "+b+" "+c);
			}
			else{
			    System.out.println("A ordem decrescente é: "+a+" "+c+" "+b);
			}
		}
		if((b>a)&&(b>c)){
			if(a>c){
				System.out.println("A ordem decrescente é: "+b+" "+a+" "+c);
			}
			else{
				System.out.println("A ordem decrescente é: "+b+" "+c+" "+a);
			}
		}
		if((c>a)&&(c>b)){
			if(a>b){
				System.out.println("A ordem decrescente é: "+c+" "+a+" "+b);
			}
			else{
				System.out.println("A ordem decrescente é: "+c+" "+b+" "+a);
			}
		}	
        break;
		case(3):
		if((a>b)&&(a>c)){
		    System.out.println("maior fica entre os outros números: "+b+" "+a+" "+c);
		}
	    if((b>a)&&(b>c)){
		    System.out.println("maior fica entre os outros números: "+a+" "+b+" "+c);
		}
        if((c>a)&&(c>b)){
			System.out.println("maior fica entre os outros números: "+a+" "+c+" "+b);
		}
		break;
		default:
		    System.out.println("Código invalido");
	}
	}
}