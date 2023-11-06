package com.example.ferramenta.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "prodotti")
public class ProdottoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prodotto_id", updatable = true, insertable = true)
	private Long prodottoId;

	@Column(name = "nome", length = 255, nullable = false)
	private String nome;

	@Column(name = "prezzo", nullable = false)
	private int prezzo;
	
	@Column(name = "quantita", nullable = false)
	private int quantita;
	
	@ManyToMany
    @JoinTable(name = "prodotto_ordine",
               joinColumns = @JoinColumn(name = "prodotto_id"),
               inverseJoinColumns = @JoinColumn(name = "ordine_id"))
    private List<OrdineEntity> ordini;

	public Long getProdottoId() {
		return prodottoId;
	}

	public void setProdottoId(Long prodottoId) {
		this.prodottoId = prodottoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public List<OrdineEntity> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<OrdineEntity> ordini) {
		this.ordini = ordini;
	}
	
	
}
