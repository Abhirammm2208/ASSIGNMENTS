import java.util.Scanner;
class PasswordValidatorLogic {
    public boolean validatePassword(String password) {
        boolean valid = true;
        if (password.length() > 15 || password.length() < 8) {
            valid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            valid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!password.matches(specialChars)) {
            valid = false;
        }

        return valid;
    }
}
    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        PasswordValidatorLogic passwordValidatorLogic = new PasswordValidatorLogic();
        boolean isValid = passwordValidatorLogic.validatePassword(password);
        if (isValid) {
            System.out.println(password + " is a valid password");
        } else {
            System.out.println(password + " is an invalid password");
        }
    }
}
