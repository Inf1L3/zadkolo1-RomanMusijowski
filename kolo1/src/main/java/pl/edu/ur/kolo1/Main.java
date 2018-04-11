package pl.edu.ur.kolo1;

import java.io.Console;
import java.util.Scanner;

import static pl.edu.ur.kolo1.Main.Fib.fib;

/**
 *
 * @author mchyla
 */
public class Main {

    public static class Fib {

        public static int fib(int n) {
            if ((n == 1) || (n == 2))
                return 1;
            else
                return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String imie;
        String nazwisko;
        int wiek;
        float wzrost;
        int waga;

        //Zadanie 1

        for (int i =10;i>0;i--){
            if (i==8){
                continue;
            }else if(i==6) {
                continue;
            }else if(i==3){
                continue;
            }else if(i==1){
                continue;
            }else
                System.out.println(i);
        }

        //Zadanie 2

        int liczbaFib;
        System.out.println("Podaj element ciagu ");
        liczbaFib= sc.nextInt();
        System.out.println(liczbaFib+"-ty wyraz ciau Fibonaczi : "+fib(liczbaFib));

        //Zadanie 3

        Zad3 tabl = new Zad3();
        int wybor=1;
        int elementTablicy;
        int wyborSwitch=0;
        while (wybor==1){
            System.out.println("Co zrobic?");
            System.out.println("1.Dodac element");
            System.out.println("2. Wyswitlic zawartosc");
            System.out.println("3.Srednie arytmetyczne");

            wyborSwitch=sc.nextInt();

            switch (wyborSwitch) {
                case 1:
                    System.out.println("podaj wartosc elementu tablicy");
                    elementTablicy = sc.nextInt();
                    tabl.newWorking(elementTablicy);
                    break;
                case 2:
                    tabl.showWorking();
                    break;
                case 3:
                    tabl.srednieTablicy();
                    break;
                default:
                    System.out.println("Zla liczba");
            }
            System.out.println("Powtorzyc dziaanie?(1 or 0)");
            wybor = sc.nextInt();
        }

        //Zadanie 4

        System.out.println("Podaj imie");
        imie = sc.nextLine();
        imie = sc.nextLine();
        System.out.println("Podaj nazwisko");
        nazwisko = sc.nextLine();
        System.out.println("podaj wiek");
        wiek = sc.nextInt();
        System.out.println("podaj wzrost");
        wzrost = sc.nextFloat();
        System.out.println("Podaj wage");
        waga = sc.nextInt();

        Osoba czlowiek = new Osoba(imie, nazwisko, wiek, wzrost, waga);
        czlowiek.daneOsoba();


    }
}
