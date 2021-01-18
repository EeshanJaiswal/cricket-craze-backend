package com.cricketcraze.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketcraze.player.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {


}
