package sk.itsovy.vasinsky.other;

public class FreeClass {
    public  void sayHello(){
        System.out.println("Hello");
    }

    public void sayNHello(int n){
        int i;
        for( i=1; i<=n; i++)
        {
            System.out.print("Hello ");
        }
        System.out.println();
    }
    public void sayHi(){
        System.out.println("Hi");
    }
public void sayNHi(int n) {
    int i=1;
    while (i<=n) //cyklus...opakovanie
    {
        System.out.print("Hi");
        i++;
    }
    System.out.println();  //odriadkovanie
}
public int getEvenNumber(int number){
        if (number%2==0)
            return number;
        else
            return number+1;
}

}
