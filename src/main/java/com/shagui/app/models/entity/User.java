package com.shagui.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	@Column(name = "usu_pk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "usu_uk_codigo", unique = true, nullable = false)
	private String uid;

	@Column(name = "usu_nombre", nullable = false)
	private String nombre;

	@Column(name = "usu_apellido1")
	private String apellido1;
	
	@Column(name = "usu_apellido2")
	private String apellido2;
	
	@Column(name = "usu_contrasena", nullable = false)
	private String contrasena;
	
	@Column(name = "usu_fecha_baja")
	private Long fechaBaja;
	
	@Column(name = "usu_mail", nullable = false)
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