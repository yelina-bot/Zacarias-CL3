package org.CL3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mascota")
public class Mascota {

	@Id
	@Column(name = "id_mascota")
	private int idMascota;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "codigo_tipo")
	private int tipo;
	
	@Column(name = "peso")
	private double peso;

	@Column(name = "fecha_Nacimiento")
	private String fechaNacimiento;

	public Mascota() {
		super();
	}

	public Mascota(int idMascota, String nombre, int tipo, double peso, String fechaNacimiento) {
		super();
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.tipo = tipo;
		this.peso = peso;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
