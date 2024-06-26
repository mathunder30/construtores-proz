// COM BASE NO CODIGO ABAIXO
//OS ALUNOS DEVERÃO FAZER UM CODIGO SIMILAR, PORÉM, PARA CADASTRO DE USUÁRIOS
//DEVERÃO TER UMA CLASSE USUÁRIO COM SEUS CONSTRUTORES.
//PARA CONSTRUIR UM ALUNO,  OS VALORES MÍNIMOS SÃO O NOME, CPF E SENHA
//PORÉM, DEVERÁ TER UM CONSTRUTOR PARA CADASTRAR ALÉM DAS ANTERIORES, O EMAIL, E ESCOLARIDADE


//O que é um construtor??
// Um construtor é umimport java.util.Scanner;
// a instância de um método, ou seja: Um registro de uma classe.
// Uma classe é uma representação de algo real

import java.util.Scanner;

public class Carro {
    // É disso aqui que precisamos para criar um carro
    private String modelo;
    private int ano;

    // Construtor padrão que chamamos no main, nosso carro padrão vai ser o Uno de
    // firma
    public Carro() {
        // this vai significar ESTE REGISTRO
        this.modelo = "BMW Would Make";
        this.ano = 1984;
    }

    // O construtor personalizado lá do main
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Exibir informações
    public void mostrarInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    // PARTE PRINCIPAL DO CÓDIGO, COMEÇA A COMPILAR POR AQUI
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CONSTRUTOR PADRÃO (NÃO TEM PARÂMETROS, ESTÁ CRIANDO UM CARRO PADRÃO)
        Carro carro1 = new Carro();
        carro1.mostrarInformacoes();

        // CRIANDO UM CARRO COM UM CONSTRUTOR PERSONALIZADO, COM INFORMAÇÕES SOBRE O
        // CARRO
        Carro carro2 = new Carro("Palio", 2006);
        carro2.mostrarInformacoes();

        // CRIANDO UM NOVO CARRO COM INFORMAÇÕES DIGITADAS PELO USUÁRIO
        System.out.println("Digite o nome do carro:");
        String nomeCarro = sc.next();
        System.out.println("Digite o ano do carro:");
        int anoCarro = sc.nextInt();
        Carro carro3 = new Carro(nomeCarro, anoCarro);
        carro3.mostrarInformacoes();
        sc.close();
    }
}


// SEGUNDA PARTE

//ArrayList<Usuario> usuarios = new ArrayList<>();

//suarios.add(new Usuario(nome, email, cpf, senha));
