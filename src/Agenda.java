import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		Metodos rodar = new Metodos();
		int opcao = 0;

		do {
			System.out.println("\n*****   LISTA DE CONTATOS   *****\n\n" + 
								"Escolha uma opção: \n\n"+
								"1_ Cadastar Contato.\n"+ 
								"2_ Atualizar Contato.\n" + 
								"3_ Pesquisar Contato por nome.\n"+ 
								"4_ Pesquisar Contato por e-mail.\n" + 
								"5_ Pesquisar Contato por telefone\n"+ 
								"6_ Listar Contatos\n" + 
								"7_ Deletar um Contato.\n"+ 
								"8_ Sair.\n");
			
			Scanner ler = new Scanner(System.in);
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				rodar.cadastrar();
				break;
			case 2:
				rodar.atualizar();
				break;
			case 3:
				rodar.pesquisaNome();
				break;
			case 4:
				rodar.pesquisarEmail();
				break;
			case 5:
				rodar.pesquisarTelefone();
				break;
			case 6:
				rodar.listarContatos();
				break;
			case 7:
				rodar.deletar();
				break;
			case 8:
				System.out.println("\nLista de Contatos fechada");
				break;
			default:
				System.out.println("Insira uma opção válida");
			
			}
		}while (opcao != 8);

	}

}
