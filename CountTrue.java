//https://edabit.com/challenge/GLbuMfTtDWwDv2F73
import java.util.ArrayList;

public class CountTrue {
    public static void main(String[]args){
        new CountTrue().run();
    }

    int countTrue(ArrayList<Boolean> array){
        int count = 0;
        for (Boolean bool : array) {
            if(bool){
                count ++;
            }
        }
        return count;
    }

    void run(){
        ArrayList<Boolean> arr = new ArrayList<Boolean>();
        arr.add(true);
        System.out.println(countTrue(arr));
    }
}
