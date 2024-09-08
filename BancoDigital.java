

import java.util.ArrayList;
import java.util.List;

public class BancoDigital {
    private String nome;
    private List<Cliente> ListaDeClientes;
    private List<Conta> ListaDeContas;

    public BancoDigital(String nome) {
        this.nome = nome;
        this.ListaDeClientes = new ArrayList<>();
        this.ListaDeContas = new ArrayList<>();
    }

    public void adicionaCliente(Cliente cliente){
        ListaDeClientes.add(cliente);
    }

    public void adicionaConta(Conta conta){
        ListaDeContas.add(conta);
    }

    public Cliente buscarCliente(String cpf){
        for(Cliente cliente: ListaDeClientes){
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
                
            }
        }
        return null;
    }
    
    public Conta buscarConta(String numeroConta){
        for(Conta conta: ListaDeContas){
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        return null;

    }

    public String mostrarLista(){
            StringBuilder sb = new StringBuilder();
            for (Cliente cliente : ListaDeClientes) {
                sb.append(cliente.toString()).append("\n");
            }
            return sb.toString();
        
    }

    @Override
    public String toString(){
        return "Lista de Clientes: \n" + mostrarLista();
        
            
    }
    
}
