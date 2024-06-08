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
