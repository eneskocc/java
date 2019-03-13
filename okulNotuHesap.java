import java.util.Scanner;

public class StandartSapma {

    public static void main(String[] args) {

        Scanner cr = new Scanner(System.in);
        int diziBoyutu;
        double ortalama = 0.0,ortToplam=0.0, toplam = 0.0, k=0.0;
        System.out.println("Kaç adet sayi gireceğinizi yazınız: ");
        diziBoyutu = cr.nextInt();
        int dizi[] = new int[diziBoyutu];

        //sayıları diziye aktarıyoruz
        System.out.println("Sayıları giriniz: ");
        for (int i = 0; i < diziBoyutu; i++) {
        System.out.println((i+1)+". sayıyı giriniz: ");
            dizi[i] = cr.nextInt();
        }

    	// ortalamayı hesaplatıyoruz
        for (int j = 0; j < diziBoyutu; j++) {
            ortToplam = ortToplam + dizi[j];
            
        }
        ortalama = ortToplam/diziBoyutu;

        // ikinci toplamayı yapıyoruz
        for (int s = 0; s < diziBoyutu; s++) {
            double r = (double) Math.pow((dizi[s] - ortalama), 2);
            toplam = toplam + r;
        }
        // ötelenmiş notaları hesaplıyoruz
        k = (toplam / (diziBoyutu));
        System.out.print("Standart sapma: ");
        System.out.println(Math.sqrt(k));
        double sapma=Math.sqrt(k);
        double not[] = new double[diziBoyutu];
        double z=0;
        for (int j = 0; j < diziBoyutu; j++) {
            z=(dizi[j]-ortalama)/sapma;
            double T=60+(0.5*sapma+5)*z;
            not[j]=T;
        }
        for (int j = 0; j < diziBoyutu; j++) {
            System.out.println(j+1+"ncı not = "+not[j]);
        }
    }
}
