package pl.LachTom.ZadanieMetodaSzablonowa;

public class CoffeApp {
    public static void main(String[] args) {

        CoffeMaker coffeMaker = new BlackCoffe();
        CoffeMaker coffeMaker1 = new WhiteCoffe();

        System.out.println(coffeMaker.Constructor());
        System.out.println(coffeMaker1.Constructor());
    }
}



