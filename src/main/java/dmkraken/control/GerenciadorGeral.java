package dmkraken.control;

public class GerenciadorGeral {
	
	private static GerenciadorGeral uniqueInstance;
	private GerenciadorRegras gerenciadorRegras;
	
	public GerenciadorGeral() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized GerenciadorGeral getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new GerenciadorGeral();
		return uniqueInstance;
	}
	

}
