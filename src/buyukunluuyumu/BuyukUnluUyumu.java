package buyukunluuyumu;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tuyucel
 */
public class BuyukUnluUyumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen bir kelime giriniz: ");

        Scanner scn = new Scanner(System.in);
        String girilenKelime = scn.next();
        UnluUyumu(girilenKelime);
    }

    public static void UnluUyumu(String kelime) {
        String[] Kalin = new String[]{"A","I","O","U","a", "ı", "o", "u"};
        String[] Ince = new String[]{"E","İ","Ö","Ü","e", "i", "ö", "ü"};
        String[] Rakamlar = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] Harfler = new String[kelime.length()];

        int kalin = 0;
        int ince = 0;
        int rakam = 0;

        for (int j = 0; j < kelime.length(); j++) {
            Harfler[j] = kelime.substring(j, j + 1);
        }

        for (String harf1 : Harfler) {
            for (String harf2 : Kalin) {
                if (harf1.equals(harf2)) {
                    kalin++;
                }
            }
            for (String harf3 : Ince) {
                if (harf1.equals(harf3)) {
                    ince++;
                }
            }
            for (String rakam1 : Rakamlar) {
                if (harf1.equals(rakam1)) {
                    rakam++;
                }
            }
        }

        if (rakam > 0) {
            System.out.println("Lütfen rakam içermeyen kelime giriniz.");
        } else {
            if (kalin + ince == 1) {
                System.out.println("Tek heceli kelimelerde büyük ünlü uyumu aranmaz.");
            } else if (kalin + ince == 0) {
                System.out.println("Sesli harf içeren bir kelime giriniz.");
            } else {
                if (kalin > 0 && ince > 0) {
                    System.out.println("Büyük ünlü uyumuna uymaz.");
                }
                if (kalin > 0 && ince <= 0) {
                    System.out.println("Büyük ünlü uyumuna uyar.");
                }
                if (ince > 0 && kalin <= 0) {
                    System.out.println("Büyük ünlü uyumuna uyar.");
                }
            }
        }
    }
}
