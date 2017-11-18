public class RumusMatematika{

    double a, t;//deklarasi variable
    double l_segitiga;

    public static void main(String args[]){//method main static
        RumusMatematika rm = new RumusMatematika();//deklarasi object dengan nama rm
        rm.luasSegitiga();//pemangilang method luas segitiga
        //luasSegitiga();static cara pemangilan
    }

    void luasSegitiga(){//method void
        a=7;
        t=10;
        l_segitiga=0.5 * 1 *t;
        System.out.println("Luas segitiga = "+l_segitiga);
    }

    

}