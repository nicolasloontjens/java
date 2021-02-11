//https://edabit.com/challenge/ejfdLAp673DwxSg5R

public class AreaOfCountry {
    double worldLandmass = 148940000;
    public static void main(String[] args){
        new AreaOfCountry().run();
    }

    String areaOfCountry(String country, double landmass){
        double percentage = (landmass / worldLandmass) * 100;
        
        return country + " is " + String.format("%.2f", percentage) + "% of the total world's landmass";
    }

    void run(){
        System.out.println(areaOfCountry("Belgium", 30689));
    }
}
