package in.samanvitha.unit_1.part_3.static_;

public class Calculate {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String args[]){
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}
