package dmkraken.model;

import java.util.Objects;

import dmkraken.model.enume.Elementos;
import dmkraken.model.enume.SubElementos;

public class CombinacaoElemental {
	
	private Elementos elementoX;
	private Elementos elementoY;
	private SubElementos elementoResult;
	
	public CombinacaoElemental() {}
	
	public CombinacaoElemental(Elementos elementoX, Elementos elementoY, SubElementos elementoResult) {
		super();
		this.elementoX = elementoX;
		this.elementoY = elementoY;
		this.elementoResult = elementoResult;
	}

	public Elementos getElementoX() {
		return elementoX;
	}
	public void setElementoX(Elementos elementoX) {
		this.elementoX = elementoX;
	}
	public Elementos getElementoY() {
		return elementoY;
	}
	public void setElementoY(Elementos elementoY) {
		this.elementoY = elementoY;
	}
	public SubElementos getElementoResult() {
		return elementoResult;
	}
	public void setElementoResult(SubElementos elementoResult) {
		this.elementoResult = elementoResult;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(elementoResult, elementoX, elementoY);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CombinacaoElemental other = (CombinacaoElemental) obj;
		return elementoResult == other.elementoResult && elementoX == other.elementoX && elementoY == other.elementoY;
	}
	
	@Override
	public String toString() {
		return "CombinacaoElemental [elementoX=" + elementoX + ", elementoY=" + elementoY + ", elementoResult="
				+ elementoResult + "]";
	}
	
}
