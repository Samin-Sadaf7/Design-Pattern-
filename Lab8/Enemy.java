package Lab8;

public class Enemy implements Player {
   
   private final String TASK; 
   private String SwordType; 
 
   public Enemy() { 
       TASK = "Kill the Hero"; 
   }
   @Override 
   public void getSword(String SwordType) { 
    
       this.SwordType = SwordType; 
   } 
   @Override
   public void target() {  
       System.out.println("Enemy has "  + SwordType + "and the task : " + TASK); 
   } 
}
