package com.cricketcraze.player.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_generator")
	@SequenceGenerator (name = "player_generator", sequenceName = "player_sequence" , allocationSize = 0)
	@Column (name = "player_id")
	private Long playerId;
	
	@Column (name = "playerName")
	private String playerName;

	public String getPlayerName() {
		return this.playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Player(){}

	public Player(PlayerForm form){
		this.playerName=form.getPlayerName();
	}
	
}

//ctrl + shift + P -> generate getter and setters

