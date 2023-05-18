
public class principal {

	public static void main(String[] args) {
		holaMundo("Hola Mundo XD");	
		holaMundo("Empanada");
		holaMundo("Completo");
		
		for(int i = 0; i < 10; i++){
			printMessage("Hola Mundo " + i+2);	
		}
	}

	public static void holaMundo(String value) {
		System.out.println(value + 2);
	}

	public static void printMessage(String value) {
		System.out.println(value);
	}
	
}
