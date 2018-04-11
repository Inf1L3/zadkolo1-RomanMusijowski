package pl.edu.ur.kolo1;

public class Zad3 {

        private int[] tablica = new int[10];
        private int i=0;
        private int size = 100;
        private int top=-1;

        public Zad3( ) {

        }

        public void newWorking(int liczba){
            int i = ++top;
            if(i<100){
                tablica[i]=liczba;
                System.out.println("element dodany ");
            } else {
                System.out.println("Nie ma miejsca ");
            }
        }

        public void showWorking(){
            int k=top;
            if(k==-1){
                System.out.println("Nie ma elementow ");
            } else {
                System.out.println("W tablice sa "+(top+1)+" elementow");
                for (k =top;k>=0;k--){
                    System.out.println(tablica[k]);
                }
            }
        }

        public void srednieTablicy(){
            int suma = 0;
            for(int i =0;i<10;i++){
                suma+=tablica[i];
            }
            System.out.println("Srednie = "+(suma/10));
        }

}
