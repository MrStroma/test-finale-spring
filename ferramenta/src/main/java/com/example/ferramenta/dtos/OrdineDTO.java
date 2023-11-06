package com.example.ferramenta.dtos;

import java.util.List;

import com.example.ferramenta.entities.ProdottoEntity;

public class OrdineDTO {

	private Long idOrdine;

	private List<ProdottoDTO> prodotti;

	private List<ClienteDTO> clienti;

	public Long getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(Long idOrdine) {
		this.idOrdine = idOrdine;
	}

	public List<ProdottoDTO> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<ProdottoDTO> prodotti) {
		this.prodotti = prodotti;
	}

	public List<ClienteDTO> getClienti() {
		return clienti;
	}

	public void setClienti(List<ClienteDTO> clienti) {
		this.clienti = clienti;
	}

	
}
