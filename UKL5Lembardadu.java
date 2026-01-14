package account1.UKL2025;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKL5Lembardadu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.println("=== PERMAINAN LEMPAR DADU ===");
        System.out.println("Pemain vs Komputer (Pemenang mencapai 5 kemenangan)");

        while (menangKomputer < 5 && menangPemain < 5) {
            System.out.println("\nTekan apa saja untuk melempar dadu...");
            input.next(); 

            // Komputer melempar dadu
            int daduKomputer = rand.nextInt(6) + 1; 
            // Pemain melempar dadu
            int daduPemain = rand.nextInt(6) + 1;

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            //  hasil lemparan
            System.out.println("Nilai dadu pemain : " + daduPemain);
            System.out.println("Nilai dadu komputer   : " + daduKomputer);

            // Tentukan pemenang ronde
            if (daduPemain > daduKomputer) {
                menangPemain++;
                System.out.println("➡ Pemain menang di ronde ini!");
            } else if (daduKomputer > daduPemain) {
                menangKomputer++;
                System.out.println("➡ Komputer menang di ronde ini!");
            } else {
                System.out.println("➡ Seri!");
            }

            System.out.println("Skor Sementara -> Pemain: " + menangPemain +
                               " | Komputer: " + menangKomputer);
        }

        System.out.println("\n=== PERMAINAN SELESAI ===");
        if (menangPemain == 5) {
            System.out.println("Pemenangnya adalah: Komputer ");
        } else {
            System.out.println("Pemenangnya adalah: Pemain ");
        }

        System.out.println("\n=== REKAP LEMPARAN ===");

        System.out.println("Riwayat lemparan komputer:");
        System.out.println(riwayatKomputer);

        System.out.println("\nRiwayat lemparan pemain:");
        System.out.println(riwayatPemain);

        System.out.println("\nTotal kemenangan:");
        System.out.println("Komputer   : " + menangKomputer);
        System.out.println("Pemain : " + menangPemain);

        input.close();
    }
}
