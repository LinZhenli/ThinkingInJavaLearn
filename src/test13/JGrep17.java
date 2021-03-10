package test13;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// what
public class JGrep17 {
    public static void main(String[] args) throws IOException {
        if(args.length<1) {
            System.out.println("No File input!");
            System.exit(0);
        }/*wer*/
        FileReader fileInputStream = new FileReader(new File(args[0]));
        BufferedReader br=new BufferedReader(fileInputStream);
        String s=null;
       while((s=br.readLine())!=null) {
                Pattern pt=Pattern.compile("/\\*.*\\*/");
                Matcher mt= pt.matcher(s);
                if(mt.find())
                {
                    System.out.println(mt.group());
                }
                mt.reset();

                pt= Pattern.compile("//\\.*"); /* helo*/
                mt=pt.matcher(s);
             if(mt.find())
                System.out.println(s);
       }
    }
}