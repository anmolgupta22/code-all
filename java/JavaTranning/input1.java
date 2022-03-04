package JavaTranning;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class input1
{
    public static void main(String[] args) throws IOException
            {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("input.txt");
            fout = new FileOutputStream("out.txt");
            int c;
            while ((c = fin.read()) != -1) {
                fout.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fin != null) {
                fin.close();
                if (fout != null) {
                    fout.close();
                }
            }
        }
    }
}
