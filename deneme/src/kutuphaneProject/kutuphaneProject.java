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
public class kutuphaneProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kitap kitap1=new kitap("martin eden","jack london","521",0,2);
        kitap kitap2=new kitap("hayvan çiftliği","george orwel","170",5,4);
        kitap kitap3=new kitap("1984","george orwel","242",7,0);
        kitap kitap4=new kitap("Kürk Mantolu Madonna","Sabahattin Ali","412",1,5);
        kitap kitap5=new kitap("Uçurtma Avcısı","Khaled Hosseini","562",8,2);
        
        
        kutuphane kutupObje=new kutuphane(40);
        kutupObje.kitapEkle(kitap1);
        kutupObje.kitapEkle(kitap2);
        kutupObje.kitapEkle(kitap3);
        kutupObje.kitapEkle(kitap4);
        kutupObje.kitapEkle(kitap5);
        
        //kutupObje.listele();
        
        if(kutupObje.kitapSil(kitap5.getKitapAdi())){
            System.out.println("odunc alındı");
        }else{
            System.out.println("odunc alınamdı");
        }
        
        kutupObje.listele();
       
       
        
         

        
    }
    
}
