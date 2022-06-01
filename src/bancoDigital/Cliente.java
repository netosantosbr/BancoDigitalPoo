package bancoDigital;

import java.util.Scanner;

public class Cliente {

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        this.nome = scanner.nextLine();
    }
}
