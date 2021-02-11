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

    void run(){
        System.out.println(Arrays.toString(splitWord("foo")));
        System.out.println(Arrays.toString(splitWord("bar")));
        System.out.println(Arrays.toString(splitWord("foobar")));
    }
}
