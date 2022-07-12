import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    private String email;
    private int mailboxCapacity;

    public Email(String firstName, String lastName){

        this.firstName= firstName.toLowerCase().replaceAll(" ","");
        this.lastName = lastName.toLowerCase().replaceAll(" ","");
        System.out.println(this.firstName + " " +this.lastName);
        this.department = setDepartment();
        this.password = randomPassword();

    }

    public String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Accounting\n3 for Development\n0 for none");
        Scanner keyboard = new Scanner(System.in);
        switch (keyboard.nextInt()){
            case 1:
                return "Sales";


            case 2:
                return  "Accounting";


            case 3:
                return  "Development";


            case 0:
                return  "";

        }
        System.out.println(department);
        return "Error";
    }

    public String randomPassword(){
        System.out.println("Enter the lenght of the password: ");
        Scanner keyboard = new Scanner(System.in);
        int length = keyboard.nextInt();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] password = new char[length];
        for (int i = 0;i < length; i++){
             int random = (int)(Math.random() * alphabet.length);
             password[i] = alphabet[random];
         }
        System.out.println(password);
        return new String(password);

    }
}
