public class MallardDuck extends Duck implements Quackable {
   @Override
   public void quack(){
    System.out.println("Quack Quack from Mallard Duck!");
   } 
   @Override
   public void display(){
    System.out.println("looks like Mallard duck!");
   }
   @Override
   public void swim(){
    System.out.println("Malard Duck is swimming!");
   }
}
