package final_finally_finalize.final_keyword.final_variable_level;

public class Employee {

    public Long id;

    public String name;

   public final String company;

   public Employee(String company){
       this.company = company;
   }


    public void printEmployeeInfo(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Company: "+company);
    }
}
