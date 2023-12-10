import exceptions.CantDecomposeException;
import exceptions.OutOfBoundsException;
import printer.Printer;
import printer.PrinterFile;
import printer.PrinterStdOut;
import sequence.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Printer printerStdOut = new PrinterStdOut();
        Printer printerFile = new PrinterFile("integers.txt");

        //Integers
        Sequence sq = new Integers();
        printerStdOut.print(sq);
        printerFile.print(sq);

        sq = new Fibonacci(1, 3);
        printerStdOut.print(sq);
        printerFile.print(sq);

        try {
            System.out.println("SUM: " + sq.getSum(40));

            sq = new Arithmetic(1, 3);
            printerStdOut.print(sq);
            printerFile.print(sq);

            System.out.println("SUM: " + sq.getSum(4));
        } catch (OutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        //Squares
        sq = new Squares();
        printerStdOut.print(sq);
        printerFile.print(sq);
        try {
            System.out.println(sq.decompose(666));

            //Primes
            sq = new Primes();
            sq.setMax(10000);
            System.out.println(sq.decompose(30));
            printerStdOut.print(sq);
            printerFile.print(sq);

            //Fibonacci
            sq = new Fibonacci();
            System.out.println(sq.decompose(666));
            printerStdOut.print(sq);
            printerFile.print(sq);
        } catch (CantDecomposeException ex) {
            System.out.println(ex.getMessage());
        }

        sq = new Squares();
        printerStdOut.print(sq);
    }
}