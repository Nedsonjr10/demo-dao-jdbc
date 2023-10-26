package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); // Inserir no banco de dados o "obj" que inserir como parametro 
	void update (Seller obj);
	void deleteById(Integer id);
	Seller findById (Integer id); // consultar no banco de dados um obj com esse id	
	List<Seller> findAll();

}
