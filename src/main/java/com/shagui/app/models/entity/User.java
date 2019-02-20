package com.shagui.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author Grego
 *
 */
@Entity
@Table(name = "usuarios")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8244780157269809666L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true, nullable = false)
	@NotEmpty
	private String uid;

	@Column(nullable = false)
	@NotEmpty
	private String nombre;

	@Column
	private String apellido1;
	
	@Column
	private String apellido2;
	
	@Column(nullable = false)
	@NotEmpty
	private String contrasena;
	
	@Column(name = "fecha_baja")
	private Long fechaBaja;
	
	@Column(nullable = false)
	private String mail;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the user
	 */
	public String getUid() {
		return uid;
	}
	
	/**
	 * @param user the user to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	
	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	
	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	/**
	 * @return the fechaBaja
	 */
	public Long getFechaBaja() {
		return fechaBaja;
	}
	
	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(Long fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
}
