package controleDeEstoque;

public class Produto {
	
	private float preco;
	private String nomeDoProduto;
	private int quatidade ;
	private int id;
	private int quantidadeMinima;
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
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
