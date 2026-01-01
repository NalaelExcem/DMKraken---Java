package dmkraken.control;

import java.util.ArrayList;

import dmkraken.model.CombinacaoElemental;
import dmkraken.model.enume.Elementos;
import dmkraken.model.enume.SubElementos;

//TODO aplicar singleton
public class FusaoElemental {
	
	private ArrayList<CombinacaoElemental> combinacaoElementalList;
	
	private static FusaoElemental uniqueInstance;
	
	public FusaoElemental() {
		this.init();
	}
	
	public static synchronized FusaoElemental getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new FusaoElemental();
		return uniqueInstance;
	}
	
	private void init() {
		//carrega um arquivo contendo as combinacoees elementais
	}
	
	public void salvarLista() {
		//salvar a lista de subelementos cadastraos em um arquivo
	}
	
	public void cadastrarCombinacaoElemental(Elementos elementoX, Elementos elementoY, SubElementos subElemento) {
		CombinacaoElemental elementoNovoCriado = new CombinacaoElemental(elementoX, elementoY, subElemento);
		this.combinacaoElementalList.add(elementoNovoCriado);
	}
	
	public void deletarCombinacaoElemental(SubElementos subElemento) {
		CombinacaoElemental toDelete = null;
		for (CombinacaoElemental combinacaoElemental : combinacaoElementalList) {
			//TODO verificar se isso da errado
			if(combinacaoElemental.getElementoResult().equals(subElemento)) {
				toDelete = combinacaoElemental;
			}
		}
		if(toDelete != null) {
			this.combinacaoElementalList.remove(toDelete);
		}
	}

	public ArrayList<CombinacaoElemental> getCombinacaoElementalList() {
		return combinacaoElementalList;
	}

	public void setCombinacaoElementalList(ArrayList<CombinacaoElemental> combinacaoElementalList) {
		this.combinacaoElementalList = combinacaoElementalList;
	}

	@Override
	public String toString() {
		return "FusaoElemental [combinacaoElementalList=" + combinacaoElementalList + "]";
	}
	
}
