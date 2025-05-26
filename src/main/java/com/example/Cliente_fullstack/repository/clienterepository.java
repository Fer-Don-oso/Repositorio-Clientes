package com.example.Cliente_fullstack.repository;
import com.example.Cliente_fullstack.Model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienterepository extends JpaRepository<Cliente, Long {

}
