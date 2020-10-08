
public class MinhaApp {

	public static void main(String[] args) {
		//Observador 
		CarroPolicia carroPolicia = new CarroPolicia();
		
		//observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		//adicionar o observador ao observado
		
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.direita();

	}

}
