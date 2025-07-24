package com.FPLBE.FPLBE.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    //vai buscar todos os Jogadores
    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }
}
