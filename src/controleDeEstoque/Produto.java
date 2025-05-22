package controleDeEstoque;

public class Produto {
	
	private double preco;
	private String nomeDoProduto;
	private int quatidade ;
	private int id;
	private int quantidadeMinima;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public int getQuatidade() {
		return quatidade;
	}
	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	
}
