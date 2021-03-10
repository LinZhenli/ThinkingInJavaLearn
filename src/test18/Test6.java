package test18;

import util.ProcessFiles;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) throws IOException {
                Date modDate = new Date(file.lastModified());
                try{
                    if(modDate.after(sdf.parse(args[1])))
                         System.out.println(file.getAbsolutePath()) ;
                }catch (Exception e)
                {
                    System.err.println(e);
                }
            }
        },"java").start(args);
    }

}
