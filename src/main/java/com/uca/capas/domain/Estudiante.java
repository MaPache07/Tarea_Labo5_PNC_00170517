package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cUsuario;
	@Column(name="nombre")
	@Size(max=30, message="El campo no debe contener mas de 30 caracteres")
	@NotEmpty(message="El campo Nombre no puede ir vacio")
	private String nombre;
	@Column(name="apellido")
	@Size(max=30, message="El campo no debe contener mas de 30 caracteres")
	@NotEmpty(message="El campo Apellido no puede ir vacio")
	private String apellido;
	@Column(name="carne")
	@Pattern(regexp="^$|[0-9]{8}", message="El carnet no es valido")
	@NotEmpty(message="El campo Carne no puede ir vacio")
	private String carne;
	@Column(name="carrera")
	@Size(max=30, message="El campo no debe contener mas de 30 caracteres")
	@NotEmpty(message="El campo Carrera no puede ir vacio")
	private String carrera;
	
	public Estudiante(){}
	
	public Integer getcUsuario() {
		return cUsuario;
	}
	public void setcUsuario(Integer cUsuario) {
		this.cUsuario = cUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
}
