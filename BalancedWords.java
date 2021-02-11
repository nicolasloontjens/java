import java.util.Arrays;

//https://edabit.com/challenge/8QTBwLzAdaM8wkrXu
public class BalancedWords {
    public static void main(String[] args){
        new BalancedWords().run();
    }

    String[] splitWord(String word){
        String[] answer = new String[2];
        if(word.length() % 2 == 0){
            answer[0] = word.substring(0, (word.length()/2));
            answer[1] = word.substring((word.length()/2), word.length());
        }
        else{
            answer[0] = word.substring(0, (word.length()/2));
            answer[1] = word.substring((word.length()/2)+1, word.length());
        }
        return answer;
    }

    int calculateStringValue(String word){
        int res = 0;
        int index = 0;
        while(index < word.length()){
            res += (int) word.charAt(index) - 96; // -96 because 97 is the ascii value of a and so forth
            index ++; 
        }
        return res;
    }

    boolean isBalancedWord(String word){
        int firstHalf = calculateStringValue(splitWord(word)[0]);
        int secondHalf = calculateStringValue(splitWord(word)[1]);
        return firstHalf == secondHalf;
    }

    void run(){
        System.out.println(Arrays.toString(splitWord("foo")));
        System.out.println(Arrays.toString(splitWord("bar")));
        System.out.println(Arrays.toString(splitWord("foobar")));

        System.out.println(calculateStringValue("foobar"));
        System.out.println(isBalancedWord("foobar"));
        System.out.println(isBalancedWord("lepel"));
    }
}
