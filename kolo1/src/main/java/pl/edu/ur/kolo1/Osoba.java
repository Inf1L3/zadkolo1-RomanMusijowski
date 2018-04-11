package pl.edu.ur.kolo1;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private float wzrost;
    private int waga;

    public Osoba(String imie, String nazwisko, int wiek, float wzrost, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setWzrost(float wzrost) {
        this.wzrost = wzrost;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public void daneOsoba(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(wiek);
        System.out.println(wzrost);
        System.out.println(waga);
    }

}

