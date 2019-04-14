/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphaneProject;

/**
 *
 * @author enesk
 */
public class kutuphane {
    private final int kapasite;
    private String sehir;
    private int oduncSayisi;
    
    private kitap[] kitaplar;
    public kutuphane(int kapasite){
        this.kapasite=kapasite;
        oduncSayisi=0;
        kitaplar=new kitap[kapasite];
        
    }
    public kutuphane(kutuphane kutupObje)
    {
        this.kapasite=kutupObje.kapasite;
        this.oduncSayisi=0;

        kitaplar=new kitap[kapasite];
        for (int i = 0; i <kutupObje.kitaplar.length ; i++) {
            kitaplar[i]=kutupObje.kitaplar[i];
        }

    }
    
    public boolean oduncAl(kitap kitapObje)
    {
        boolean cont=false;

        for (int i = 0; i < kitaplar.length; i++) {

            if(kitaplar[i].getKitapAdi().equals(kitapObje.getKitapAdi()))
            {
                if(kitaplar[i].getMevcut()>=1){
                    cont=true;
                    kitaplar[i].setMevcut(kitaplar[i].getMevcut()-1);
                    kitaplar[i].setOdunc(kitaplar[i].getOdunc()+1);
                    break;
                }
            }
        }

        return  cont;

    }
    public boolean iadeEt(kitap kitapObje)
    {
        boolean cont=false;

        for (int i = 0; i <kitaplar.length ; i++) {

            if(kitaplar[i].getKitapAdi().equals(kitapObje.getKitapAdi())) {
                cont=true;
                kitaplar[i].setMevcut(kitaplar[i].getMevcut()+1);
                kitaplar[i].setOdunc(kitaplar[i].getOdunc()-1);
                break;
            }


        }
        return  cont;

    }
    
    
    public boolean kitapEkle(kitap kitapObje)
    {
        boolean cont=false;

        for (int i = 0; i < kitaplar.length; i++) {

            if(kitaplar[i]==null)
            {
                cont=true;
                kitaplar[i]=kitapObje;
                break;

            }
        }
        return  cont;
    }
    
    public boolean kitapSil(String kitapAdi)
    {
        boolean cont=false;

        for (int i = 0; i <kitaplar.length ; i++) {

            if(kitapAdi.compareTo(kitaplar[i].getKitapAdi())==0) {
                kitaplar[i] = null;
                cont=true;
                break;
            }


        }
        return  cont;

    }
    
    public void listele()
    {
        for(kitap kitapObje:kitaplar)
        {
            if(kitapObje!=null)
               System.out.println(kitapObje.getKitapAdi()+"\nmevcudu = "+kitapObje.getMevcut());

        }

    }


    
}
