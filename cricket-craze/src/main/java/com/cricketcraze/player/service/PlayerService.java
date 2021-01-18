package com.cricketcraze.player.service;

import com.cricketcraze.player.model.Player;

public interface PlayerService {

    public Player createPlayer(Player player);

    public void deletePlayer(Long id);

    public Iterable<Player> findAllPlayer();

    public Player findPlayer(Long id);

}
