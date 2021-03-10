package algorithmJava.lesson9.sparseArray;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import util.Print;

import java.io.*;
import java.util.Arrays;

public class SparseArray {

    public static void main(String[] args) throws IOException {
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        chessArr1[4][5]=2;
        for (int[] row : chessArr1) {

            for (int i : row) {
                System.out.printf("%d\t",i);
            }
            System.out.println("\n");
        }

        //将二维数组转稀疏数组
        //1.先遍历二维数组，得到非0数据的个数
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <11 ; j++) {
                if (chessArr1[i][j]!=0)
                    sum++;
            }
        }
        //2.创建对应的稀疏数组
        int sparseArr[][]=new int[sum+1][3];
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;

        //3.
        int count=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <11 ; j++) {
                if (chessArr1[i][j]!=0){
                    sparseArr[++count][0]=i;
                    sparseArr[count][1]=j;
                    sparseArr[count][2]=chessArr1[i][j];
                }

            }
        }
        System.out.println("稀疏数组为：");
        for (int[] row : sparseArr) {

            for (int i : row) {
                System.out.printf("%d\t",i);
            }
            System.out.println("\n");
        }

        //写入数据
        FileWriter fileWriter=new FileWriter(new File("D:\\sparseArr.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        for (int[] row : sparseArr) {
            StringBuilder line=new StringBuilder();
            for (int i : row) {
                line.append(i+",");

            }
            bufferedWriter.write(line.toString()+"\n");
        }

        bufferedWriter.close();
        fileWriter.close();

        //读取数据
        FileReader fileReader=new FileReader(new File("D:\\sparseArr.txt"));
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int lineCount=0;
        String line=null;
        line=bufferedReader.readLine();
        String[] row1=line.split(",");

        int[][] chessArr2=new int[Integer.valueOf(row1[0])][Integer.valueOf(row1[1])];

       while ((line=bufferedReader.readLine())!=null)
       {
           String []row=line.split(",");
           chessArr2[Integer.valueOf(row[0])][Integer.valueOf(row[1])]=Integer.valueOf(row[2]);
       }


        //稀疏数组转为原始数组。
//        int  row=sparseArr[0][0];
//        int column=sparseArr[0][1];
//        int[][] chessArr2=new int[row][column];
        for (int i = 1; i < sparseArr.length; i++) {

            chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2] ;

        }
        System.out.println("还原稀疏数组：");
        for (int[] row2 : chessArr2) {

            for (int i : row2) {
                System.out.printf("%d\t",i);
            }
            System.out.println("\n");
        }
    }
}

class FileTreat{
    static void write(int data[][]) throws IOException {
        FileWriter fileWriter=new FileWriter(new File("D:\\sparseArr.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        for (int[] row : data) {
            for (int i : row) {
                bufferedWriter.write(i);

            }
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    static int[][] read(String path) throws IOException {
        FileReader fileReader=new FileReader(new File("D:\\sparseArr.txt"));
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int i;
        while ((i= bufferedReader.read())!=-1)
            System.out.print(i);

        fileReader.close();
        bufferedReader.close();
        return null;
    }
}