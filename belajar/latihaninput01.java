import java.util.Scanner;

public class latihaninput01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.println("Hello " + nama + "\s" + nim);
    }
    
}
