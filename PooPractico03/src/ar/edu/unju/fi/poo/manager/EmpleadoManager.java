package ar.edu.unju.fi.poo.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unju.fi.poo.dominio.Empleado;

/**
 * Esta clase permite gestionar a todos los objetos del tipo Empleado.
 * @author Oscar
 */
public class EmpleadoManager
{
	private static List<Empleado> listaDeEmpleados = new ArrayList<Empleado>(); //La lista de empleados principal
	private static List<Empleado> segundaListaDeEmpleados = new ArrayList<Empleado>(); //La segunda lista para el punto 5.
	
	/**
	 * Genera 6 Empleados y los carga a la <code>Collection Empleado</code>
	 */
	public static void generarEmpleados() {
		Empleado e1 = new Empleado(100,"34600001","Oscar Ugarte",new Date(), 20000.00, 2);
		Empleado e2 = new Empleado(101,"34600002","Maria Perez",new Date(), 25000.00, 4);
		Empleado e3 = new Empleado(102,"34600003","Marcos Torres",new Date(), 30000.00, 2);
		Empleado e4 = new Empleado(1000,"34600004","Maria Fernandez",new Date(), 50000.00, 7);
		Empleado e5 = new Empleado(1001,"34600005","Augusto Cruz",new Date(), 28000.00, 3);
		Empleado e6 = new Empleado(1002,"34600006","Maria Flores",new Date(), 35000.00, 2);
		listaDeEmpleados.add(e1);
		listaDeEmpleados.add(e2);
		listaDeEmpleados.add(e3);
		listaDeEmpleados.add(e4);
		listaDeEmpleados.add(e5);
		listaDeEmpleados.add(e6);
	}	
	
	/**
	 * Agrega un nuevo empleado a la segunda lista de empleados.
	 * @param lista
	 * @param nuevoEmpleado
	 * @return
	 */
	public static void agregarUnEmpleado( Empleado nuevoEmpleado )
	{
		segundaListaDeEmpleados.add(nuevoEmpleado);
	}

	/**
	 * Elimina un empleado perteneciente a la lista de empleados del manager.
	 * @param lista
	 * @param empleadoEliminado
	 * @return
	 */
	public static void quitarUnEmpleado(Empleado empleadoEliminado )
	{
		listaDeEmpleados.remove(empleadoEliminado);
	}	
	
	/**
	 * Muestra la lista primera lista de empleados del manager.
	 */
	public static void mostrarPrimeraListaDeEmpleados()
	{
		for(Empleado empleado: listaDeEmpleados)
		{
			System.out.println(empleado);
		}
	}
	
	/**
	 * Muestra la lista segunda lista de empleados del manager.
	 */
	public static void mostrarSegundaListaDeEmpleados()
	{
		for(Empleado empleado: segundaListaDeEmpleados)
		{
			System.out.println(empleado);
		}
	}	
	
	/**
	 * Muestra el contenido de la primera lista pasada por parametro.
	 * @param lista
	 */
	public static void mostrarEmpleados(List<Empleado> lista )
	{
		for(Empleado empleado: lista)
		{
			System.out.println(empleado);
		}
	}
	
	/**
	 * Muestra los empleados de la lista del manager que tengan una
	 * antiguedad mayor a la pasada por parametros.
	 * @param antiguedad
	 */
	public static void mostrarEmpleadosPorAntiguedad(Integer antiguedad)
	{
		for(Empleado empleado: listaDeEmpleados) {
			if( empleado.getAntiguedad() > antiguedad )
				System.out.println(empleado);
		}
	}
	
	
	/**
	 * Busca un empleado por su numero de documento.
	 * Si lo encuentra devuelve ese empleado sino devuelve null. 
	 * @param nombre
	 * @return
	 */
	public static Empleado buscarPorDni(String dni) {
		for(Empleado empleado: listaDeEmpleados) {
			if(empleado.getDni().equals(dni))
				return empleado;
		}
		return null;		
	}
	
	/**
	 * Busca los empleados que cumplan con un valor en su nombre y devuelve una lista
	 * con los empleados que coinciden.
	 * @param valorDelNombre
	 * @return
	 */
	public static List<Empleado> buscarEmpleadosPorNombre( String valorDelNombre )
	{
		List<Empleado> listaEmpleadosEncontrados = new ArrayList<Empleado>();
		for(Empleado empleado : listaDeEmpleados)
		{
			if (empleado.getNombre().contains( valorDelNombre ) )
			{
				listaEmpleadosEncontrados.add(empleado);
			}
		}
		return listaEmpleadosEncontrados;
	}
	
	/**
	 * Obtiene la sumatoria de los salarios de los empleados que cumplen con una antiguedad
	 * mayor a la pasada por parametro.
	 * @param antiguedad
	 * @return
	 */
	public static Double obtenerSumatoriaDeSalariosPorAntiguedad(Integer antiguedad)
	{
		Double sumatoriaDeSalarios = 0.0 ;
		for(Empleado empleado : listaDeEmpleados)
		{
			if(empleado.getAntiguedad() > antiguedad)
				sumatoriaDeSalarios = sumatoriaDeSalarios + empleado.getSalario() ;
		}
		return sumatoriaDeSalarios;
	}
	
	/**
	 * Devuelve el promedio de los salarios de la lista pasada por parametros.
	 * @param lista
	 * @return
	 */
	public static Double obtenerPromedioDeLosSalarios( List<Empleado> lista )
	{
		Double promedio = 0.0 ;
		for(Empleado empleado : lista)
		{
			promedio = promedio + empleado.getSalario();
		}
		return promedio / lista.size();
	}
	
	/**
	 * Devuelve el promedio de los salarios de la lista completa de empleados.
	 * @return
	 */
	public static Double obtenerPromedioDeLosSalariosDeTodosLosEmpleados( )
	{
		Double promedio = 0.0 ;
		for(Empleado empleado : listaDeEmpleados)
		{
			promedio = promedio + empleado.getSalario();
		}
		return promedio / listaDeEmpleados.size();
	}
}
