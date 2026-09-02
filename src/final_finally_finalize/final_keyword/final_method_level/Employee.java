package final_finally_finalize.final_keyword.final_method_level;

public class Employee {

    public Long id;

    public String name;

   public String company;

   public Employee(){
   }

    public Employee(Long id,String name,String company){

    this.id = id;
    this.name = name;
    this.company = company;
   }

   public final void greet(){
       System.out.println("Hello I am an Employee");
   }


    public void printEmployeeInfo(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Company: "+company);
    }
}
