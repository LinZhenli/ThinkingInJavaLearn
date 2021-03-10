package util;

import java.io.File;
import java.io.IOException;

public class ProcessFiles {

    public interface Strategy{
        /**
         *
         * @param 传进来的文件路径名
         */
        void process(File file) throws IOException;
    }
    private Strategy strategy;
    private String ext;

    /**
     *
     * @param strategy 用于遍历的接口
     * @param ext 后缀名，不带点
     */
    public ProcessFiles(Strategy strategy,String ext){
        this.strategy=strategy;
        this.ext=ext;
    }

    /**
     * 对文件进行遍历，
     * @param args 路径数组。如果为数组长度为0，则传入根路径。如果不为0，则遍历。
     */
    public void start(String[] args){
        try{
            if(args.length==0)
                processDirectoryTree(new File("."));
            else
                for (String arg :
                        args) {
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory())
                        processDirectoryTree(fileArg);
                    else{
                        //Allow user  to leave off extension:
                        if(!arg.endsWith("."+ext))
                            arg +="."+ext;
                        strategy.process(new File(arg).getCanonicalFile());
                    }
                }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void processDirectoryTree(File root) throws IOException{
        for (File file :
                Directory.walk(root.getAbsolutePath(),".*\\."+ext)) {
            strategy.process(file.getCanonicalFile());
        }
    }
    //Demonstration of how to use it:
    public static void main(String[] args) {
        new ProcessFiles(new Strategy() {
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },"java").start(args);
    }

}
