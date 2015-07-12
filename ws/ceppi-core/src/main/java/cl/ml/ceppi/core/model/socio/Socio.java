package cl.ml.ceppi.core.model.socio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import cl.ml.ceppi.core.model.estado.Estado;
import cl.ml.ceppi.core.model.persona.Persona;
import cl.ml.ceppi.core.model.tipo.CategoriaSocio;
import cl.ml.ceppi.core.model.tipo.TipoSocio;

/**
 * 
 * @author Maldonado León
 * 
 */
@Entity
@SequenceGenerator(name = "SEC_SOCIO", sequenceName = "SEC_SOCIO")
@Table(name = "SOCIO")
public class Socio extends Persona implements Serializable {

	private static final long serialVersionUID = 257402133488075225L;
	@Id
	@GeneratedValue(generator = "SEC_SOCIO")
	@Column(name = "ID_SOCIO", nullable = false)
	private int oid;
	@Column
	private Estado estado;
	@ManyToOne
	private TipoSocio tipoSocio;
	@ManyToOne
	private CategoriaSocio categoriaSocio;

	public Socio() {
		// TODO Auto-generated constructor stub
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public TipoSocio getTipoSocio() {
		return tipoSocio;
	}

	public void setTipoSocio(TipoSocio tipoSocio) {
		this.tipoSocio = tipoSocio;
	}

	public CategoriaSocio getCategoriaSocio() {
		return categoriaSocio;
	}

	public void setCategoriaSocio(CategoriaSocio categoriaSocio) {
		this.categoriaSocio = categoriaSocio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
