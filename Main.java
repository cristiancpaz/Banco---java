
public class Main {
    public static void main(String[] args) {
        
        /*
         * instancia novo banco
         */
        BancoDigital banco = new BancoDigital("digital");

        Cliente cli1 = new Cliente("joao", "88899933300", "rua a 3120");
        banco.adicionaCliente(cli1);
        System.out.println(banco.toString());
        
        //System.out.println(banco.buscarCliente("88899933300"));
        
        Cliente cli2 = new Cliente("Romario", "12345678910", "RUA A - 320");
        banco.adicionaCliente(cli2);
        banco.adicionaConta(new Conta());
        System.out.println(banco.buscarCliente("12345678910"));
        System.out.println(banco.mostrarLista());

    }
}
