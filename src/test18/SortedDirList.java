package test18;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;


public class SortedDirList {
    private String[] dirList;
    public  SortedDirList(String path){
        String[] dirlist=new File(path).list();
        Arrays.sort(dirList);

    }
    public String[] list() { return dirList; }
    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> slist = new ArrayList<String>();
        int count = 0;
        for(String s : dirList) {
            if(pattern.matcher(s).matches()) {
                count++;
                slist.add(s);
            }
        }
        return slist.toArray(new String[count]);
    }
    public static void main(String[] args) {

    }
}