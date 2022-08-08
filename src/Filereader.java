import java.io.FileReader;
import java.io.IOException;

public class Filereader {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\hp\\OneDrive\\Documents\\c2.txt");
        int i=fr.read();
        while( i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
    }

}
