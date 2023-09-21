package login;

public class VerificarBD {
    private String chamarConta;

    protected void SelectConta(){
        String select = "SELECT user,senha FROM tb_empresa";
        if (select == String.valueOf(true)){
            LogarConta();
        }else{
            contaNaoValida();
        }
    }
    protected void contaNaoValida(){
        System.out.println("Essa conta nao existe, faça o cadastro primeiro");
    }
    protected void LogarConta(){

    }
    public String getChamarConta() {
        return chamarConta;
    }

    public void setChamarConta(String chamarConta) {
        this.chamarConta = chamarConta;
    }
}
