public class Main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        luiz.setNome("luiz");
        Cliente henrique = new Cliente();
        henrique.setNome("henrique");
        Conta cc = new ContaCorrente(luiz);
        Conta cp = new ContaPoupanca(henrique);
        cc.depositar(200);
        cp.depositar(100);
        cc.sacar(50);
        cc.transferir(cp,25);
        cc.extrato();
        cp.extrato();
    }
}