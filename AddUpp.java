//https://edabit.com/challenge/4gzDuDkompAqujpRi
public class AddUpp {
    public static void main(String[] args) {
        new AddUpp().run();
    }

    int addUpp(int number){
        int res = 0;
        while (number != 0){
            res += number;
            number --;
        }
        return res;
    }

    void run(){
        System.out.println(addUpp(600));
    }
}
