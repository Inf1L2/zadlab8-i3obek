import java.util.Scanner;
import Figor.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j,k=0;
        do {
            System.out.println("\n\n\nWybierz część zadania\n[1] - Produkty\t[2] - Figury\n[0] - Zamknij Program");
            j = scan.nextInt();
        switch(j){
            case 0:
                break;
            case 1:
                Product[] array = new Product[10];
                array[0] = new Ksiazka("Drukowana","Duża i ciężka",35);
                array[1] = new Tractor("CiukCiuk","czarny",555555);
                array[2] = new Dzem("Nie","",0);
                array[3] = new Polopiryna("Chce","",0);
                array[4] = new Dlugopis("mnie","",0);
                array[5] = new Czekolada("się","",0);
                array[6] = new Tractor("tego","",0);
                array[7] = new Dlugopis("wszystkiego","",0);
                array[8] = new Czekolada("uzupełniać","",0);
                array[9] = new Polopiryna("przecież","",0);

                for(int i=0; i<10; i++){
                    System.out.println("\n"+array[i]);
                    array[i].buy();
                    array[i].showInfo();
                }

                break;
            case 2:
                FigoraGeometryczna[] array0 = new FigoraGeometryczna[15];
                array0[0] = new Kwadrat(5.37);
                array0[1] = new Prostokat(4.13,8);
                array0[2] = new Trojkat(4.57,2.22,3.16,7.11);
                array0[3] = new Trapez(2.1,3.4,4.5,5.6,5);
                array0[4] = new Rownoleglobok(2.1,3.4,6);
                array0[5] = new Romb(4,7.3);
                array0[6] = new Kolo(3.14159265);
                array0[7] = new Szescian(7.15);
                array0[8] = new Prostopadloscian(5.2,4.1,3.4);
                array0[9] = new Kula(5.25);
                array0[10] = new Walec(7.52,2.57);
                array0[11] = new Stozek(5.4,4.6,15,66);
                array0[12] = new Kwadrat(7.2);
                array0[13] = new Kolo(9.13);
                array0[14] = new Kula(5);

                while(k<15){
                    System.out.println(k+1+" -> "+array0[k]);
                    k++;
                    }
                break;
            default:
                System.out.println("Błędny wybór");
                break;
            }

        }while(j!=0);
    }

}