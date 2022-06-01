package bancoDigital;

import java.util.List;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }
    @Override
    public void printExtrato() {
        System.out.println("====== Extrato Poupança ======");
        infoComum();
    }





}
