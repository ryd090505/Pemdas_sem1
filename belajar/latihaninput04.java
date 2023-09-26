import java.util.Scanner;

public class latihaninput04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Nilai: ");
        nilai = input.nextInt();

        if(nilai >= 60 && nilai <= 100){
            System.out.println("Lulus");
        } else if(nilai >= 0 && nilai < 60);{
            System.out.println("Tidak Lulus");
        } else (nilai >= 0 && nilai < 60);{
            System.out.println("Nilai rendah");
        }
    
      




    }
}
