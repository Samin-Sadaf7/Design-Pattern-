public class Faculty extends Employee{
    protected double Officehour;
    protected String rank;
    
    public Faculty (String name , String address, String phone_number, String email_address,
    String office, double salary, MyDate hiring_date, double Officehour, String rank){
        super(name , address, phone_number, email_address, office, salary,hiring_date);
        this.rank=rank;
        this.Officehour=Officehour;
    }
    @Override
    public String toString(){
        String classname = this.getClass().getSimpleName();
        System.out.println("Class Name is :" + classname);
        String name = this.name;
        System.out.println("Faculty Name is : "+ name);
        return "Class Name is : "+classname + " Faculty Name is :"+ name;
    }
}
