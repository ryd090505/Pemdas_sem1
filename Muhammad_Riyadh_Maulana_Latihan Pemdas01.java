import java.util.Scanner;

public class Muhammad_Riyadh_Maulana_2311016110013 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    String nama, nama2, nama3, nim, nim2, nim3;
    String status = null;
    String status2 = null;
    String status3 = null;
    float nilai1, nilai2, nilai3, nilai4, nilai5, nilai6;
    double avg1;
    double rata2;
    double rata3;

    //INPUT
    System.out.println("===================");
    System.out.println("Input Nilai");
    System.out.println("===================");
    
    System.out.print("Nama : ");
    nama = input.nextLine();
    System.out.print("NIM : ");
    nim = input.nextLine();
    System.out.print("Nilai 1 : ");
    nilai1 = input.nextFloat();
    System.out.print("Nilai 2 : ");
    nilai2 = input.nextFloat();
    avg1 = (nilai1 + nilai2)/2; 
    System.out.println("===================");

    System.out.print("Nama : ");
    input.nextLine();
    nama2 = input.nextLine();
    System.out.print("NIM : ");
    nim2 = input.nextLine();
    System.out.print("Nilai 1 : ");
    nilai3 = input.nextFloat();
    System.out.print("Nilai 2 : ");
    nilai4 = input.nextFloat();
    rata2 = (nilai3 + nilai4)/2; 
    System.out.println("===================");

    System.out.print("Nama : ");
    input.nextLine();
    nama3 = input.nextLine();
    System.out.print("NIM : ");
    nim3 = input.nextLine();
    System.out.print("Nilai 1 : ");
    nilai5 = input.nextFloat();
    System.out.print("Nilai 2 : ");
    nilai6 = input.nextFloat();
    rata3 = (nilai5 + nilai6)/2; 
    System.out.println("===================");

    //OUTPUT
    System.out.println("==================================================================================================================");
    System.out.println("Nama" + "\t\t\t" + "NIM" + "\t\t\t" + "Nilai 1" + "\t\t" + "Nilai 2" + "\t\t" + "Rata-Rata" + "\t" + "Status");
    System.out.println("==================================================================================================================");
    if (avg1 > 50 && avg1 <=100){
        status = "LULUS";
    } else if (avg1 < 50 && avg1 >=0) {
        status = "TIDAK LULUS";
    }
    if (rata2 > 50 && rata2 <=100){
        status2 = "LULUS";
    } else if (rata2 < 50 && rata2 >=0) {
        status2 = "TIDAK LULUS";
    }
    if (rata3 > 50 && rata3 <=100){
        status3 = "LULUS";
    } else if (rata3 < 50 && rata3 >=0) {
        status3 = "TIDAK LULUS";
    }

    System.out.println(nama + "\t\t" + nim + "\t\t" + nilai1 + "\t\t" + nilai2 + "\t\t" + avg1 + "\t\t" + status);
    System.out.println(nama2 + "\t\t" + nim2 + "\t\t" + nilai3 + "\t\t" + nilai4 + "\t\t" + rata2 + "\t\t" + status2);
    System.out.println(nama3 + "\t\t" + nim3 + "\t\t" + nilai5 + "\t\t" + nilai6 + "\t\t" + rata3 + "\t\t" + status3);


    }





}
