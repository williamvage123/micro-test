package org.example.player.service;

import org.example.player.entity.Player;
import org.example.player.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player createPlayer(Player player){
        return playerRepository.save(player);
    }

    public Player getPlayerById(Long id){
        return playerRepository.findById(id).orElse(null);
    }
    public Player updatePlayer(Player player){
        return playerRepository.save(player);
    }
    public void deletePlayerById(Long id){
        playerRepository.deleteById(id);
    }
}
