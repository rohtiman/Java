import java.io.*;

public class GetInputReader{
    public static void main(String[] args){
        BuffereReader datain = new BuffereReader(new InputStreamReader(System.in));

        String nim="", nama="", tempat="", tgllahir="";
        System.out.print("Masukan Nama anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukan NIM anda : ");
            nim = dataIn.readLine();    
        System.out.print("Masukan Tempat Lahir anda : ");
            tempat = dataIn.readLine();
        System.out.print("Masukan Tanggal Lahir anda : ");
            tgllahir = dataIn.readLine();

            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("Selamat datang " + nama);
            System.out.println("NIM     : " + nim);
            System.out.println("Tempat Lahir    : " + tempat);
            System.out.println("Tanggal lahir   : " + tgllahir);
    }
}