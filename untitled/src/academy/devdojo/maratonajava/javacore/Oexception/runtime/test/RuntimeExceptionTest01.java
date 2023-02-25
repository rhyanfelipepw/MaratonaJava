package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked and Unchecked

        //CHECKED EXAMPLE
        Object obj = null;
        obj.toString();

        //UNCHECKED EXAMPLE ACCESSING INDEX OF ARRAY
        int[] nums = {1,2};

        System.out.println(nums[3]);
    }
}
