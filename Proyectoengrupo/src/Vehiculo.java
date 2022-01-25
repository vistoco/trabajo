
public class Vehiculo implements Iejemplo {
 
	private String tipo;
	private String patente;
	private String color;
	private String marca;
	
	public Vehiculo(String tipo, String patente, String color, String marca) {
		
		this.tipo = tipo;
		this.patente = patente;
		this.color = color;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String mostrarDatos() {

	return "Tipo de vehiculo: " + tipo+
	"\n Patente: " + patente +
	"\nColor: " + color +
	"\n Marca: "+ marca;
	}
}