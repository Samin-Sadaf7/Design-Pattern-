package Lab8;

import java.util.HashMap;
public class PlayerFactory {
    private static HashMap<String, Player> players = new HashMap<String, Player>();
    public static Player getPlayer(String PlayerType){
        Player player;
        if(players.containsKey(PlayerType)){
                    player = players.get(PlayerType);
        }else{
            if(PlayerType=="Enemy"){
                    player = new Enemy();
            }
            else{
                player = new Hero();
            }
            players.put(PlayerType, player);
        } 
        return player;
    }
}
