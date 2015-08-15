package br.com.teste.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.teste.entity.Kill;
import br.com.teste.entity.Match;
import br.com.teste.entity.Player;
import br.com.teste.util.Constants;

public class LogController {

	private Match match;

	public void readLog(){
		
		MatchController matchController = new MatchController();

		try{
			FileInputStream fstream = new FileInputStream(Constants.MATCH_LOG);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;

			while ((strLine = br.readLine()) != null)   {
				
				/* parse strLine to obtain what you want */
				System.out.println (strLine);
				DateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT);  
				
				if(strLine.substring(23, 31).toUpperCase().equals(Constants.NEW_MATCH)){
					Date date = (Date)formatter.parse(strLine.substring(0, 19));
					match.setDataBegin(date); 
					match.setId(Integer.getInteger(strLine.substring(33, 40)));
				}
				
				if(strLine.contains("killed")){
					String[] strbroken = strLine.substring(22).split(" ");
					
					if(match.getPlayers() == null)
						match.setPlayers(new ArrayList<Player>());
					
					if(match.getKill() == null)
						match.setKill(new ArrayList<Kill>());
					
					Player killer = new Player(strbroken[1]);
					Player died = new Player(strbroken[3]);

					if(!match.getPlayers().contains(killer))
						match.getPlayers().add(killer);
					
					if(!match.getPlayers().contains(died))
						match.getPlayers().add(died);

					if(killer.getKilled() == null)
						killer.setKilled(1);
					else
						killer.setKilled(killer.getKilled() + 1);
					
					if(died.getDied() == null)
						died.setDied(1);
					else
						died.setDied(died.getDied() + 1);
					
					Date dateKill = (Date)formatter.parse(strLine.substring(0, 19));
					match.getKill().add(new Kill(killer, died, strbroken[5], dateKill));
										
				}
				
				if(strLine.substring(23, 27).equals(Constants.END_MATCH)){
					Date date = (Date)formatter.parse(strLine.substring(0, 19));
					match.setDataEnd(date); 
				}
			}
			if(matchController.getMatchs() == null)
				matchController.setMatchs(new ArrayList<Match>());
			
			matchController.getMatchs().add(match);
			fstream.close();
			br.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
	
	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
}
