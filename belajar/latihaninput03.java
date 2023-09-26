import java.util.Scanner;

public class latihaninput03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username, password, status;
        status = "Login gagal";

        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if(username.equals("root") && password.equals("rahasia")){
            status = "Login Berhasil!";
        } 
        System.out.println(status);
        


    }
}
    

