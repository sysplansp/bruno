package br.com.teste.entity;

import java.util.Date;
import java.util.List;

public class Match {

	private Integer id;
	private Date dataBegin;
	private Date dataEnd;
	private List<Player> players;
	private List<Kill> kill;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataBegin() {
		return dataBegin;
	}
	public void setDataBegin(Date dataBegin) {
		this.dataBegin = dataBegin;
	}
	public Date getDataEnd() {
		return dataEnd;
	}
	public void setDataEnd(Date dataEnd) {
		this.dataEnd = dataEnd;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public List<Kill> getKill() {
		return kill;
	}
	public void setKill(List<Kill> kill) {
		this.kill = kill;
	}

}