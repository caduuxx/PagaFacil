package com.example.PagaFacil.controlle;

import com.example.PagaFacil.cliente.Cliente;
import com.example.PagaFacil.cliente.ClienteRepositorty;
import com.example.PagaFacil.cliente.ClienteRequestDTO;
import com.example.PagaFacil.cliente.ClienteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")

public class ClienteController {
    @Autowired
    private ClienteRepositorty repository;


   // Metodo para salvar novos dados de clientes
    @PostMapping
    public void salvarCliente(@RequestBody ClienteRequestDTO data){
       Cliente clienteData = new Cliente(data);
        repository.save(clienteData);
        return;
    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")

    // esse metodo puxa uma lista do banco de dados com todos os dados dos clientes porem nao e a melhor maneira de fazer
    // e apenas um jeito de realizar testes
    @GetMapping
    public List<ClienteResponseDTO> getAll(){
        List<ClienteResponseDTO> clienteList = repository.findAll().stream().map(ClienteResponseDTO::new).toList();
        return clienteList;
    }
}
