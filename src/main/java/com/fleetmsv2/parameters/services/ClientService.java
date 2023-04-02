package com.fleetmsv2.parameters.services;

import com.fleetmsv2.parameters.repositories.ClientRepository;
import com.fleetmsv2.parameters.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	//Get All Clients
	public List<Client> findAll(){
		return clientRepository.findAll();
	}

	//Get Client By Id
	public Client findById(int id) {
		return clientRepository.findById(id).orElse(null);
	}

	//Delete Client
	public void deleteById(int id) {
		clientRepository.deleteById(id);
	}

	//Update Client
	public void save( Client client) {
		clientRepository.save(client);
	}

}
