package pl.LachTom.ZadanieMetodaSzablonowa;

public class WhiteCoffe extends CoffeMaker {

    @Override
    public String setUpTypeOfCoffe() {
        return "White Coffe";
    }

    @Override
    public boolean setUpMilk() {
        return true;
    }

    @Override
    public String setUpLiquer() {
        return "Sweet white";
    }

    @Override
    public String setUpOtherAdditives() {
        return "Cake";
    }
}
