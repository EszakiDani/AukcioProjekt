package hu.petrik.helloworld;

public class Main {

    public static void main(String[] args) {
        Festmeny festmeny=new Festmeny("Hómező","Bálint Ferenc","Expresszionizmus");
        for (int i=0;i<50;i++){
            festmeny.licit();
            System.out.println(festmeny.getLegmagasabbLicit());
        }
    }
}
