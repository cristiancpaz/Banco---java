
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private List<Conta> listaDeContas;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.listaDeContas = new ArrayList<>();
    }

    public void adicionaConta(Conta conta){
        listaDeContas.add(conta);
    }

    public void removeConta(Conta conta){
        listaDeContas.remove(conta);
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setListaDeContas(List<Conta> listaDeContas) {
        this.listaDeContas = listaDeContas;
    }
    @Override
    public String toString(){
        return "DADOS DO CLIENTE\n"+
                "NOME: "+ getNome()+"\n"+
                "CPF: "+ getCpf()+"\n"+
                "ENDERECO: "+getEndereco()+"\n";
    }

    

}
