//https://edabit.com/challenge/zRCyxKBBmr4F2x4Bv
public class Tetrahedral {
    public static void main(String[] args){
        new Tetrahedral().run();
    }

    int tetrahedral(int n){
        return (n * (n+1) * (n+2)) / 6;
    }

    void run(){
        System.out.println(tetrahedral(10));
    }
    
}
