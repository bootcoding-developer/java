package com.bootcoding.java.assignments.cricket.service;

import com.bootcoding.java.assignments.cricket.model.Player;

import java.util.ArrayList;

public class PlayerService {


    public ArrayList<Player> getAllBatsman(){
        ArrayList<Player> batsman = new ArrayList<>();
        ArrayList<Player> allPlayer = getAllPlayer();
        for(Player player : allPlayer){
            if(player.getType().equals("Batsman")){
                batsman.add(player);
            }
        }
        return batsman;
    }

    public ArrayList<Player> getAllPlayer(){
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i<11; i++){
            Player newPlayer = createPlayer();
            players.add(newPlayer);
        }
        return players;
    }

    private Player createPlayer() {
        Player player = new Player();
        player.setName("Kohli"); //TODO NameGenerator.getName()
        player.setType("Batsman"); // TODO PlayerTypeGenerator.getType();
        return player;
    }
}
