public class TestTabungan{
    
    public static void main(String[] args){
        Tabungan tabungan=new Tabungan(5000);
        System.out.println("Saldo awal : "+tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah Uang yg Diambil : 2300");
        System.out.println("sald sekarang : "+tabungan.saldo)
    }
}