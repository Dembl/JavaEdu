package generics.printables;

import java.io.FileWriter;
import java.io.IOException;

public class Report implements Printable{
    //todo sdelat' polya private i dobavit' setter-getter
    String name;//report_name
    String body;

    @Override
    public void print() throws IOException {
        //todo perepisat na try-catch-with-resources
        try(FileWriter fileWriter = new FileWriter("out/report.txt")){
            fileWriter.write("Name: "  + this.name);
            fileWriter.write('\n' + this.body);

        }
       /* FileWriter fileWriter = new FileWriter("out/report.txt");
        fileWriter.write("Name: "  + this.name);
        fileWriter.write('\n' + this.body);
        */
    }
}
