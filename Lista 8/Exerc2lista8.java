public class Exerc2lista8 {
	public static void main(String args[]){
	float chico , ze;
	int i, ano=0;
	ze = (float)1.10;
	chico=(float)1.50;
	do{
		chico = (float)(chico+0.02);
		ze = (float)(ze+0.03);
		ano++;
	}
	while(chico>ze);
	System.out.printf("Serão necessarios %d anos.\nAltura do Zé: %f \nAltura do chico: %f",ano,ze,chico);
	}
}