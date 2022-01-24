package com.notfoundname.deniquegames.api;

import com.notfoundname.deniquegames.api.game.Arena;
import com.notfoundname.deniquegames.api.game.Bossgame;
import com.notfoundname.deniquegames.api.game.Microgame;
import org.screamingsandals.lib.sidebar.Sidebar;
import org.screamingsandals.lib.utils.Wrapper;

import java.util.List;

public interface DeniqueGamesAPI extends Wrapper {
    
    List<Arena> getArenas();
    
    List<Microgame> getRegisteredMicrogames();
    
    List<Bossgame> getRegisteredBossgames();
    
    Sidebar getSidebar();
    
    
}
