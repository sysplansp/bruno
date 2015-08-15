package br.com.teste.entity;

import java.util.Date;

public class Log {

	private Date data;
	private String line;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
}
