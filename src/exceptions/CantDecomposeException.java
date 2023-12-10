package exceptions;

public class CantDecomposeException extends Exception {
    public CantDecomposeException(String name, int n){
        super("I can't decompose "+n+" using "+name+" sequence.");
    }
}
