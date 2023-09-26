import java.util.Scanner;

public class latihaninput02 {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int bil1, bil2, hasil; //bisa menggunakan double untuk menghitung pembagian

        System.out.print("Bilangan 1: ");
        bil1 = input.nextInt(); //bisa menggunakan nextDouble

        System.out.print("Bilangan 2: ");
        bil2 = input.nextInt();

        hasil = bil1 + bil2;
        System.out.print("Hasil: " + hasil);


    }
    
}
