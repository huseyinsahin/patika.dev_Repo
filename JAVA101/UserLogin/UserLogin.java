import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter username : ");
        userName = input.nextLine();

        System.out.print("Please enter password : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Login Successful..");
        }else{
            System.out.println("Login Failed!!!");
            System.out.print("Do you want to reset your password?" + 
                             "\n1 : Yes, I want" + "\n2 : No, I do not want." +
                             "\nPlease make your selection : ");
            
            int selection = input.nextInt();
            input.nextLine();

            switch(selection){
                case 1:
                    System.out.print("Enter a new password : ");
                    newPassword = input.nextLine();

                    if(newPassword.equals("java123")){
                        System.out.print("Could not create password, please enter another password..");
                    }
                    else{
                        System.out.print("Congratulations, password created" + 
                        "\nYour new password : " + newPassword);
                    }
                    break;
                case 2:
                    System.out.print("You Didn't Want to Reset Your Password.");
                    break;
                default:
                    System.out.print("You made an incorrect entry!!");
            }
            
        }

        input.close();
    }
}
