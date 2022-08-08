import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\c1.txt");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\OneDrive\\Documents\\c2.txt");
        int i=fis.read();
        while(i != -1){
            fos.write(i);
            i=fis.read();
        }

    }
}
