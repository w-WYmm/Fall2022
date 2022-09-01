package CPS2232;

public class RecursionExample2 {
    static int count = 0;
//recursion
    static void p(){
        count++;
        if(count <= 5){
            System.out.println(" Hello " + count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
    }
}
