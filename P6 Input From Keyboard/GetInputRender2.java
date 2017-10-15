import java.io.BuffereReader;
import java.io.InputStreamRender;
import java.io.IOException;

public class GetInputRender2{
    public static void main(String[] args){
        BuffereReader dataIn = new BuffereReader(new InputStreamRender(System.io));

        Strng nim="", nama="", tempat="", tgllahir="";
        System.out.print("Masukan Nama anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukan NIM anda : ");
            nim = dataIn.readLine();    
        System.out.print("Masukan Tempat Lahir anda : ");
            tempat = dataIn.readLine();
        System.out.print("Masukan Tanggal Lahir anda : ");
            tgllahir = dataIn.readLine();

            //untuk konversi Double.parseDouble(datain.readline())
            //untuk joption pane = integer.parsein(showinputdialog("inputkan nilai anda : "))

            System.out.println("");
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("Selamat datang " + nama);
            System.out.println("NIM     : " + nim);
            System.out.println("Tempat Lahir    : " + tempat);
            System.out.println("Tanggal lahir   : " + tgllahir);
    }
}