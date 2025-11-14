import java.util.Scanner;
import java.util.regex.*;
public class PasswordValidator {
    public static boolean IsValidPasswd(String password){
        String regex= "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#@$!%*?&])[A-Za-z\\d#@$!%*?&]{8,}$";
        return password.matches(regex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password=sc.nextLine();

        if(IsValidPasswd(password)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}


// class PasswordValidator {
//     public boolean strongPasswordCheckerII(String password) {
//         if (password.length() < 8) return false;

//         boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
//         String specialChars = "!@#$%^&*()-+";

//         for (int i = 0; i < password.length(); i++) {
//             char ch = password.charAt(i);

//             if (i > 0 && ch == password.charAt(i - 1)) return false; // no same adjacent

//             if (Character.isLowerCase(ch)) hasLower = true;
//             else if (Character.isUpperCase(ch)) hasUpper = true;
//             else if (Character.isDigit(ch)) hasDigit = true;
//             else if (specialChars.indexOf(ch) != -1) hasSpecial = true;
//         }

//         return hasLower && hasUpper && hasDigit && hasSpecial;
//     }
// }
