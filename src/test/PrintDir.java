package test;

import util.PPrint;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrintDir {
    static List<String> filePath=new ArrayList();
    public static void main(String[] args) throws IOException {
        String path=".";
        getPath(path);
        System.out.println(PPrint.pformat(filePath));
    }
    static void getPath(String path) throws IOException {
        File f=new File(path);
        if(f.isFile())
        {
            filePath.add(f.getCanonicalPath());
        }
        if(f.isDirectory())
        {
            for (File fileP:
                 f.listFiles(new FileFilter (){
                     @Override
                     public boolean accept(File pathname) {
                         return true;
                     }
                 })) {

                getPath(fileP.getAbsolutePath());
            }
        }
    }

}
