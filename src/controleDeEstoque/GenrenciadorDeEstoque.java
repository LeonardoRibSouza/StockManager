package controleDeEstoque;

import java.util.Scanner;

public class GenrenciadorDeEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaDeEstoque sistema = new SistemaDeEstoque();
		Scanner entrada = new Scanner(System.in);
		int resp;
		
		do {
			System.out.println("--------------------------------");
			System.out.println("    GERENCIAMENTO DE ESTOQUE    ");
			System.out.println("--------------------------------");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Lista Produtos");
			System.out.println("3. Adicionar Quantidade");
			System.out.println("4  Remover Quantidade");
			System.out.println("5. Remover Produto");
			System.out.println("6. Gerar Relátorio");
			System.out.println("7. Sair");
			System.out.println("");
			resp = entrada.nextInt();
			entrada.nextLine(); // consome o ENTER que ficou depois do número
			switch (resp){
			case 1:
				System.out.println("Digite o nome do produto: ");
				String nomeCadastramento = entrada.nextLine();
			
				System.out.println("Digite o o preço do produto: ");
				String precoStr = entrada.nextLine().replace(",","."); // substitui vírgula por ponto
				float precoCadastramento = Float.parseFloat(precoStr); // converte para float
			
				System.out.println("Digite a quantidade do produto: ");
				int quantidadeCadastramento = entrada.nextInt();	
				entrada.nextLine(); // consome o ENTER que ficou depois do número
				
				System.out.println("Digite agora a quantidade minima de estoque desejada: ");
				int quantidadeMinima = entrada.nextInt();
				
				System.out.println("O id do produto cadastrado é: " + sistema.getId());
				sistema.cadastramento(nomeCadastramento,precoCadastramento,quantidadeCadastramento,quantidadeMinima);
			break;
		
			case 2:
				sistema.listarProdutos();
			break;
			case 3:
				System.out.println("Digite o Id do produto que desejar adicionar: ");
				int id = entrada.nextInt();
				System.out.println("Digite a quatidade que deseja acrescentar: ");
				int quantidade = entrada.nextInt();
				sistema.adicionar(quantidade,id);
				System.out.println("adicionado com sucesso");
			break;
			
			case 4:
				System.out.println("Digite a quantidade para remover: ");
				quantidade = entrada.nextInt();
				
				System.out.println("digite o Id do produto pra remover a quantidade: ");
				id = entrada.nextInt();
				
				System.out.println("A nova quantidade agora é: "+ sistema.removerQuantidade(quantidade,id));
			break;
			case 5:
				System.out.println("Digite o Id do produto para remover: ");
				id = entrada.nextInt();
				sistema.removeProduto(id);
				System.out.println("produto removido");
			break;
			case 6:
				sistema.gerarRelatorio();
			}
		}while (resp != 7);		
	}

}
