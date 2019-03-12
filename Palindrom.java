package sample;
import java.util.Scanner;

public class Main extends Application {
    
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("bir kelime giriniz!");
        StringBuilder b=new StringBuilder();
        String txt = myObj.nextLine();
        String[] a=txt.split("");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(i);
            b.append(a[i]);
        }
        if (txt.equals(b.toString())) {
            System.out.println("palindrom dur");
        }else   System.out.println("palindrom değildir");
    }
}
