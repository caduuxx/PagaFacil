function login() {
    // Obtém os valores de nome de usuário e senha do formulário
    var username = document.getElementById("username").value;
    var password = document.getElementById("senha").value; // Corrected id to "senha"

    // Aqui você pode adicionar a lógica de validação do login
    // Vou fornecer um exemplo simples
    if (username === "usuario" && password === "senha") {
        // Credenciais corretas, redireciona para outra página
        window.open("App/carteira.html"); // <----- bug aqui
    } 
    else {
        // Credenciais incorretas, exibe uma mensagem de erro
        alert("Credenciais incorretas. Tente novamente.");
    }
}