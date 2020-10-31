/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Mengnampilkan nilai terbesar dan terkecil
 *
 */
public class PBO10K10119901Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String namaPetugas;
        int banyaknyaNilaiMahasiswa;
        int nilaiMahasiswa[];
        int nilaiTerkecil = 0;
        int nilaiTerbesar = 0;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Jumlah Nilai Mahasiswa : ");
        banyaknyaNilaiMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];

        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) 
        {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) 
        {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] < nilaiTerkecil) 
            {
                nilaiTerkecil = nilaiMahasiswa[i];
            }

            if (nilaiMahasiswa[i] > nilaiTerbesar) 
            {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
        }

        System.out.println();
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
    }
    
}
