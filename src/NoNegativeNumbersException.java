public class NoNegativeNumbersException extends Exception {
    public NoNegativeNumbersException(String msg) {
        super("Negatives not allowed: " + msg);
    }
}