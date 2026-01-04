package dmkraken.control;

public class GerenciadorGeral {
	
	private static GerenciadorGeral uniqueInstance;
	private GerenciadorRegras gerenciadorRegras;
	
	public GerenciadorGeral() {
		this.init();
	}
	
	public static synchronized GerenciadorGeral getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new GerenciadorGeral();
		return uniqueInstance;
	}
	
	private void init() {
		this.gerenciadorRegras = GerenciadorRegras.getInstance();
	}
	
	
	public void carregarArquivo() {
		//carregar arquivo de configuracao
		//iniciar a fusao elemental
		//iniciar a ficha
	}
	
	public void salvarArquivo() {
		//salvar arquivo de configuracao
	}

}
