public class Student extends Person {
        protected String status;
        public Student (String name , String address, String phone_number, String email_address,String status){
                super(name , address, phone_number, email_address);
                this.status=status;
        }
        @Override
        public String toString(){
                String classname = this.getClass().getSimpleName();
                System.out.println("Class Name is :" + classname);
                String name = this.name;
                System.out.println("Student Name is : "+ name);
                return "Class Name is : "+classname + " Student Name is :"+ name;
        }
}
