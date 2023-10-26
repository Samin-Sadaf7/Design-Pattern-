package Lab8;

public class Hero implements Player{
    
   private final String TASK; 
   private String SwordType; 
 
   public Hero() { 
       TASK = "Kill the Enemy"; 
   }
   @Override 
   public void getSword(String SwordType) { 
    
       this.SwordType = SwordType; 
   } 
   @Override
   public void target() {  
       System.out.println("Hero has "  + SwordType + " Sword and the task : " + TASK); 
   } 
}
