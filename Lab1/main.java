public class main {
        public static void main(String args[]){
            MyDate hiring_date = new MyDate(2012, 10, 20);
            Employee employee = new Employee("Samin" , "Rasta" ,"01234", "samin@gmail.com", "Bosti", 
            0, hiring_date);    
            System.out.println(employee.toString());
        }
}
