package ar.edu.unju.fi.poo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Utilidad para el manejo de fechas y su formateo.
 * @author Oscar
 */
public class FechaUtil
{
	public static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	/**
	 * Recibe como parametro una fecha como cadena y devuelve un tipo Date.
	 * @param fechaString
	 * @return
	 */
	public static Date getFechaAsDate(String fechaString){
		try {
			return format.parse(fechaString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Recibe por parametro una fecha en formato date y devuelve un String.
	 * @param fecha
	 * @return
	 */
	public static String getFechaAsString(Date fecha){
		return format.format(fecha);
	}
	
	/**
	 * Devuelve la cantidad de años que lleva trabajando el empleado desde su ingreso.
	 * @param fechaDeAntiguedad
	 * @return
	 */
	public static Integer obtenerAntiguedad(Date fechaDeAntiguedad)
	{
		Calendar fechaCalendarAntiguedad = Calendar.getInstance();
		fechaCalendarAntiguedad.setTime(fechaDeAntiguedad);
		return Calendar.getInstance().get(1) - fechaCalendarAntiguedad.get(1)  ; // Se resta loa años
	}
}
