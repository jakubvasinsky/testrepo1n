package sk.itsovy.vasinsky.other;
//Zúčastnite sa na týchto podujatiach spolu s priateľmi

public class Test {

    public void test() {
        for (int i = 10; i < 100; i++) {
            System.out.print(i + " ");
        }
    }

    public void neparne() {
        for (int i = 99; i > 10; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public void delitelne11() {
        for (int i = 100; i <= 999; i++) {
            if (i % 11 == 0 && i % 3 > 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void delitelne2alebo3() {
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void pekne3cifcisla() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (a == b || b == c || c == a) {
                System.out.print(i + " ");
            }
        }
    }

    public void prave2pekne3cifcisla() {
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.print(i + " ");
            }
        }
    }

    //vypisat kolko je peknych cisel, neparne, ciferny sucet je menej ako 6
    public void kolkojepeknychcisel() {
        int p = 0;
        for (int i = 1; i <= 500; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;

            if (i % 2 == 1) {
                if ((a + b + c) < 6) {
                    p++;
                }
            }
        }
        System.out.print(p);
    }

    public void daco() {
        int count = 0;
        int j = 870;
        for (int i = 1; i < 870; i++) {
            if (j % i == 0) {
                count++;
            }
        }
        System.out.println(count);

    }

    //vypisat mocniny cisla 2 do 100 000
    public void mocniny2do100000() {
        for (int i = 2; i < 100000; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public void pinkod() {
        for (int i = 1000; i < 10000; i++) {
            int a = i / 1000;
            int b = (i / 100) % 10;
            //int c = i % 10;
            int d = i % 10;
            if (i % 12 == 0 && a > d && b % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void cas() {
        int time = 514623;
        int day = time / 86400;
        time = time % 86400;
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        time = time % 60;

        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);

    }


    public void scitaniecisel() {
        int p = 1;
        for (int i = 1; i <= 30; i++) {
            p = p * 2;
        }
        System.out.println(p);
    }

    public void zlomky() {
        double p = 0;
        for (double n = 1; n <= 100; n++) {

            p = (p + (1 / n));
        }
        System.out.println(p);
    }

    public void prvocislo(){
        int c=1357;
        int p=0;
        for (int i=1;i<=c;i++){
            if (c%i==0){
                p++;
            }
        }
        if (p==2){
            System.out.println("Je prvocislo, pocet delitelov:"+p);
        }
        else{
            System.out.println("Nie je prvocislo, pocet delitelov:"+p);
        }
    }



    //vsetky 5cif cisla kt maju cif sucet 43

    public void funkciawhile(){
        int i=10000;
        while(i<99999){
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = (i / 1000) % 10;
            int e = (i / 10000) % 10;
            if(a+b+c+d+e==43){
                System.out.print(i+" ");
            }
            i++;
        }
    }
    //najvacsie 5cif cislo ktore je delitelne 613

    public void delitelne613(){
        int m=99999;
        while(m%613!=0) {
           m--;
        }
        System.out.println(m);
    }

    //najmensi spolocny nasobok
    public void nsn(){
        int a = 244;
        int b = 312 ;
        int x =1    ;
        while((a*x)%b!=0){
            x++;
        }
        System.out.println(a*x);
    }
//najvacsi spolocny delitel
    public void nsd(){
        int a = 48;
        int b = 88;
        int m = 0;
        if (a<b) {
            m=a;
            a=b;
            b=m;
        }
        while (a%b !=0){
            m=b;
            b=a-b;
            a=m;
        }
        System.out.println(b);
    }


}


