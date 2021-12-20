import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int degree;
        Scanner input=new Scanner(System.in);
        System.out.println("Temperature=");
        degree=input.nextInt();

        if(degree<5){
            System.out.println("Kayak yapılabilir");
        }
        if (degree>=5 && degree<15){
            System.out.println("Sinemaya gidilebilir.");
        }
        if( degree>=15 && degree<25){
            System.out.println("Piknik yapilabilir");
        }
        if(degree>=25){
            System.out.println("Yuzulebilir");
        }
    }
}
