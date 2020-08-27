package ar.edu.unju.fi.poo.dominio;

import java.util.Date;
import ar.edu.unju.fi.poo.util.*;

/**
 * Esta es la clase para los empleados
 * @author Oscar
 * @version 1.0
 * @since 27/08/2020
 */
public class Empleado
{
	private static Integer nextId = 99;
	private Integer id;
	private Integer legajo;
	private String dni;
	private String nombre;
	private Date fechaDeIngreso;
	private Double salario;
	private Integer antiguedad;
	
	
	public Empleado()
	{
		this.fechaDeIngreso = new Date();
	}


	public Empleado(Integer legajo, String dni, String nombre, Date fechaDeIngreso, Double salario,
			Integer antiguedad) 
	{
		nextId++;
		this.id = nextId;
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeIngreso = fechaDeIngreso;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getLegajo() {
		return legajo;
	}


	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}


	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Integer getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public String toString() {
		return  "Legajo = " + NumeroUtil.rellenarLegajoConCeros(this.getLegajo(), NumeroUtil.CANTIDAD_DIGITOS_LEGAJO) + " - " +
		"Dni=" + this.getDni() + " - Nombre=" + this.getNombre() + " - Fecha de Ingreso=" + FechaUtil.getFechaAsString(this.getFechaDeIngreso()) +
		" - Salario=" + NumeroUtil.redondearImporte(this.getSalario()) + " - Antiguedad=" + this.getAntiguedad() + " años." 
		;
	}
	
	
	
	
}
