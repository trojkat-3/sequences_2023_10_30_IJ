package printer;

import java.io.FileWriter;
import java.io.IOException;

public class PrinterFile extends Printer {

    String filename;

    public PrinterFile(String filename) {
        this.filename = filename;
        try (FileWriter fw = new FileWriter("output/" + filename);) {
            fw.write("");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    protected void output(String str) {
        try (FileWriter fw = new FileWriter("output/" + filename, true);) {
            fw.write(str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
