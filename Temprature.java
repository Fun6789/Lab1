import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int celsiusDegree= sc.nextInt();
        System.out.println("Degree in Fahrenheit is "+ (celsiusDegree*1.8)+32);
        sc.close();
    }
}
