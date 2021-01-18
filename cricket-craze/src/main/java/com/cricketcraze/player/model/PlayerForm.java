package com.cricketcraze.player.model;

import java.io.Serializable;

public class PlayerForm implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long playerId;
    private String playerName;

    public Long getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

}