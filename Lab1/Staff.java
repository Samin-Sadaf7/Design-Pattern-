public class Staff extends Employee {
        protected String title;
        public Staff (String name , String address, String phone_number, String email_address,
        String office, double salary, MyDate hiring_date, String title){
            super(name , address, phone_number, email_address, office, salary,hiring_date);
            this.title= title;
        }
        @Override
        public String toString(){
            String classname = this.getClass().getSimpleName();
            System.out.println("Class Name is :" + classname);
            String name = this.name;
            System.out.println("Staff Name is : "+ name);
            return "Class Name is : "+classname + " Staff Name is :"+ name;
        }

}
