package account1.UKL2025;

import java.util.Scanner;

public class UKL6PeminjamanBuku {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Naama Peminjam ");
      String namaPeminjam = input.nextLine();

      System.out.println("Judul Buku ");
      String judulBuku = input.nextLine();

      System.out.println("Kategori Buku (A/B/C) ");
      char kategoriBuku = input.nextLine().charAt(0)    ;

      System.out.println("Lama Peminjaman (hari) ");
      int hari = input.nextInt();

      int tarifPerhari =0;
        switch (kategoriBuku) {
            case 'A':
                tarifPerhari = 2000; //buku Pelajaran
                break;
            case 'B':
                tarifPerhari = 1500; //Buku novel
                break;
            case 'C':
                tarifPerhari = 1000; //Buku Majalah
                break;
            default:
                System.out.println("Kategori tidak valid.");
                return;
        }
        
        //Hitung biaya awal
        int BiayaAwal = tarifPerhari * hari;
            
            //Menghitung denda jika lebih dari 7 hari
            int denda = 0;
              if (hari > 7) {
            int hariTerlambat = hari - 7;
            denda = hariTerlambat * 500;  // Rp500 perhari
        }
            //hitung total biaya
            int totalBiaya = BiayaAwal + denda;

            /////OUtput
            System.out.println("\n==Rincian Peminjaman==");
            System.out.println("Nama Peminjam : " + namaPeminjam);
            System.out.println("Judul Buku    : " + judulBuku);
            System.out.println("Kategori Buku : " + kategoriBuku);
            System.out.println("Lama Peminjaman (hari): " + hari);
            System.out.println("Biaya Awal   : Rp" + BiayaAwal);
            System.out.println("Denda       : Rp" + denda);
            System.out.println("Total Biaya : Rp" + totalBiaya);
        input.close();




    }
}
