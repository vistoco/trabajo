
public class ControlFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------------------------------");
		System.out.println("Control de Flota Los Copihues");
		System.out.println("------------------------------");
		
		
		
		Vehiculo vehiculo1 = new Vehiculo("Sedan ", "xs-4545 ", "Rosa ", "Chevrolet ");
		Vehiculo vehiculo2 = new Vehiculo("Furgon ", "zz-df78 ", "Rojo ", "Kia ");
		Vehiculo vehiculo3 = new Vehiculo("Camion ", "kaka-01 ", "Azul ", "Nissan ");
		Vehiculo vehiculo4 = new Vehiculo("Pick-up ", "lp-4545 ", "Fucsia ", "Ferrari ");
		Vehiculo vehiculo5 = new Vehiculo("Moto ", "ss-1565 ", "Azul ", "Diabel ");
		Vehiculo vehiculo6 = new Vehiculo("MotorHome ", "xx-1000 ", "Blanco ", "Travel ");
		
		System.out.println("\nLos vehiculos que se encuentran disponibles son: \n\n"  + "-" + "Tipo: " + vehiculo5.getTipo() + "\n" + "-" + "Patente: " + vehiculo5.getPatente() + "\n" + "-" + "Color: " + vehiculo5.getColor() + "\n" + "-" + "Marca: " + vehiculo5.getMarca() + "\n" + "----------" + "\n" +  "-" + "Tipo: " + vehiculo6.getTipo() + "\n" +"-" + "Patente: " + vehiculo6.getPatente() + "\n" + "-" + "Color: "+ vehiculo6.getColor() + "\n" + "-" + "Marca: "+ vehiculo6.getMarca());
		
		Cliente cliente1 = new Cliente(vehiculo1, "Pedro ", "15895624-1" , 35, "Los arrayanes 100" , 56464854, "Cheque");
		Cliente cliente2 = new Cliente(vehiculo2, "Pepe ", "15894524-1" , 55, "Los alcones 500" , 53464854, "Pagare");
		
		System.out.println("----------------------------------------------");
		
		System.out.println("\nClientes con vehiculos arrendados:\n \n" + "-" + "Nombre: " +  cliente1.getNombre() + "\n" + "-" + "Rut: " + cliente1.getRut() + "\n" + "-" + "Edad: " + cliente1.getEdad() + "\n" + "-" + "Direccion: " + cliente1.getDireccion() + "\n" + "-" + "Telefono: " + cliente1.getTelefono() + "\n" + "-" + "Documento: " + cliente1.getDocumentoGarantia() + "\n" + "-" + "Patente: " + vehiculo1.getPatente());
				
		Proveedores proveedor1 = new Proveedores("Papelucho ", "76456124-5" , 57548575);		
		
		Mantencion mantencion1 = new Mantencion(proveedor1, vehiculo6, "22-06-2022", "22-07-2022");
				
		System.out.println("----------------------------------------------");
		
		System.out.println("\nProveedor con vehiculo en mantencion: \n\n" + "-" + "Nombre empresa: " + proveedor1.getNombreEmpresa() + "\n" + "-" + "Rut: " + proveedor1.getRut() + "\n" + "-" + "Telefono: " + proveedor1.getTelefono() + "\n" + "-" + "Patente: " + vehiculo2.getPatente() + "\n" + "-" + "Fecha Inicio: " + mantencion1.getFechaInicio()+ "\n" + "-" + "Fecha Salida: " + mantencion1.getFechaSalida());
				
		Arriendo arriendo1 = new Arriendo(cliente1, vehiculo4, "21-05-2022" , "21-06-2022" , 1000000); 
		Arriendo arriendo2 = new Arriendo(cliente2, vehiculo3, "12-06-2022" , "25-06-2022" , 525000);
		
	
		System.out.println("----------------------------------------------");
		
		System.out.println("\nEstado de vehiculos en arriendo:\n \n" + "\n" + "-" + "Cliente: " + cliente2.getNombre() + "\n" + "-" + "Fecha inicio: " + arriendo2.getFechaInicio() + "\n" + "-" + "Fecha Termino: " + arriendo2.getFechaDevolucion() + "\n" + "-" + "Tarifa: " + arriendo2.getTarifaArriendo() + "\n" + "-" + "patente: " + vehiculo3.getPatente() + "\n" + "----------------------------" + "\n" + "-" + "Cliente: " + cliente2.getNombre() + "\n" + "-" + "Fecha Inicio: " + arriendo1.getFechaInicio() + "\n" + "-" + "Fecha Termino: " + arriendo1.getFechaDevolucion() + "\n" + "-" + "Tarifa: " + arriendo1.getTarifaArriendo() + "\n" + "-" + "Patente: " + vehiculo4.getPatente());		
		
		Vehiculo p = new Vehiculo("Sedan ", "xs-4545 ", "Rosa ", "Chevrolet ");
		mostrardato(p);
	}
		public static void mostrardato(Iejemplo c)
		{
		c.mostrarDatos();
		
		System.out.println("--------------Interfaz-------------------");
		
		System.out.println(c.mostrarDatos());
		
		}
		
	}

