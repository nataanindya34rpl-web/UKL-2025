package account1.UKL2025;

import java.util.HashSet;
import java.util.Scanner;

public class UKL4CekDuplikat {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        double [] array = new double[5];

        for (int i = 0; i < array.length; i++){
            System.out.print("Masukkan elemen untuk array ke-" + (i + 1) + " : ");
            array[i] = input.nextDouble();
        }

        boolean adaDuplikat = false;

        //Menampilkan Isi Array
        System.out.print("Array : { ");
        for (double i : array){
            System.out.print(i + " ");
        } System.out.println("}");

        //Cek Duplikat
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    System.out.println("Array memiliki elemen duplikat : " + array[i]);
                    adaDuplikat = true;
                    break;
                }
            }
            if (adaDuplikat) break;
        }

        if (!adaDuplikat){
            System.out.println("Tidak ada duplikat");
        }
    }
}

        
