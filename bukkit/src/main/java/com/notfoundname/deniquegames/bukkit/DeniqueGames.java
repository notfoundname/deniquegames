package com.notfoundname.deniquegames.bukkit;

import com.notfoundname.deniquegames.api.DeniqueGamesAPI;
import com.notfoundname.deniquegames.api.game.Arena;
import com.notfoundname.deniquegames.api.game.Bossgame;
import com.notfoundname.deniquegames.api.game.Microgame;
import org.screamingsandals.lib.Server;
import org.screamingsandals.lib.plugin.PluginContainer;
import org.screamingsandals.lib.utils.PlatformType;
import org.screamingsandals.lib.utils.annotations.Plugin;
import org.screamingsandals.lib.utils.annotations.PluginDependencies;

import java.util.List;

@Plugin(id = PluginConstants.NAME,
        name = PluginConstants.NAME,
        version = PluginConstants.VERSION,
        authors = { "notfoundname" })
@PluginDependencies (
        platform = PlatformType.BUKKIT,
        dependencies = { "SlimeWorldManager" })
public class DeniqueGames extends PluginContainer implements DeniqueGamesAPI {
    
    private static DeniqueGames instance;
    
    public DeniqueGames() {
        instance = this;
    }
    
    public static DeniqueGames getInstance() {
        if (instance == null) {
            throw new UnsupportedOperationException("Plugin has not been initialized yet!");
        }
        return instance;
    }
    
    @Override
    public void load() {
    
    }
    
    @Override
    public void enable() {
    
    }
    
    @Override
    public void disable() {
    
    }
    
    @Override
    public List<Arena> getArenas() {
        return null;
    }
    
    @Override
    public List<Microgame> getRegisteredMicrogames() {
        return null;
    }
    
    @Override
    public List<Bossgame> getRegisteredBossgames() {
        return null;
    }
}
