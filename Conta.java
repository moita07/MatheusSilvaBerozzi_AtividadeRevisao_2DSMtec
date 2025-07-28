interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();

    //nenhum método possui corpo (implementação) aqui, pois é uma interface.
}