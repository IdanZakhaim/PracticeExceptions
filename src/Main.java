import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first");
            int num1 = scanner.nextInt();
            System.out.println("Enter second");
            int num2 = scanner.nextInt();
            int result = num1/num2;
            System.out.println("The result is : " + result);
            FileWriter fileWriter = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\PracticeExceptions\\Result.txt");
            fileWriter.write(String.valueOf(result));
            fileWriter.close();
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("num 2 was 0");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}