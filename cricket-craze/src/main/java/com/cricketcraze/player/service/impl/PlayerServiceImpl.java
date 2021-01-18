package com.cricketcraze.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketcraze.player.model.Player;
import com.cricketcraze.player.repository.PlayerRepository;
import com.cricketcraze.player.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }

    @Override
    public Iterable<Player> findAllPlayer() {
        return playerRepository.findAll();
    }

    @Override
    public Player findPlayer(Long id) {
        return playerRepository.getOne(id);
    }

}
