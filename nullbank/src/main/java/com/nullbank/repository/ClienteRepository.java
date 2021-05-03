package com.nullbank.repository;

import com.nullbank.models.Cliente;
import org.springframework.data.repository.CrudRepository;

//Define a entidade que vai ser utilizada no CRUD
public interface ClienteRepository extends CrudRepository<Cliente,String>{

    Cliente findClienteByCodCliente(int codCliente);

}
