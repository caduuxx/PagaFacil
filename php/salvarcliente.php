<?php
    $nome = htmlspecialchars($_GET['usuario']);
    $cpf = htmlspecialchars($_GET['cpf']);
    $telefone = htmlspecialchars($_GET['telefone']);
    $cep = htmlspecialchars($_GET['CEP']);
$host = "localhost";
$user = "id21107020_francisco";
$pass = "Projeto.0011";
$dbname ="id21107020_bd_pagafacil";
$connection = mysqli_connect($host,$user,$pass,$dbname)
or die (mysql_errno().": ".mysql_error()."<BR>");

$query = "INSERT INTO USUARIO (CPF,usuario,TELEFONE,CEP) VALUES ('".$cpf."','".$nome."','".$telefone."','".$cep."')";

echo $query;
mysqli_query ($connection,$query) or die ('Erro a salvar');

echo "<br/>";
echo "SALVO - nome:".$nome." | CPF : ".$nome."|";

