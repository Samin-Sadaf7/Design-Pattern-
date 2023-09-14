public class PartTime extends Staff{
    
    protected double working_hour;

    public PartTime (String name , String address, String phone_number, String email_address,
        String office, double salary, MyDate hiring_date, String title, double working_hour){
            super(name , address, phone_number, email_address, office, salary,hiring_date, title);
            this.working_hour=working_hour;
            
        }
    
    @Override
    public double GetSalary(){
        return this.salary* this.working_hour;
    }
}
