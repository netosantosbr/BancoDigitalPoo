package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco{
	//Testes
    public String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        if(contas == null) {
            contas = new ArrayList<>();
        }
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta contaCorrente) {
        if(contas == null) {
            contas = new ArrayList<>();
        }
        contas.add(contaCorrente);
    }


}
