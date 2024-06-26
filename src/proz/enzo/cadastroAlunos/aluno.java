package proz.enzo.cadastroAlunos;
import java.util.ArrayList;
import java.util.Scanner;

public class aluno {
    private String nome;
    private String cpf;
    private String senha;
    private String email;
    private String escolaridade;
    
    

    public aluno(String nome, String cpf, String senha){
        // this vai significar ESTE REGISTRO
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        


    }
    public aluno(String email, String escolaridade,String nome, String cpf, String senha){
        this.escolaridade = escolaridade;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;

    }

    public void printInformacao(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Escolaridade: "+this.escolaridade);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Email: "+ this.email);
        System.out.println("Senha: " + this.senha);
    }
    public void CadastroAluno(){

    }
    public static void main(String[] args) {
        ArrayList<aluno> Arrayalunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean repeticao = true;
        
        

        boolean escolhasInteracao = true;
        while (escolhasInteracao) {
            System.out.println("digite as opções que voce deseja: ");
            System.out.println("1. cadastrar novo usuario: ");
            System.out.println("2. visualizar todos os usuarioss: ");
            System.out.println("3. Alterar usuario: ");
            System.out.println("4. Sair");
            int opcoes = sc.nextInt();
            if (opcoes == 1) {
                do {
            
            
            System.out.println("Digite o seu nome: ");
            String alunoNome = sc.nextLine();
            System.out.println("Qual é a sua escolaridade?");
            String alunoEscolaridade = sc.nextLine();
            System.out.println("Digite o seu cpf: ");
            String alunoCPF = sc.nextLine();
            System.out.println("Digite o seu email: ");
            String alunoEmail = sc.nextLine();
            System.out.println("Digite a sua senha: ");
            String alunoSenha = sc.nextLine();
            Arrayalunos.add(new aluno(alunoNome, alunoEscolaridade, alunoCPF, alunoEmail, alunoSenha));
            System.out.println("digite o 0 para sair e 1 para continuar");
            int verificacao = sc.nextInt();
            if (verificacao == 0) {
                repeticao = false;
                
            }
        }while (repeticao);
        
            } else if (opcoes == 2) {
                for (aluno x : Arrayalunos){
            x.printInformacao();
        }
            } else if (opcoes == 3) {
                System.out.println("O que voce deseja modificar? ");
                System.out.println("1. Nome");
                System.out.println("2. Escolaridade");
                System.out.println("3. CPF");
                System.out.println("4. Email");
                System.out.println("5. Senha");
                int modificacao = sc.nextInt();
                if (modificacao == 1) {
                    Arrayalunos.set(2 );
                    
                }

                
            }
            
        }
        sc.close();
    }
}
