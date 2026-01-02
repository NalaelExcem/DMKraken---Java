package dmkraken.control;

public class GerenciadorRegras {
	
	private static GerenciadorRegras uniqueInstance;
	private FusaoElemental fusaoElemental;
	
	public GerenciadorRegras() {
		this.init();
	}
	
	public static synchronized GerenciadorRegras getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new GerenciadorRegras();
		return uniqueInstance;
	}
	
	public void init() {
		this.fusaoElemental = FusaoElemental.getInstance();
	}

}
