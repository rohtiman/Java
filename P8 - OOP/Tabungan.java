public class Tabungan{

    int saldo

    public Tabungan(int initsaldo){
        saldo = initsaldo;
    }

    void ambilUang(int jumlah){
        saldo = saldo - jumlah;
    }
}