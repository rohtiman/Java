public class DemoIfElseIf{
    public static void main(String[] args){
        double grade = 92.0;
        if( grade >= 90 ){
            System.out.println("Exellent!");
        }else if( grade < 90){
            System.out.println("Good hob!");
        }else if( grade < 80){
            System.out.println("Study Harder!");
        }else{
            System.out.println("Sorry, you failed");
        }
    }
}