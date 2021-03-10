package algorithmJava.lesson9.sparseArray;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        chessArr1[4][5]=2;
        FileTreat.write(chessArr1);
        FileTreat.read("D:\\sparseArr.txt");
    }
}
