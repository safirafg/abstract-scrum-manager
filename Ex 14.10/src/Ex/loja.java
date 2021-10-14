package Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class loja {

	public static void main(String[] args) {
		
	int op;
	Scanner leia = new Scanner (System.in);
	
	ArrayList <String> estoqueLoja = new ArrayList();
	
	do {
		System.out.println("\n****************************************");
		System.out.println("\n1) Deseja incluir um item? ");
		System.out.println("\n2) Deseja excluir um item? ");
		System.out.println("\n3) Deseja substituir um item? ");
		System.out.println("\n4) Deseja visualizar todos os itens? ");
		System.out.println("\n0) Deseja sair do programa? ");
		System.out.println("\n*****************************************\n");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			leia.nextLine();
			System.out.println("\nPor favor, entre com o nome do produto a ser adicionado no estoque: ");
			String produto = leia.nextLine();
			estoqueLoja.add(produto);
			break;
		case 2:
			leia.nextLine();
			System.out.println("\nPor favor, entre com o nome do produto a ser excluido no estoque: ");
			String produto1 = leia.nextLine();
			if (estoqueLoja.contains(produto1)) {
				estoqueLoja.remove(produto1);
			}
			else {
				System.out.println("Produto inexistente..");
			}
			break;
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o nome do produto que será atualizado: ");
			String check = leia.nextLine();
			System.out.println("\nDigite o nome do novo produto: "+ check);
			String novo = leia.nextLine();
			if (estoqueLoja.contains(check)) {
				estoqueLoja.remove(check);
				estoqueLoja.add(novo);
			}
			else {
				System.out.println("\nProduto inexistente!");
			}
			break;
		case 4:
			leia.nextLine();
			System.out.println("\nProduto do estoque: ");
			System.out.println(estoqueLoja);
			break;
		default:
			System.out.println("\nProcesso finalizado...");
		}
	}
	while (op != 0);
	}

}
