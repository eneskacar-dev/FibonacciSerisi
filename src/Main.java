import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını al
        System.out.print("Fibonacci serisi kaç elemanlı olsun: ");
        int elemanSayisi = scanner.nextInt();

        // İlk iki sayıyı tanımla
        int sayi1 = 0, sayi2 = 1;

        // Sonuçları ekrana yazdır
        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        // Fibonacci serisini oluştur ve ekrana yazdır
        for (int i = 0; i <= elemanSayisi; ++i) {
            System.out.print(sayi1 + " ");

            // Her adımda son iki sayının toplamı alınır
            int toplam = sayi1 + sayi2;
            // Son iki sayıyı güncelle
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}
