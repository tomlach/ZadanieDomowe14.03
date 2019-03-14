package pl.LachTom.ZadanieMetodaSzablonowa;

public class BlackCoffe extends CoffeMaker {
    @Override
    public String setUpTypeOfCoffe() {
        return "Black Caffe";
    }

    @Override
    public boolean setUpMilk() {
        return false;
    }

    @Override
    public String setUpLiquer() {
        return "Black Liquer";
    }

    @Override
    public String setUpOtherAdditives() {
        return null;
    }
}
