package br.com.teste.entity;


public class Player {

	private Integer id;
	private String name;
	private Integer award;
	private Integer killed;
	private Integer died;
	
	public Player(String name){
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAward() {
		return award;
	}

	public void setAward(Integer award) {
		this.award = award;
	}

	public Integer getKilled() {
		return killed;
	}

	public void setKilled(Integer killed) {
		this.killed = killed;
	}

	public Integer getDied() {
		return died;
	}

	public void setDied(Integer died) {
		this.died = died;
	}
}