package com.notfoundname.deniquegames.api.game;

import org.screamingsandals.lib.player.PlayerWrapper;

import java.util.List;

public interface Arena {
    
    List<PlayerWrapper> getPlayers();
    
    int getPlayerPoints(PlayerWrapper playerWrapper);
    
    int getMaxMicrogames();
    
    int getMicrogamesPlayed();
    
    Microgame getCurrentMicrogame();
    
    ArenaState getArenaState();
    
    
}
