package clases;

public class Producto {
	//Atributos privados
	private int codigoProducto;
	private String nombre;
	private double precio;
	private int stockActual;
	private int stockMinimo;
	private int stockMaximo;
	
	//Constructor
	public Producto(int codigoProducto, String nombre, double precio, int stockActual, int stockMinimo,
			int stockMaximo) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
		this.stockMaximo = stockMaximo;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Getters y Setters de los atributos privados
	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	
	
	
}
