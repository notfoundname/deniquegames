package com.notfoundname.deniquegames.bukkit;

import com.notfoundname.deniquegames.api.DeniqueGamesAPI;
import com.notfoundname.deniquegames.api.game.Arena;
import com.notfoundname.deniquegames.api.game.Bossgame;
import com.notfoundname.deniquegames.api.game.Microgame;
import net.kyori.adventure.text.Component;
import org.screamingsandals.lib.plugin.PluginContainer;
import org.screamingsandals.lib.sidebar.Sidebar;
import org.screamingsandals.lib.utils.PlatformType;
import org.screamingsandals.lib.utils.annotations.Plugin;
import org.screamingsandals.lib.utils.annotations.PluginDependencies;

import java.util.List;

@Plugin(id = PluginConstants.NAME,
        name = PluginConstants.NAME,
        version = PluginConstants.VERSION,
        authors = { "notfoundname" })
@PluginDependencies(
        platform = PlatformType.BUKKIT,
        dependencies = { "SlimeWorldManager" })
public class DeniqueGames extends PluginContainer implements DeniqueGamesAPI {
    
    private static DeniqueGames instance;
    
    private List<Arena> arenas;
    private List<Microgame> registeredMicrogames;
    private List<Bossgame> registeredBossgames;
    private Sidebar sidebar;
    
    public DeniqueGames() {
        instance = this;
    }
    
    public static DeniqueGames getInstance() {
        return instance;
    }
    
    @Override
    public void load() {
        this.sidebar = Sidebar.of()
                .title(Component.text("DeniqueGames"));
    
    }
    
    @Override
    public void enable() {
    
    }
    
    @Override
    public void disable() {
    
    }
    
    @Override
    public List<Arena> getArenas() {
        return arenas;
    }
    
    @Override
    public List<Microgame> getRegisteredMicrogames() {
        return registeredMicrogames;
    }
    
    @Override
    public List<Bossgame> getRegisteredBossgames() {
        return registeredBossgames;
    }
    
    @Override
    public Sidebar getSidebar() {
        return sidebar;
    }
    
}
