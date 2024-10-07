package questão1;

import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empregado empregado = new Empregado();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        Supervisor supervisor = new Supervisor();

        int opcao;
        do {
            System.out.println("Bem-vindo, funcionário! Digite 1 se você for supervisor e 2 se for desenvolvedor.");
            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Olá, supervisor! Por favor, insira o nome do seu projeto:");
                    supervisor.definirProjeto(entrada.next());
                    supervisor.exibirProjeto();
                    break;

                case 2:
                    System.out.println("Olá, desenvolvedor! Insira sua linguagem de programação:");
                    desenvolvedor.definirLinguagem(entrada.next());
                    desenvolvedor.exibirLinguagem();
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println("Para repetir a experiência, digite 0. Para sair, digite qualquer outro número.");
            opcao = entrada.nextInt();
        } while (opcao == 0);

        entrada.close();
    }
}
