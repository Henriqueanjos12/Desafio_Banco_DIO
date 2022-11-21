public abstract class Conta implements InterfaceConta{
    private static final int AGENCIA_PADRAO = 31;
    protected int agencia;
    protected int tipo;
    protected int conta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente titular) {
        this.agencia = AGENCIA_PADRAO;
        this.cliente = titular;
    }
    public void sacar(double valor){
        this.saldo = saldo - valor;
    }
    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void dadosConta() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Tipo de Conta: " + this.tipo);
        System.out.println("nº da Conta: " + this.conta);
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTipo() {
        return tipo;
    }
}
