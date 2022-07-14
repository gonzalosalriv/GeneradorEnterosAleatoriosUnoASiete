import java.util.Random;

public class Main
{
    public static final int NUM_ITERACIONES = 1000; //Define el número de iteraciones del programa
    public static int[] listaContadorDeResultados; //Almacena el número de veces que se genera cada resultado
    
    public static void main(String[] args) {
		listaContadorDeResultados = new int[7];
		
		//Test unitario del programa
		unitaryTest();
		
		System.out.println("Histograma: ");  
		for(int i=0; i<7; i++){
		    System.out.println(i+1 + " ha aparecido: " + listaContadorDeResultados[i] + " veces");
		}
	}
	
	
	/////////////////////////////////////////////////////////////
	
	public static int generateRandomIntegerOneToFive() {
		Random rnd = new Random();
		int numeroGenerado=(int) (rnd.nextDouble()*5+1);
		
		return numeroGenerado;
	}
	
	public static int generateRandomIntegerOneToSeven() {
		int sumaDeAleatorios=0;
		int numeroGenerado;
		
		//Suma numeros aleatorios del 1 al 5 durante 7 iteraciones
		for(int i=0; i<7; i++) {
			sumaDeAleatorios = sumaDeAleatorios + generateRandomIntegerOneToFive();
		}
		
		numeroGenerado = 1+sumaDeAleatorios%7;		
		
		return numeroGenerado;
	}

	//Cuenta el número de veces que se genera cada uno de los resultados y lo almacena en el array que cuenta los resultados
	public static void resultsCounter(int valorGenerado){
		switch(valorGenerado) {
				case 1:
					listaContadorDeResultados[0]++;
					break;
				case 2:
					listaContadorDeResultados[1]++;
					break;
				case 3:
					listaContadorDeResultados[2]++;
					break;
				case 4:
					listaContadorDeResultados[3]++;
					break;
				case 5:
					listaContadorDeResultados[4]++;
					break;
				case 6:
					listaContadorDeResultados[5]++;
					break;
				case 7:
					listaContadorDeResultados[6]++;
					break;
					
				default:
			}
	}
	
	//Invoca a las funciones de generar enteros y almacenarlos en el array contador un número de veces definido por NUM_ITERACIONES
	public static void unitaryTest (){
	    int valorGenerado;
	    
		for(int i=0; i<NUM_ITERACIONES; i++) {
			valorGenerado=generateRandomIntegerOneToSeven();
			resultsCounter(valorGenerado);
		}
	}
	
}

