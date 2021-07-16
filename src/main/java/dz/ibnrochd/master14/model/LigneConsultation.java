package dz.ibnrochd.master14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ligneConsultation")
public class LigneConsultation {

	private static final long serialVersionUID = -1882485395538957648L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	 
	 @ManyToOne()
	    @JoinColumn(name = "id_traitement", nullable = false)
	    private Traitement id_traitement;
    
	 @Column(name = "posologie", nullable = false, length = 255)
	 private String posologie;
	 
	 @Column(name = "unite_temps", nullable = false, length = 255)
	 private String unite_temps;
	 
	 @Column(name = "quantite", nullable = false, length = 255)
	 private String quantite;
	
	 public LigneConsultation() {
			super();		
		}
	public LigneConsultation(int id, Consultation id_consultation, Traitement id_traitement, String posologie,
			String unite_temps, String quantite) {
		super();
		this.id = id;
		this.id_traitement = id_traitement;
		this.posologie = posologie;
		this.unite_temps = unite_temps;
		this.quantite = quantite;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the id_traitement
	 */
	public Traitement getId_traitement() {
		return id_traitement;
	}
	/**
	 * @param id_traitement the id_traitement to set
	 */
	public void setId_traitement(Traitement id_traitement) {
		this.id_traitement = id_traitement;
	}
	/**
	 * @return the posologie
	 */
	public String getPosologie() {
		return posologie;
	}
	/**
	 * @param posologie the posologie to set
	 */
	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}
	/**
	 * @return the unite_temps
	 */
	public String getUnite_temps() {
		return unite_temps;
	}
	/**
	 * @param unite_temps the unite_temps to set
	 */
	public void setUnite_temps(String unite_temps) {
		this.unite_temps = unite_temps;
	}
	/**
	 * @return the quantite
	 */
	public String getQuantite() {
		return quantite;
	}
	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	 
	 
}
