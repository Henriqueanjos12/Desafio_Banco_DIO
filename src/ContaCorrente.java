public class ContaCorrente extends Conta{
    private static int CC = 1;
    public ContaCorrente(Cliente titular) {
        super(titular);
        super.tipo = 1;
        super.conta = CC++;
    }
    @Override
    public void extrato() {
        System.out.println("*** Conta Corrente ***");
        super.dadosConta();
    }
}
