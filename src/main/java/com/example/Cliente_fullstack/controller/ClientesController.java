package com.example.Cliente_fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cliente_fullstack.Model.Cliente;
import com.example.Cliente_fullstack.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/cliente")
public class ClientesController {

        @Autowired
        private ClienteService ClienteService;

        @GetMapping()
        public ResponseEntity<List<Cliente>> listar(){
            List<Cliente> Cliente = ClienteService.listaClientes();

            if (Cliente.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok();
        }
        
}
