package generics.printables;

import java.io.IOException;

public class Log implements Printable {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void print() throws IOException {
        System.out.println(this.info);
    }
}
