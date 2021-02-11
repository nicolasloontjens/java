//https://edabit.com/challenge/ynzo3DeHCmAXLtpwe

public class Functioninator {
    public static void main(String[] args) {
        new Functioninator().run();
    }

    String inatorInator(String word){
        String inator = "inator ";
        if (word.substring(word.length()-1, word.length()).matches(".*(?i)[aeiou]")){
            inator = "-inator ";
        }
        return word + inator + word.length() + "000";
    }

    void run(){
        System.out.println(inatorInator("EasyChallenge"));
        System.out.println(inatorInator("Doom"));
    }
}
