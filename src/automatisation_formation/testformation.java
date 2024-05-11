package automatisation_formation;

public class testformation {
	
	static int addition;
	static int resultat;
	int a;
	int b;
	
	public static void main(String[] args ) {

		resultat=calculSomme(5,8);
		System.out.print(resultat);

	}
	
	
	public static int calculSomme(int number1 , int number2){
		
		addition=number1+number2;
		return addition;
		
	}
	
	

}
