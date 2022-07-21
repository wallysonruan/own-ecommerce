package com.ownecommerce.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ownecommerce.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		return null;
	}

	@GetMapping("/{id}")
	public Client findById(@PathVariable("id") Integer id){
		return null;
	}
	
	@PostMapping
	public void addClients(@RequestBody List<Client> newClients) {
	}
	
	@PostMapping
	public void addClient(@RequestBody Client newClient) {
	}
	
	@DeleteMapping
	public void deleteClients(Client client) {
		
	}

	@DeleteMapping("/{id}")
	public void deleteClientById(@RequestParam("id") Client client) {
	}
	
	@PutMapping
	public void substituteClient(Client client) {
		
	}
	
	@PatchMapping
	public void alterClient(Client client) {
		
	}
}