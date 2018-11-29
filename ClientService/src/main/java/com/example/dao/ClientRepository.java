package com.example.dao;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.entitie.Client;

@Repository
public interface ClientRepository extends  MongoRepository<Client, Long>{
	public Client saveClient(Client p) ;
	
	public List <Client> getClients();
	public Page <Client> getClients(int page);
	public Optional<Client> getClient(Long ref) ;
	public Client update (Client p);
	public boolean delete(Long ref) ;




}
