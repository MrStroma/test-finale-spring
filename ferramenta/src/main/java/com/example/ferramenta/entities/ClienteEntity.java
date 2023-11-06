package com.example.ferramenta.entities;

import java.util.List;

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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clienti")
public class ClienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id", updatable = true, insertable = true)
	private Long clienteId;

	@Column(name = "nome", length = 255, nullable = false)
	private String nome;

	
	@Column(name = "contatti", length = 255, nullable = false)
	private String contatti;
	
	@ManyToMany
    @JoinTable(name = "cliente_ordine",
               joinColumns = @JoinColumn(name = "cliente_id"),
               inverseJoinColumns = @JoinColumn(name = "ordine_id"))
    private List<OrdineEntity> ordini;
	
	
	

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<OrdineEntity> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<OrdineEntity> ordini) {
		this.ordini = ordini;
	}

	public String getContatti() {
		return contatti;
	}

	public void setContatti(String contatti) {
		this.contatti = contatti;
	}

	


	
	
	
}
