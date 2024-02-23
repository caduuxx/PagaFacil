create database bd_pagaFacil;
use bd_pagaFacil;

create table tb_cliente (
    id int NOT NULL PRIMARY key,
    cpf varchar(25),
    cnpj varchar(25),
    nome_social varchar(25),
    email varchar(20) NOT NULL,
    senha varchar(30) NOT NULL,
    telefone int,
    endereco varchar(20) NOT NULL
    );
create table tb_boleto (
    nf_boleto varchar(15) NOT NULL primary key,
    valor_boleto decimal(9,2) NOT NULL,
    vencimento_boleto date NOT NULL,
    data_emissao_boleto date NOT NULL,
    cnpj_emissor int NOT NULL,
    data_pagamento datetime NOT NULL
    );
create table tb_pedido (
    nf_pedido varchar(15) NOT NULL,
    cnpj_emissor int NOT NULL,
    valor_total decimal(9,2) NOT NULL,
    data_pedido date NOT NULL,
    nome_social_emissor varchar(25),
    id_pagamento int NOT NULL
    );
    create table tb_pagamento(
    forma_pagamento varchar(15)  NOT NULL,
    id_pagamento int  NOT NULL primary key
    );
    create table tb_deposito (
    id_transacao int not null primary key,
    valor_deposito decimal);
    
    
