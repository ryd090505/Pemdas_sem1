public class tugas01 {
    public static void main(String[] args){
        String nama, nim, status;
        double mtk, ipa, bahasa, nilaitotal;
        boolean ukt = true;

        nama = "Muhammad Riyadh Maulana";
        nim = "2311016110013";
        mtk = 55;
        ipa = 66;
        bahasa = 77;
        nilaitotal = mtk + ipa + bahasa;
        status = "Anda Lulus";

        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.println("Nilai  : ");
        System.out.println("----------------");
        System.out.println("MATEMATIKA : " + mtk);
        System.out.println("IPA        : " + ipa);
        System.out.println("BAHASA     : " + bahasa);
        System.out.println("--------------------");
        System.out.println("Nilai total :" + nilaitotal / 3);   
        
        System.out.println();
        
        if(nilaitotal >= 60 && ukt == true){
            System.out.println(status);
        }
    
        
  



    }
    



}
