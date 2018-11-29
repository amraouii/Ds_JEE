package com.example.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ClientRepository;
import com.example.entitie.Client;

@RestController

public class ImplementationServiceClient {
	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping("/save")
	public Client saveClient(Client p) {
		
		clientRepository.save(p);
		return p ;
	}
	
	
	@RequestMapping("/all")
	public List <Client> getClients(){
		
		
		return clientRepository.findAll();
		
	}


	@RequestMapping("/clients")

	public Page <Client> getClients(int page){

		
	return clientRepository.findAll( PageRequest.of(0, 3));	
	}
	
	
//	@RequestMapping("/produitsParMC")
//	public Page<Produit> getProduits(String mc,int page){
//		return produitRepository.produitParMC("%"+mc+"%",PageRequest.of(0, 3));
//			
//	}
	
	@RequestMapping("get")
	public Optional<Client> getClient(Long ref) {
		return clientRepository.findById(ref);	
	}
	
	@RequestMapping("update")
	public Client update (Client p){
		clientRepository.save(p);
		return p;
	}
	@RequestMapping("/delete")
	public boolean delete(Long ref) {
		clientRepository.deleteById(ref);
		return true;
		
	}
	
	
	
	
	
}
