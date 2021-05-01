package com.nullbank.repository;

import com.nullbank.models.Conta;
import org.springframework.data.repository.CrudRepository;

//Define a entidade que vai ser utilizada no CRUD
public interface ContaRepository extends CrudRepository <Conta, String> {

}