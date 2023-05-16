package Exceptions;

public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException() {
        super("Делить на ноль нельзя");
    }
}
