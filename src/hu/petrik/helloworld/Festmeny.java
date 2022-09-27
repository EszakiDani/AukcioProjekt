package hu.petrik.helloworld;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsolicitIdeje;
    private boolean elkelt;

    public Festmeny(String cim,String festo,String stilus){
        this.cim=cim;
        this.festo=festo;
        this.stilus=stilus;
        this.licitekSzama=0;
        this.legmagasabbLicit=0;
        this.elkelt=false;
        this.legutolsolicitIdeje=null;

    }

    public String getCim() {
        return cim;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsolicitIdeje() {
        return legutolsolicitIdeje;
    }

    public boolean isElkelt() {
        return elkelt;
    }
    public void licit(){
            if (this.elkelt){
                throw   new RuntimeException("A festmény már elkelt");
            }
            if (this.licitekSzama==0){
                this.legmagasabbLicit=100;

            }else{
                int ujLicit=(int)(this.legmagasabbLicit*1.1);
                String szovegesLicit=String.valueOf(ujLicit);
                int hossz=szovegesLicit.length();
                StringBuilder veglesesLicit=new StringBuilder(szovegesLicit.substring(0,2));
                for(int i=0;i<hossz-2;i++){
                    veglesesLicit.append(0);
                }
                int veglegesLicitSzam= Integer.parseInt(veglesesLicit.toString());
                this.legmagasabbLicit=veglegesLicitSzam;
            }
              this.licitekSzama++;
              this.legutolsolicitIdeje=LocalDateTime.now();
    }
    public void licit(int mertek){

    }
}


