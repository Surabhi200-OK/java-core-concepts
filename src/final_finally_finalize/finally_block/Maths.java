package final_finally_finalize.finally_block;

public class Maths {

    public int divide(int a, int b){
        int ans = -1;
        try{
            ans = a/b;
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
            return ans;
        }finally{
            System.out.println("Divide method completed");
        }
        return ans;
    }
}
