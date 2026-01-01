package dmkraken.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import dmkraken.model.enume.Classes;

public class Ficha {
	
	//INFO
	private String nome;
	private String apelido;
	private Classes classe;
	
	//BASE
	//Valores HP
	private Integer hp;
	private Integer modHP;
	private Integer baseHP;
	private Integer maxHP;
	//Valorese MP
	private Integer mp;
	private Integer modMP;
	private Integer baseMP;
	private Integer maxMP;
	//Outros
	private Integer level;
	private Integer xp;
	private Integer ca;
	private Integer insp;
	private Integer tier;
	
	//Equipamentos
	//Maximo de slots do inventario vide abaixo
	private Integer mochila;
	private ArrayList<Item> inventario;
	private Arma arma;
	//quantidade de reliquias defina para 3
	private Reliquia[] reliquias;
	private ArrayList<Habilidade> habilidades;
	
	//atributos
	private Integer forca;
	private Integer agilidade;
	private Integer inteligencia;
	private Integer sabedoria;
	private Integer carisma;
	
	//moedas
	private Integer gold;
	private Integer silver;
	private Integer copper;
	
	public Ficha() {
		this.reliquias = new Reliquia[3];
	}
	
	public Ficha(String nome, String apelido, Classes classe, Integer hp, Integer baseHP, Integer maxHP, Integer mp,
			Integer baseMP, Integer maxMP, Integer level, Integer xp, Integer ca, Integer insp, Integer tier,
			Integer mochila, Arma arma, Reliquia[] reliquias, Integer forca, Integer agilidade, Integer inteligencia,
			Integer sabedoria, Integer carisma, Integer gold, Integer silver, Integer copper) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.classe = classe;
		this.hp = hp;
		this.baseHP = baseHP;
		this.maxHP = maxHP;
		this.mp = mp;
		this.baseMP = baseMP;
		this.maxMP = maxMP;
		this.level = level;
		this.xp = xp;
		this.ca = ca;
		this.insp = insp;
		this.tier = tier;
		this.mochila = mochila;
		this.arma = arma;
		this.reliquias = new Reliquia[3];
		this.forca = forca;
		this.agilidade = agilidade;
		this.inteligencia = inteligencia;
		this.sabedoria = sabedoria;
		this.carisma = carisma;
		this.gold = gold;
		this.silver = silver;
		this.copper = copper;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Classes getClasse() {
		return classe;
	}

	public void setClasse(Classes classe) {
		this.classe = classe;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getBaseHP() {
		return baseHP;
	}

	public void setBaseHP(Integer baseHP) {
		this.baseHP = baseHP;
	}

	public Integer getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(Integer maxHP) {
		this.maxHP = maxHP;
	}

	public Integer getMp() {
		return mp;
	}

	public void setMp(Integer mp) {
		this.mp = mp;
	}

	public Integer getBaseMP() {
		return baseMP;
	}

	public void setBaseMP(Integer baseMP) {
		this.baseMP = baseMP;
	}

	public Integer getMaxMP() {
		return maxMP;
	}

	public void setMaxMP(Integer maxMP) {
		this.maxMP = maxMP;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public Integer getCa() {
		return ca;
	}

	public void setCa(Integer ca) {
		this.ca = ca;
	}

	public Integer getInsp() {
		return insp;
	}

	public void setInsp(Integer insp) {
		this.insp = insp;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

	public Integer getMochila() {
		return mochila;
	}

	public void setMochila(Integer mochila) {
		this.mochila = mochila;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Reliquia[] getReliquias() {
		return reliquias;
	}

	public void setReliquias(Reliquia[] reliquias) {
		this.reliquias = reliquias;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getAgilidade() {
		return agilidade;
	}

	public void setAgilidade(Integer agilidade) {
		this.agilidade = agilidade;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getSabedoria() {
		return sabedoria;
	}

	public void setSabedoria(Integer sabedoria) {
		this.sabedoria = sabedoria;
	}

	public Integer getCarisma() {
		return carisma;
	}

	public void setCarisma(Integer carisma) {
		this.carisma = carisma;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getSilver() {
		return silver;
	}

	public void setSilver(Integer silver) {
		this.silver = silver;
	}

	public Integer getCopper() {
		return copper;
	}

	public void setCopper(Integer copper) {
		this.copper = copper;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agilidade, apelido, baseHP, baseMP, ca, carisma, classe, copper, forca, gold, hp, insp,
				inteligencia, level, maxHP, maxMP, mochila, mp, nome, sabedoria, silver, tier, xp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ficha other = (Ficha) obj;
		return Objects.equals(agilidade, other.agilidade) && Objects.equals(apelido, other.apelido)
				&& Objects.equals(baseHP, other.baseHP) && Objects.equals(baseMP, other.baseMP)
				&& Objects.equals(ca, other.ca) && Objects.equals(carisma, other.carisma) && classe == other.classe
				&& Objects.equals(copper, other.copper) && Objects.equals(forca, other.forca)
				&& Objects.equals(gold, other.gold) && Objects.equals(hp, other.hp) && Objects.equals(insp, other.insp)
				&& Objects.equals(inteligencia, other.inteligencia) && Objects.equals(level, other.level)
				&& Objects.equals(maxHP, other.maxHP) && Objects.equals(maxMP, other.maxMP)
				&& Objects.equals(mochila, other.mochila) && Objects.equals(mp, other.mp)
				&& Objects.equals(nome, other.nome) && Objects.equals(sabedoria, other.sabedoria)
				&& Objects.equals(silver, other.silver) && Objects.equals(tier, other.tier)
				&& Objects.equals(xp, other.xp);
	}

	@Override
	public String toString() {
		return "Ficha [nome=" + nome + ", apelido=" + apelido + ", classe=" + classe + ", hp=" + hp + ", baseHP="
				+ baseHP + ", maxHP=" + maxHP + ", mp=" + mp + ", baseMP=" + baseMP + ", maxMP=" + maxMP + ", level="
				+ level + ", xp=" + xp + ", ca=" + ca + ", insp=" + insp + ", tier=" + tier + ", mochila=" + mochila
				+ ", arma=" + arma + ", reliquias=" + Arrays.toString(reliquias) + ", forca=" + forca + ", agilidade="
				+ agilidade + ", inteligencia=" + inteligencia + ", sabedoria=" + sabedoria + ", carisma=" + carisma
				+ ", gold=" + gold + ", silver=" + silver + ", copper=" + copper + "]";
	}
	
}
