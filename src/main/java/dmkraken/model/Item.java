package dmkraken.model;

public class Item {
	
	//private Imagem image;
	private String nome;
	private String descricao;
	private Boolean empilhavel;
	private Integer quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getEmpilhavel() {
		return empilhavel;
	}
	public void setEmpilhavel(Boolean empilhavel) {
		this.empilhavel = empilhavel;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
