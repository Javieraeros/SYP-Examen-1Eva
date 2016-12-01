package producto;
public class Producto {
	private int cod;
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Producto(int cod, String nombre, String descripcion, double precio) {
		this.cod = cod;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
