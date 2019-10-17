/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan37.program.rata.rata.nilai;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Rata-Rata Nilai
 */
public class IF0110118016Latihan37ProgramRataRataNilai {
    public static int[] nilaiMhs = new int[10];
    public static int banyakMhs;
    public static double rataNilai;


    public static void hitungRata2(int bMhs) {
    double temp = 0;                       
    Scanner scanner = new Scanner(System.in);
        if(bMhs >10){
    System.out.println("Maaf Banyak Mahasiswa terlalu banyak,silahkan isi ulang kembali ");
        }else{
        for(int i = 1 ; i <= bMhs ; i++){
    System.out.print("Nilai Mahasiswa ke- " + i + " : ");
        nilaiMhs[i] = scanner.nextInt();
            temp += nilaiMhs[i]; 
        }
            rataNilai = temp / bMhs;  
            }
                       
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = scanner.nextInt();
                        
        //proses
        hitungRata2(banyakMhs);
        System.out.println("Maka rata-rata nilainya adalah : " + rataNilai);
        System.out.println("(Developed by Rezky Nur Fauzi)");
    }
    
}
