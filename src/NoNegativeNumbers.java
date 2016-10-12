public class NoNegativeNumbers extends Exception {
    public NoNegativeNumbers(String msg) {
        super("Negatives not allowed: " + msg);
    }
}