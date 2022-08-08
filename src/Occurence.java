import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) throws IOException {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter full file name");
        String fn=s1.next();

        System.out.println("Enter the character");

        char c;
        c = s1.next().charAt(0);
      System.out.println(fn);
        System.out.println(c);

        FileReader fr=new FileReader(fn);
        int i=fr.read();
        int count=0;
        while( i != -1) {
            if((char) i ==c){
                count++;
            }
          //  System.out.print((char) i);
            i = fr.read();
        }
        System.out.println(count);
    }

}
