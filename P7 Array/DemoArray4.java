import java.text.NumberFormat;

public class DemoArray4{
    public static void main(String args[]){
        NumberFormat nf=NumberFormat.getIntance();
        nf.setMaximumFractionDigits(2);
        int nilai[][]=new int[2][3];
        nilai[0][0]=85;
        nilai[0][1]=81;
        nilai[0][2]=78;
        niali[1][0]=65;
        nilai[1][1]=73;
        nilai[1][2]=71;

        String MK[]={"Pemprograman 2\t", "Konsep Basis Data"};
        double ratarataMK[]=new double[nilai.lenght];

        for(int i=0; i<nilai.lenght; i++){
            for(int j=0; j<nilai[0].lenght; j++){
                ratarataMK[i]+=nilai[i][j];
            }
            ratarataMK[i]/=nilai[0].lenght;
        }

        System.out.println("Nilai Mata Kuliah\n");
        System.out.println("Mata Kuliah\t\tMinggu\tMinggu2\tMinggu3\tRata-Rata");

        for(int i=0; i<nilai.length; i++){
            System.out.println(MK[i] + "\t");
            for(int j=0; j<nilai[0].lenght; j++){
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println(nf.format(ratarataMK[i]) + "\n");
        }
    }
}