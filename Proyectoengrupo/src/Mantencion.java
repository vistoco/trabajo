
public class Mantencion {

	private Proveedores proveedores;
	private Vehiculo vehiculo;
	private String fechaInicio;
	private String fechaSalida;
	
	
	public Mantencion(Proveedores proveedores, Vehiculo vehiculo, String fechaInicio, String fechaSalida) {
		
		this.proveedores = proveedores;
		this.vehiculo = vehiculo;
		this.fechaInicio = fechaInicio;
		this.fechaSalida = fechaSalida;
	}


	public Proveedores getProveedores() {
		return proveedores;
	}


	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
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


	public String getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	
}
