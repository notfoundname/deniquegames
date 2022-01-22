package com.notfoundname.deniquegames.api.game;

public interface Microgame {
    
    int duration();
    
    boolean onlyOneWinner();
    
    void logic();
    
}
