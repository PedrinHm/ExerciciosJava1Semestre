public class Exerc2lista7 {
	public static void main(String args[]){
    int i;
	float j;
	
	for (i = 0; i < 1000; i++){
		j = i;
		j = j % 7;
	    if(j==0){
			System.out.println(i);
	}		
	}
	}
}