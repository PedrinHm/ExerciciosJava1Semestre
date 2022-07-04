import java.util.Scanner;
public class Exerc4Lista5 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a, b, c, d;	
System.out.printf("\nDigite quatro números: ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
d = sc.nextInt();

if ((a>b)&&(b>c)&&(c>d)){
	System.out.println("A ordem crescente é: "+ d + c + b + a);
}
if ((a>b)&&(b>d)&&(d>c)){
	System.out.println("A ordem crescente é: "+ c + d + b + a);
}
if ((a>c)&&(c>d)&&(d>b)){
	System.out.println("A ordem crescente é: "+ b + d + c + a);
}
if ((a>c)&&(c>b)&&(b>d)){
	System.out.println("A ordem crescente é: "+ d + b + c + a);
}
if ((a>d)&&(d>c)&&(c>b)){
	System.out.println("A ordem crescente é: "+ b + c + d + a);
}
if ((a>d)&&(d>b)&&(b>c)){
	System.out.println("A ordem crescente é: "+ c + b + d + a);
}
if ((b>a)&&(a>c)&&(c>d)){
	System.out.println("A ordem crescente é: "+ d + c + a + b);
}
if ((b>a)&&(a>d)&&(d>c)){
	System.out.println("A ordem crescente é: "+ c + d + a + b);
}
if ((b>c)&&(c>a)&&(a>d)){
	System.out.println("A ordem crescente é: "+ d + a + c + b);
}
if ((b>c)&&(c>d)&&(d>a)){
	System.out.println("A ordem crescente é: "+ a + d + c + b);
}
if ((b>d)&&(d>c)&&(c>a)){
	System.out.println("A ordem crescente é: "+ a + c + d + b);
}
if ((b>d)&&(d>a)&&(a>c)){
	System.out.println("A ordem crescente é: "+ c + a + d + b);
}
if ((c>a)&&(a>b)&&(b>d)){
	System.out.println("A ordem crescente é: "+ d + b + a + c);
}
if ((c>a)&&(a>d)&&(d>b)){
	System.out.println("A ordem crescente é: "+ d + b + a + c);
}
if ((c>b)&&(b>a)&&(a>d)){
	System.out.println("A ordem crescente é: "+ d + a + b + c);
}
if ((c>b)&&(b>d)&&(d>a)){
	System.out.println("A ordem crescente é: "+ a + d + b + c);
}
if ((c>d)&&(d>a)&&(a>b)){
	System.out.println("A ordem crescente é: "+ b + a + d + c);
}
if ((c>d)&&(d>b)&&(b>a)){
	System.out.println("A ordem crescente é: "+ a + b + d + c);
}
if ((d>a)&&(a>b)&&(b>c)){
	System.out.println("A ordem crescente é: "+ c + b + a + d);
}
if ((d>a)&&(a>c)&&(c>b)){
	System.out.println("A ordem crescente é: "+ b + c + a + d);
}
if ((d>b)&&(b>c)&&(c>a)){
	System.out.println("A ordem crescente é: "+ a + c + b + d);
}
if ((d>b)&&(b>a)&&(a>c)){
	System.out.println("A ordem crescente é: "+ c + a + b + d);
}
if ((d>c)&&(c>a)&&(a>b)){
	System.out.println("A ordem crescente é: "+ b + a + c + d);
}
if ((d>c)&&(c>b)&&(b>a)){
	System.out.println("A ordem crescente é: "+ a + b + c + d);
}
if ((a=b)&&(b=c)&&(c=d)){
	System.out.println("A ordem crescente é: "+ a  + b  + c + d)
	}
}
}