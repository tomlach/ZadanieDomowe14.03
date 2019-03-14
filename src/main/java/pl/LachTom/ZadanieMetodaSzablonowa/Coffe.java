package pl.LachTom.ZadanieMetodaSzablonowa;

public class Coffe {

    String typeOfCoffe;
    boolean milk;
    String liquer;
    String otherAdditives;

    @Override
    public String toString() {
        return "Coffe{" +
                "typeOfCoffe='" + typeOfCoffe + '\'' +
                ", milk=" + milk +
                ", liquer='" + liquer + '\'' +
                ", otherAdditives='" + otherAdditives + '\'' +
                '}';
    }
}