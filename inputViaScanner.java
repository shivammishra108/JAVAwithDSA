import java.util.Scanner;
public class inputViaScanner {
    public static void main(String []args){
        System.out.println("Enter any string: ");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("You enterd :\n" + str);
    }
}
