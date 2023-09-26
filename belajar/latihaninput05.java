import java.util.Scanner;

public class latihaninput05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilai; //char index = 'A';

        System.out.print("Nilai: ");
        nilai = input.nextInt();

        if(nilai <= 100 && nilai >= 80){
            System.out.println("A"); //index ='A';
            System.out.println("LULUS");
        } else if(nilai < 80 && nilai >= 60){
            System.out.println("B"); //index ='B';
            System.out.println("LULUS");
        } else if(nilai < 60 && nilai >= 50){
            System.out.println("C"); //index = 'C';
            System.out.println("LULUS");
        } else if(nilai < 50 && nilai >= 40){
            System.out.println("D"); //index = 'D';
            System.out.println("TIDAK LULUS");
        }else if(nilai < 40 && nilai >= 0){
            System.out.println("E"); //index = 'E';
            System.out.println("TIDAK LULUS");

        //if(index == 'A'  || 'B' || index == 'C') {
        //System.out.println(index);
        //System.out.println("LULUS");
        //} else {
        //System.out.println(index);
        //System.out.println("TIDAK LULUS ");


        }
    }
}

