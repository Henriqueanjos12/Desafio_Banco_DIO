public class ContaPoupanca extends Conta{
    private static int CP = 1;
    public ContaPoupanca(Cliente titular) {
        super(titular);
        super.tipo = 13;
        super.conta = CP++;
    }
    @Override
    public void extrato() {
        System.out.println("*** Conta Poupança ***");
        super.dadosConta();
    }
}
