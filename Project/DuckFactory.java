public class DuckFactory {
    public Duck createDuck(String Type){
        Duck duck = null ;
        if(Type.equals("MallardDuck")){
            duck = new MallardDuck();
        }
        else if(Type.equals("RedheadDuck")){
            duck = new RedheadDuck();
        }
        else if(Type.equals("RubberDuck")){
            duck = new RubberDuck();
        }
        else if(Type.equals("Goose")){
            Goose goose = new Goose();
            duck = new GooseAdapter(goose);
        }
        else{
            duck = new DecoyDuck();
        }
        return duck;
    }
}
