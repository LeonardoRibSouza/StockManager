package controleDeEstoque;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SistemaDeEstoque {
	private  ArrayList<Produto> estoque = new ArrayList<>();
	private int id = 0;
	
	public int getId() {
		return this.id;
	}
	
	public void cadastramento(String nome,double preco,int quantidade,int quantidadeMinima) {
		Produto produto = new Produto();
		produto.setNomeDoProduto(nome);
		produto.setPreco(preco);
		produto.setQuatidade(quantidade);
		produto.setId(id);
		this.id++;
		produto.setQuantidadeMinima(quantidadeMinima);
		estoque.add(produto);
	}
	
	public void listarProdutos() {
		for (Produto p: estoque) {
			System.out.print("Id: "+ p.getId());
			System.out.println("Nome: " + p.getNomeDoProduto());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuatidade());
			System.out.println("");
		} 
	}
	
	public void adicionar(int encremento,int id) {
		for (Produto p: estoque) {
			if (p.getId() == id) {
				p.setQuatidade(p.getQuatidade() + encremento);
			}
		}
	}
	
	public int removerQuantidade(int removerQuantidade,int id) {
		for(Produto p: estoque) {
			if (p.getId() == id) {
				p.setQuatidade(p.getQuatidade() - removerQuantidade);
				return p.getQuatidade();
			}
		}
		return 0;
	}
	
	public void removeProduto(int id) {
		for(Produto p: estoque) {
			if (p.getId() == id) {
				estoque.remove(p);
			}
		}
	}
	
	public void gerarRelatorio() {
		LocalDateTime horarioAtual = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String horarioFormatado = horarioAtual.format(formato);
		
		System.out.println("----------------------------------");
		System.out.println("       Relatório De Estoque");
		System.out.println("       Gerado em: " + horarioFormatado);
		System.out.println("----------------------------------");
		System.out.println("");
		
		for (Produto p: estoque) {
			System.out.println("ID: "+p.getId());
			System.out.println("Nome do Produto: "+p.getNomeDoProduto());
			System.out.println("Quantidade em estoque: "+p.getQuatidade());
			if (p.getQuatidade() <= p.getQuantidadeMinima()) {
				System.out.println("!!! A QUANTIDADE MINIMA FOI ATINGIDA !!!");
			}
			if (p.getQuatidade() == 0) {
				System.out.println("!!! FORA DE ESTOQUE !!!");
			}
			System.out.println("----------------------------------");
		}
		
	}
	
	
}