import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, pass;

        System.out.print("Enter username: ");
        user = input.nextLine();

        System.out.print("Enter password: ");
        pass = input.nextLine();

        if(user.equals("John") && (pass.equals("Doe"))){
            System.out.println("Welcome King Doe");
        }else{
            System.out.println("Wrong info!");
        }
    }
}

