import java.io.*;
public class program3{
    public static void main(String []args)throws IOException
    {
        int num1,num2,sum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first interger: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the second interger: ");
        num2 = Integer.parseInt(br.readLine());
        sum = num1 + num2;
        System.out.println("Sum = "+ sum);
    }
}