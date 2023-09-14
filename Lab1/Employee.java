public class Employee extends Person{
        protected String office;
        protected double salary;
        protected MyDate hiring_date ;
        public Employee ( String name , String address, String phone_number, String email_address,
                          String office, double salary, MyDate hiring_date){
                        super(name , address, phone_number, email_address);
                        this.salary=salary;
                        this.office=office;
                        this.hiring_date=hiring_date;
        }
        @Override 
        public String toString(){
                String classname = this.getClass().getSimpleName();
                System.out.println("Class Name is :" + classname);
                String name = this.name;
                System.out.println("Employee Name is : "+ name);
                return "Class Name is : "+classname + " Employee Name is :"+ name;
        }
        public double GetSalary (){
                return this.salary;
        }
}