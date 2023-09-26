import java.util.Scanner;

public class bilganjil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bil;

        System.out.print("Builangan: ");
        bil = input.nextInt();

        if(bil % 2== 0){
            System.out.println(bil + "adalah bilangan GENAP");
        } else {
            System.out.println(bil + "adalah bilangan GANJIL");
        }

    }
}
