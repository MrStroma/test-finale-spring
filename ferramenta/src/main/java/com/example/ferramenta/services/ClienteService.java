package com.example.ferramenta.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ferramenta.dtos.ClienteDTO;
import com.example.ferramenta.dtos.OrdineDTO;
import com.example.ferramenta.entities.ClienteEntity;
import com.example.ferramenta.entities.OrdineEntity;
import com.example.ferramenta.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository cr;
	
	public List<ClienteDTO> getAll(){
		List<ClienteDTO> clienti = new ArrayList<>();
		List<ClienteEntity> entities = cr.findAll();
		
		for(int i=0; i<entities.size(); i++) {
			ClienteEntity entity = entities.get(i);
			ClienteDTO cliente = new ClienteDTO();
			cliente.setClienteId(entity.getClienteId());
			cliente.setNome(entity.getNome());
			cliente.setContatti(entity.getContatti());
			
			List<OrdineEntity> ordt= new ArrayList<>();
			List<OrdineDTO> odtlist = new ArrayList<>();
			for(OrdineEntity oe: entity.getOrdini()) {
				OrdineEntity odt = new OrdineEntity();
				odt.setIdOrdine(oe.getIdOrdine());
				//qui mappo la lista di ordini e li inserisco nella nuova entity
				
				//mappo anche la lista dei clienti e la inserisco nell'array
				ordt.add(odt);
				
				
			}
			cliente.setOrdini(odtlist);
			clienti.add(cliente);
			
			
			
		}
		return clienti;
		
	}
	
	public void save(ClienteDTO cliente) {
		ClienteEntity clienteentity = new ClienteEntity();
		clienteentity.setClienteId(cliente.getClienteId());
		clienteentity.setNome(cliente.getNome());
		clienteentity.setContatti(cliente.getContatti());
		if(cliente.getOrdini() != null) {
			for(OrdineDTO ordine: cliente.getOrdini()) {
				OrdineEntity odt = new OrdineEntity();
				odt.setIdOrdine(cliente.getClienteId());
				odt.setIdOrdine(null); // --> CICLO FOR PER ORDINI
				odt.setProdotti(null); // --> CICLO FOR PER PRODOTTI
				//QUI VANNO MAPPATI E INSERITI COME SOPRA
				
			}
		}
		
		cr.save(clienteentity);
	}
	
}
