package com.example.PagaFacil.cliente;

public record ClienteResponseDTO(Long id, String cpf,String cnpj,String nomeSocial,
                                 String email,String senha,String telefone,String endereco) {

    public ClienteResponseDTO(Cliente cliente){
        this(cliente.getId(),cliente.getCpf(),cliente.getCnpj(), cliente.getNomeSocial(),
            cliente.getEmail(),cliente.getSenha(),cliente.getTelefone(),cliente.getEndereco());
    }

}
