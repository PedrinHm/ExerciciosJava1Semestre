public class Exerc6lista7 {
	public static void main(String args[]){
	int i , a=1 , b=1 , c=0; 
	System.out.printf("\n %d \t%d \t%d" ,a,b,c);
	for(i=1; i<31; i++){
		a = b;
		b = c;
		c = a + b;
		System.out.printf("\n %d \t%d \t%d" ,a,b,c);
	}
	}
}