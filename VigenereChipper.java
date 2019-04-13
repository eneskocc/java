/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpratice;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author enesk
 */
public class NewPratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Merhana");
        while(true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("şifrelemek için(n/N)\nşifre cözümlemek için (s/S)\nbitirmek için herhangi bir tuş....");
            String bitir=myObj.nextLine();
            if(bitir.equals("n")||bitir.equals("N")){
                System.out.println("Şifrelemek istediğiniz kelimeyi giriniz!");
                String txt = myObj.nextLine();
                System.out.println("Şifrelemek için key giriniz!");
                String key=myObj.nextLine();
                System.out.println("Şifrelenmiş metin ="+encrypt(txt,key)+"\n");
            }else if(bitir.equals("S")||bitir.equals("s")){
                System.out.println("Çözümlemek istediğiniz kelimeyi giriniz!");
                String txt = myObj.nextLine();
                System.out.println("Şifrelemek için key giriniz!");
                String key=myObj.nextLine();
                System.out.println("Çözümlenmiş metin ="+decrypt(txt,key)+"\n");
            }else{
                System.out.println(".................................");
                break;
            }
            
        }
        
    }
    public static String encrypt(String originalText, String key)
    {
        StringBuilder doncek = new StringBuilder();
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String girdi=toUpperString(originalText);
        key=toUpperString(key);
        String ke="";
        while(true){
            if(ke.length()>girdi.length()) 
                break;
            ke=ke+key;
        }
        for(int i=0;i<=girdi.length()-1;i++){
            char harf=girdi.charAt(i);
            char keyi=ke.charAt(i);
            int c=alfabe.indexOf(keyi);
            int s=alfabe.indexOf(harf); 
            int toplam=s+c;
            int mod=0;
            if (toplam>=0)  mod=(toplam+1)%26; 
                char e=alfabe.charAt(mod);
            doncek.append(e);
        }
        return doncek.toString();
    }
    public static String toUpperString(String text){
        return text.toUpperCase();
    }
    public static String decrypt(String encryptedText, String key )
    {
        StringBuilder doncek = new StringBuilder();
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String girdi=toUpperString(encryptedText);
        key=toUpperString(key);
        String ke="";
        while(true){
            if(ke.length()>girdi.length()) 
                break;
            ke=ke+key;
        }
        for(int i=0;i<=girdi.length()-1;i++){
            char harf=girdi.charAt(i);
            char keyi=ke.charAt(i);
            int c=alfabe.indexOf(keyi);
            int s=alfabe.indexOf(harf); 
            int mod=0;
            mod=(s-c+26)%26;
            if(mod<=0){  
              mod=(mod+25)%26;
            }else{
              mod=mod-1;
            }    
        char e=alfabe.charAt(mod);
        doncek.append(e);
        }
        return doncek.toString();
    }
}
