package com.ownecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ownecommerce.entities.Client;
import com.ownecommerce.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
	public void addClient(Client newClient) {
		repository.save(newClient);
	}
	
	public void deleteClient(Client toBeDeleted) {
		repository.delete(toBeDeleted);
	}
}
