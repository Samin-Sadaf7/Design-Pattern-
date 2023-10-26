package Lab8;

import java.util.Random;

public class Main {
    private static String[] playerType = {"Enemy", "Hero"}; 
    private static String[] swords = {"Katana", "Longsword", "Falchion", "Rapier"}; 
  
    public static void main(String args[]) { 
        for (int i = 0; i < 10; i++) 
        { 
            Player player = PlayerFactory.getPlayer(getRandomPlayer()); 
  
            player.getSword(getRandomPlayer()); 
            player.target(); 
        } 
    } 
    public static String getRandomPlayer(){ 
        Random r = new Random(); 
        int random_integer = r.nextInt(playerType.length); 
        return playerType[random_integer];  
    } 
    public static String getRandom() { 
        Random r = new Random(); 
        int random_integer = r.nextInt(swords.length); 
        return swords[random_integer]; 
    }         

}
