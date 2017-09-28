public class DemoIfElse{
    public static void main(String[] args){
        double hargabeli = 8000.0;
        double hargajual = 90000;

        if(hargajual <= hargabeli){
           System.out.println("Harga jual tidak boleh kurang dari harga beli");
        }else{
            System.out.println("Data sudah benar");
        }
    }
}