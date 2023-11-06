package com.example.ferramenta.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordini")
public class OrdineEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ordine_id", updatable = true, insertable = true)
	private Long idOrdine;
	
	@ManyToMany(mappedBy = "ordini")
    private List<ProdottoEntity> prodotti;

    @ManyToMany(mappedBy = "ordini")
    private List<ClienteEntity> clienti;

	public Long getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(Long idOrdine) {
		this.idOrdine = idOrdine;
	}

	public List<ProdottoEntity> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<ProdottoEntity> prodotti) {
		this.prodotti = prodotti;
	}

	public List<ClienteEntity> getClienti() {
		return clienti;
	}

	public void setClienti(List<ClienteEntity> clienti) {
		this.clienti = clienti;
	}
    
    
	
}
