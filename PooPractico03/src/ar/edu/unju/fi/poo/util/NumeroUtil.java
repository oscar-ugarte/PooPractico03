package ar.edu.unju.fi.poo.util;

public class NumeroUtil
{
	public static Integer CANTIDAD_DIGITOS_LEGAJO = 11; //Se va usar para armar la cadena con el numero de legajo y ceros.
	
	/**
	 * Recibe un entero como parametro junto a la cantidad de digitos que quiere completar
	 * con ceros. Devueve una cadida que incluye el legajo y el resto ceros.
	 * @param legajo
	 * @param longitud
	 * @return
	 */
	public static String rellenarLegajoConCeros(Integer legajo, Integer cantidadDeDigitos)
	{
		String legajoConCeros = "" ;
		for( Integer i = 1; i <= cantidadDeDigitos - legajo.toString().length() ; i++ )
		{
			legajoConCeros = legajoConCeros + "0";
		}
		return legajoConCeros + legajo.toString();
	}

	/**
	 * Recibe un importe de tipo double y devuelve una cadena sin la pare decimal.
	 * @param importe
	 * @return
	 */
	public static String redondearImporte(Double importe)
	{
		return String.format ("%.0f", importe) ; 
	}
	
	
}
