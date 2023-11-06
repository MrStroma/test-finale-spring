package com.example.ferramenta.dtos;

import java.util.List;

public class ClienteDTO {
	
	private Long clienteId;
	
	private String nome;
	
	private String contatti;
	
	private List<OrdineDTO> ordini;

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

	public String getContatti() {
		return contatti;
	}

	public void setContatti(String contatti) {
		this.contatti = contatti;
	}

	public List<OrdineDTO> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<OrdineDTO> ordini) {
		this.ordini = ordini;
	}
	
	
}
