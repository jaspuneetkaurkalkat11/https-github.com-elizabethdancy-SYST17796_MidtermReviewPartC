package midtermreviewcodeforpartc;

/**
 * PasswordValidator class is responsible for validating passwords according to specified rules.
 * The class follows Object-Oriented Design principles to ensure the code is maintainable and easily extendable.
 *
 * Design Principles:
 * - Encapsulation: Each validation rule is encapsulated in its own method.
 * - Modularity: The validation logic is separated from the main method, making it more modular.
 * - Single Responsibility: The class has a single responsibility, which is to validate passwords.
 * - Open/Closed Principle: The class is open for extension but closed for modification. New validation rules can be added without modifying existing methods.
 */
public class PasswordValidator {
    /**
     * Validates the password based on specified rules.
     * @param password The password to validate.
     * @return true if the password is valid, false otherwise.
     */
    public boolean isValid(String password) {
        return isLengthValid(password) && hasSpecialCharacter(password);
    }

    private boolean isLengthValid(String password) {
        return password.length() >= 8;
    }

    private boolean hasSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
