
public class Cliente {

	private Vehiculo vehiculo;
	private String nombre;
	private String rut;
	private int edad;
	private String direccion;
	private int telefono; 
	private String documentoGarantia;
	
	public Cliente(Vehiculo vehiculo, String nombre, String rut, int edad, String direccion, int telefono, String documentoGarantia) {
		
		this.vehiculo = vehiculo;
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.documentoGarantia = documentoGarantia;
		
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDocumentoGarantia() {
		return documentoGarantia;
	}

	public void setDocumentoGarantia(String documentoGarantia) {
		this.documentoGarantia = documentoGarantia;
	}

	
	
}
