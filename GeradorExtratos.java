public class GeradorExtratos {
    public void geradorConta(Conta conta) {
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Operações realizadas: " );

        // Aqui é possível adicionar lógica para listar operações

        /* Porque Funciona?
        A ContaCorrente e ContaPoupança implementam a interface Conta.
        Assim, o método geradorConta pode receber qualquer objeto que siga essa contrato.*/
    }
}