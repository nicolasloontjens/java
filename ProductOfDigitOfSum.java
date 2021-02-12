//https://edabit.com/challenge/PZh6svj6RjiQishTG
public class ProductOfDigitOfSum {
    public static void main(String[] args){
        new ProductOfDigitOfSum().run();
    }

    int sumDigProd(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        String theSum = String.valueOf(sum);
        int index = 0;
        int product = 1;
        while(index < theSum.length()){
            product *= Character.getNumericValue(theSum.charAt(index));
            index ++;
        }
        
        if(product < 10){
            return product;
        }
        else{
            return sumDigProd(product);
        }
    }

    void run(){
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));

        System.out.println(sumDigProd(16,28));
    }
}
