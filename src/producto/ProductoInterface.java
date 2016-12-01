package producto;

import java.util.Vector;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ProductoInterface {

	@GET("pF8JXVuUVrYQsg2WXtjT/")
	Call<Vector<Producto>> getProducto();

	@GET("pF8JXVuUVrYQsg2WXtjT/")
	Call<Vector<Producto>> getProductoPrecio (@Query("preciomin") double precio,@Query("preciomax") double preciomax);

	@GET("pF8JXVuUVrYQsg2WXtjT/")
	Call<Vector<Producto>> getProductoLetra(@Query("letra") char letra);
	

	
}
