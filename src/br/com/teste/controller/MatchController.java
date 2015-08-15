package br.com.teste.controller;

import java.util.List;

import br.com.teste.entity.Match;

public class MatchController {

	private List<Match> matchs;

	public List<Match> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Match> matchs) {
		this.matchs = matchs;
	}
}
