
public class Arriendo {

	private Cliente cliente;
	private Vehiculo vehiculo;
	private String fechaInicio;
	private String fechaDevolucion;
	private int tarifaArriendo;
	
	public Arriendo(Cliente cliente, Vehiculo vehiculo, String fechaInicio,
			String fechaDevolucion, int tarifaArriendo) {
				
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaInicio = fechaInicio;
		this.fechaDevolucion = fechaDevolucion;
		this.tarifaArriendo = tarifaArriendo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public int getTarifaArriendo() {
		return tarifaArriendo;
	}

	public void setTarifaArriendo(int tarifaArriendo) {
		this.tarifaArriendo = tarifaArriendo;
	}


	}
	
		
	

