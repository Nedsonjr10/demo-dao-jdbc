package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); // Inserir no banco de dados o "obj" que inserir como parametro 
	void update (Department obj);
	void deleteById(Integer id);
	Department findById (Integer id); // consultar no banco de dados um obj com esse id	
	List<Department> findAll();
}
