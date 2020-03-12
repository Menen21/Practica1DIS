package mainPack;

import java.util.List;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="direccion")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "calle","numero", "codpostal", "poblacion", "pais"})
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String calle, numero, poblacion, pais, codpostal;

	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(String calle, String numero, String poblacion, String pais, String codpostal) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
		this.pais = pais;
		this.codpostal = codpostal;
	}

	@XmlElement(name= "calle")
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@XmlElement(name= "numero_calle")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@XmlElement(name= "poblacion")
	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@XmlElement(name= "pais")
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@XmlElement(name= "cod_postal")
	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

}
