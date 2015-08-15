package br.com.teste.entity;

import java.util.Date;

public class Kill {

	private Player killer;
	private Player died;
	private String gun;
	private Date date;

	public Kill(Player killer, Player died, String gun, Date date){
		this.killer = killer;
		this.died = died;
		this.gun = gun;
		this.date = date;
	}
	
	public Player getKiller() {
		return killer;
	}
	public void setKiller(Player killer) {
		this.killer = killer;
	}
	public Player getDied() {
		return died;
	}
	public void setDied(Player died) {
		this.died = died;
	}
	public String getGun() {
		return gun;
	}
	public void setGun(String gun) {
		this.gun = gun;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
