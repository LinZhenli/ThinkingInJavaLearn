package util;

import sun.reflect.generics.tree.Tree;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

//Produce a sequence of File objects that match a
//regular expression in either a local directory.
//or by walking a directory tree.
public class Directory {
    public static File[]
    local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) {//Overloaded
        return local(new File(path), regex);
    }

    //A two-tuple for returning a pair of objects:
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();

        //The default iterable element is the file list:
        @Override
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        @Override
        public String toString() {

            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for (File f :
                    files) {
                s1.append(f.toString()).append("\n");
            }
            for (File l :
                    dirs) {
                s2.append(l.toString()).append("\n");
            }
            ;
            return
                    "files=\n" + s1 +
                            "\ndirs=\n" + s2;
        }

    }

    public static TreeInfo walk(String start, String regex) {//Begin recursion
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {//Begin recursion
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {//Begin recursion
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {//Begin recursion
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item :
                startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));//关键在这个递归
            } else //Regular file
                if (item.getName().matches(regex)) {
                    result.files.add(item);
                }
        }
        return result;
    }

    //Simple validation test:
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println(walk("D:\\workspace\\ThinkingInJava\\src"));
        else
            for (String arg : args) {
                System.out.println(walk(arg));
            }
    }
}
