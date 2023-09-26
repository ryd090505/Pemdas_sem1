

public class operator05 {
    public static void main(String[] args){
        System.out.println(5 > 1); //lebih besar
        System.out.println(5 < 1); //lebih kecil
        System.out.println(5 >= 1); //lebih besar sama dengan
        System.out.println(5 <= 1); //lebih kecil sama dengan
        System.out.println(5 == 1); //sama dengan
        System.out.println(5 != 1); //tidak sama dengan

        System.out.println();

        boolean status1, status2;
        status1 = true; //bisa diisi false
        status2 = true; //bisa diisi false
        System.out.println(status1 || status2); // || bisa diganti dengan &&

        //contoh 

        boolean status3, status4;
        status3 = 5 > 1; //true
        status4 = 5 != 5; //false
        System.out.println(status3 && status4);

    }
}
