package producto;

import java.util.Vector;

import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductoCallBack implements Callback<Vector<Producto>>  {
	
	@Override
	public void onFailure(Call<Vector<Producto>> arg0, Throwable arg1) {
		int i;
		i=0;
		
	}

	@Override
	public void onResponse(Call<Vector<Producto>> arg0, Response<Vector<Producto>> resp) {
		Vector<Producto> productos;
		String contentType;
		int code;
		String message;
		boolean isSuccesful;
		
		productos=resp.body();
		Headers cabeceras = resp.headers();
		contentType = cabeceras.get("Content-Type");
		code = resp.code();
		message = resp.message();
		isSuccesful = resp.isSuccessful();
		
		
		System.out.println("Código             Nombre            Descripción               Precio");
		for(int i=0;i<productos.size();i++){
			System.out.println(productos.get(i).getCod()+"      "+productos.get(i).getNombre()+
					"        "+productos.get(i).getDescripcion()+"     "+productos.get(i).getPrecio());
		}
		
	}
    
}

