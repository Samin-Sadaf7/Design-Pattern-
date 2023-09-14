public class Person{
    protected String name;
    protected String address;
    protected String phone_number;
    protected String email_address;
    
    public Person( String name , String address, String phone_number, String email_address){
                this.name= name;
                this.address= address;
                this.phone_number=phone_number;
                this.email_address = email_address;
    }
    @Override
    public String toString( ){
            String classname = this.getClass().getSimpleName();
            System.out.println("Class Name is :" + classname);
            String name = this.name;
            System.out.println("Person Name is : "+ name);
            return "Class Name is : "+classname + " Person Name is :"+ name;
        }
}