import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

	ArrayList<Contato> lista = new ArrayList<>();
	Contato contato = new Contato();
	Scanner ler = new Scanner(System.in);

	public void cadastrar() {
		System.out.println("Informe os dados do Contato: ");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("e-mail: ");
		String email = ler.nextLine();
		System.out.print("Telefone: ");
		String telefone = ler.nextLine();
		lista.add(new Contato(nome, email, telefone));
		System.out.print("\nContato inserido na lista de contatos.\n\n");
	}

	public void atualizar() {
		if (lista.size() > 0) {
			System.out.print("Digite o contato a ser atualizado: ");
			String nome = ler.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNome().equals(nome)) {
					System.out.print("Digite o novo nome para o contato: ");
					String novoNome = ler.nextLine();
					System.out.print("Digite o novo e-mail para o contato: ");
					String novoEmail = ler.nextLine();
					System.out.print("Digite o novo número para o contato: ");
					String novotelefone = ler.nextLine();
					lista.get(i).setNome(novoNome);
					lista.get(i).setEmail(novoEmail);
					lista.get(i).setTelefone(novotelefone);
					System.out.print("Contato atualizado!!!");
				}
			}

		} else {
			System.out.println("Lista de contatos vazia");
		}
	}

	public void listarContatos() {

		if (lista.size() > 0) {
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("Contato Nº: " + i);
				System.out.println("Nome: " + lista.get(i).getNome());
				System.out.println("E-mail: " + lista.get(i).getEmail());
				System.out.println("Telefone: " + lista.get(i).getTelefone() + "\n");
			}
		} else {
			System.out.println("Lista de Contatos vazia");
		}
	}

	public void pesquisaNome() {
		if (lista.size() > 0) {
			System.out.print("Contato a ser pesquisado: ");
			String nome = ler.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNome().equals(nome)) {
					System.out.println("\nContato: " + nome + " encontrado.");
					System.out.println("Contato Nº: " + i);
					System.out.println("Nome: " + lista.get(i).getNome());
					System.out.println("E-mail: " + lista.get(i).getEmail());
					System.out.println("Telefone: " + lista.get(i).getTelefone());
				} else {
					System.out.println("Contato não cadastrado");
				}
			}
		} else {
			System.out.println("Lista de Contatos vazia");
		}
	}

	public void pesquisarEmail() {
		if (lista.size() > 0) {
			System.out.print("E-mail a ser pesquisado: ");
			String email = ler.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getEmail().equals(email)) {
					System.out.println("\nE-mail: " + email + " encontrado.");
					System.out.println("Contato Nº: " + i);
					System.out.println("Nome: " + lista.get(i).getNome());
					System.out.println("E-mail: " + lista.get(i).getEmail());
					System.out.println("Telefone: " + lista.get(i).getTelefone());
				} else {
					System.out.println("E-mail não cadastrado.");
				}
			}
		} else {
			System.out.println("Lista de Contatos vazia");
		}

	}

	public void pesquisarTelefone() {
		if (lista.size() > 0) {
			System.out.print("Telefone a ser pesquisado: ");
			String telefone = ler.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getTelefone().equals(telefone)) {
					System.out.println("\nTelefone: " + telefone + " encontrado.");
					System.out.println("Contato Nº: " + i);
					System.out.println("Nome: " + lista.get(i).getNome());
					System.out.println("E-mail: " + lista.get(i).getEmail());
					System.out.println("Telefone: " + lista.get(i).getTelefone());
				} else {
					System.out.println("Número de Telefone não cadastrado");
				}
			}
		} else {
			System.out.println("Lista de Contatos vazia");
		}

	}

	public void deletar() {
		if (lista.size() > 0) {
			System.out.print("Contato a ser deletado: ");
			String nome = ler.nextLine();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getNome().equals(nome)) {
					lista.remove(i);
				} else {
					System.out.println("Contato não cadastrado");
				}
			}
		} else {
			System.out.println("Lista de Contatos vazia");

		}
	}
}
