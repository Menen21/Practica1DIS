package mainPack;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Cliente")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "nombre", "apellidos", "email", "telf", "direccion" })
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre, apellidos, email, telf;
	private Direccion direccion;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String apellidos, String email, String telf, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telf = telf;
		this.direccion = direccion;
	}
	
	@XmlElement(name= "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlElement(name= "apellidos")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@XmlElement(name= "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name= "telefono")
	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	@XmlElement(name= "direccion")
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}




}
