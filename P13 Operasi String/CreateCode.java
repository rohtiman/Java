import java.beans.Statement;

public class CreateCode{

    static String tahun_ajaran = "2017-2018";
    static String semester = "Gasal";
    static String kd_prodi = "153";
    static String urut = "01";
    static String kode = "";

    public static void set_kode(){
        //statement;
        //output kode = "1718115301"
        String kode1 = tahun_ajaran.substring(2, 4);
        String kode2 = tahun_ajaran.substring(7, 9);
        if(semester.equals("Gasal")){
            semester ="1";
        }else{
            semester ="2";
        }
        kode = kode1+kode2+semester+kd_prodi+urut; 
        int foo = Integer.parseInt(kode);//konversi string to int
        for(int i=1; i<=20; i++ ){
            System.out.println(foo);
            foo++;
        }
        
    }

    public static void main(String[] args){
        set_kode();
    }
}