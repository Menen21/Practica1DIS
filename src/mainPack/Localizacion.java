package mainPack;

import java.util.List;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="localizacion")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = { "pasillo","estanteria", "estante"})
public class Localizacion implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private String pasillo, estanteria, estante;
	
	

	public Localizacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Localizacion(String pasillo, String estanteria, String estante) {
		super();
		this.pasillo = pasillo;
		this.estanteria = estanteria;
		this.estante = estante;
	}

	@XmlElement(name= "pasillo")
	public String getPasillo() {
		return pasillo;
	}

	public void setPasillo(String pasillo) {
		this.pasillo = pasillo;
	}

	@XmlElement(name= "estanteria")
	public String getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}

	@XmlElement(name= "estante")
	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}
	

}
