package producto;

import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import okio.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;





/***************************************
 * SE PUEDEN DESCARGAR JARS DE CONVERTIDORES DE AQUÍ:
 * http://search.maven.org/
 * 
 * Por ejemplo:
 * http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.squareup.retrofit2%22
 * 
 * Si usamos gradle, simplemente añadiríamos la dependencia:
 * com.squareup.retrofit2:converter-gson/home/migue/Descargas/converter-gson-2.1.0.jar
 *
 */



public class Principal {
	
	//Cambiar por el servidor donde quieres probar.
	private final static String SERVER_URL = "http://examen.dev/";
	

	public static void main(String[] args) {
		
		Retrofit retrofit;
		int opcion;
		char letra;
		double preciomin,preciomax;
		Scanner teclado=new Scanner(System.in);
		ProductoCallBack productoCallBack = new ProductoCallBack();
		
		retrofit = new Retrofit.Builder()
							   .baseUrl(SERVER_URL)
							   .addConverterFactory(GsonConverterFactory.create())
							   .build();
		
		ProductoInterface productoInter = retrofit.create(ProductoInterface.class);
		System.out.println("Que desea hacer?");
		System.out.println("1.Mostrar todos los productos.");
		System.out.println("2.Mostrar todos los productos que empiezen por una letra.");
		System.out.println("3.Mostrar todos los productos en un rango de precios.");
		opcion=Integer.parseInt(teclado.nextLine());
		
		switch(opcion){
		case 1:
			productoInter.getProducto().enqueue(productoCallBack);
			break;
		case 2:
			System.out.println("Introduce la letra:");
			letra=teclado.nextLine().charAt(0);
			productoInter.getProductoLetra(letra).enqueue(productoCallBack);
			break;
		case 3:
			System.out.println("Introduce el precio mínimo");
			preciomin=Double.parseDouble(teclado.nextLine());
			System.out.println("Introduce le precio máximo");
			preciomax=Double.parseDouble(teclado.nextLine());
			productoInter.getProductoPrecio(preciomin, preciomax).enqueue(productoCallBack);
			break;
		}
		
		

	}


	


}
