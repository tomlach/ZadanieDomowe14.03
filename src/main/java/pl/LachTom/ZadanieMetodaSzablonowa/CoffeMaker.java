package pl.LachTom.ZadanieMetodaSzablonowa;

public abstract class CoffeMaker {

    public final Coffe Constructor() {
        Coffe coffe = new Coffe();
        coffe.typeOfCoffe = setUpTypeOfCoffe();
        coffe.milk = setUpMilk();
        coffe.liquer = setUpLiquer();
        coffe.otherAdditives = setUpOtherAdditives();
        return coffe;
    }

    public abstract String setUpTypeOfCoffe();

    public abstract boolean setUpMilk();

    public abstract String setUpLiquer();

    public abstract String setUpOtherAdditives();


}
