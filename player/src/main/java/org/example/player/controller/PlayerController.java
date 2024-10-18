package org.example.player.controller;

import org.example.player.entity.Player;
import org.example.player.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player){
        return playerService.createPlayer(player);
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id){
        return playerService.getPlayerById(id);
    }
    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody Player player){
        player.setId(id);
        return playerService.updatePlayer(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id){
        playerService.deletePlayerById(id);
    }
}
