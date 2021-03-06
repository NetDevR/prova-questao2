
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        String pCpf, pNome, pEndereco;
        String lIsbn, lTitulo, lAutor, lEditora, lEdicao, lStatus;


        Pessoa objpessoa;
        Livro objlivro;

        System.out.println("Login");



        do {
            exibirMenu();
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Entrando no cadastro de Pessoas...");

                    System.out.println("Digite o CPF da pessoa: ");
                    pCpf = entradaString.nextLine();

                    System.out.println("Digite o nome da Pessoa: ");
                    pNome = entradaString.nextLine();

                    System.out.println("Digite o endereço da pessoa: ");
                    pEndereco = entradaString.nextLine();

                    objpessoa = new Pessoa(pCpf, pNome, pEndereco);
                    ArrayPessoa.cadastrar(objpessoa);

                    System.out.println("Pessoa cadastrada!");

                    break;


                case 2:
                    System.out.println("Entrando na Consulta de Pessoas...");
                    break;


                case 3:
                    System.out.println("Entrando no cadastro de livros...");

                    System.out.println("Insira o ISBN do livro: ");
                    lIsbn = entradaString.nextLine();

                    System.out.println("Digite o título do livro: ");
                    lTitulo = entradaString.nextLine();

                    System.out.println("Digite o nome do autor: ");
                    lAutor = entradaString.nextLine();

                    System.out.println("Digite o nome da editora: ");
                    lEditora = entradaString.nextLine();

                    System.out.println("Digite o número da edição do livro: ");
                    lEdicao = entradaString.nextLine();

                    System.out.println("Digite o status do livro: ");
                    lStatus = entradaString.nextLine();

                    objlivro = new Livro(lIsbn, lTitulo, lAutor, lEditora, lEdicao, lStatus); // linha com problema
                    ArrayLivros.cadastrar(objlivro);

                    System.out.println("Livro cadastrado!");

                    break;

                case 4:
                    System.out.println("Entrando no consulta de livros...");
                    break;

                case 5:
                    System.out.println("Entrando no registro de empréstimo...");
                    break;

                case 6:
                    System.out.println("Entrando no Relatório de Empréstimos");
                    break;

                case 7:
                    System.out.println("Entrando no Registro da Devolução");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Número inválido");

            }
        } while (menu != 0);

    }

     static void exibirMenu() {
        System.out.println("    Bem vindo\n");
        System.out.println("1 - Cadastro de Pessoas");
        System.out.println("2 - Consulta de Pessoas");
        System.out.println("3 - Cadastro de Livros");
        System.out.println("4 - Consulta de Livros");
        System.out.println("5 - Registro de Empréstimos");
        System.out.println("6 - Relatório de Empréstimos");
        System.out.println("7 - Registro de Devolução");
        System.out.println("0 - Encerrar Programa");
        System.out.println("\nEscolha uma opção");

    }


}