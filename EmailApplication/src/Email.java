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



    public Email(String firstName, String lastName){

        this.firstName= firstName.toLowerCase().replaceAll(" ","");
        this.lastName = lastName.toLowerCase().replaceAll(" ","");
        System.out.println(this.firstName + " " +this.lastName);
        this.department = setDepartment();
        this.password = randomPassword();
        this.company = setCompany();
        this.email = setEmail();
        System.out.println(email);
    }

    public String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Accounting\n3 for Development\n0 for none");
        Scanner keyboard = new Scanner(System.in);
        switch (keyboard.nextInt()){
            case 1:
                return "sales";


            case 2:
                return  "accounting";


            case 3:
                return  "development";


            case 0:
                return  "";

        }
        System.out.println(department);
        return "";
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

    public String setCompany(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the company that you are working: ");
        return keyboard.nextLine().toLowerCase();
    }

    public String setEmail(){
        return this.firstName + this.lastName + "@" + department + company + ".com";

    }
}
