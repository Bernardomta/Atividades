package program;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A", "123-456-789", "123.456.789-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", "Rua B", "987-654-321", "12.345.678/0001-00");

        System.out.println("Nome da Pessoa Física: " + pessoaFisica.getNome());
        System.out.println("Endereço da Pessoa Jurídica: " + pessoaJuridica.getEndereco());

        System.out.println("CPF da Pessoa Física: " + pessoaFisica.getCpf());
        System.out.println("CNPJ da Pessoa Jurídica: " + pessoaJuridica.getCnpj());
    }
}
