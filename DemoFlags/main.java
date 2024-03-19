import java.awt.Color;

public class test {

    public static final int YELLOW = new Color(250, 201, 20).getRGB();
    public static final int BLUE = new Color(17, 13, 99).getRGB();
    public static final int RED = new Color(196, 0, 15).getRGB();
    public static final int BLACK = new Color(5, 5, 5).getRGB();
    public static final int WHITE = new Color(255, 255, 255).getRGB();
    public static final int GREEN = new Color(35, 138, 51).getRGB();

    public static void main(String[] args) {
        int[][] flagMatrix = {};

        for (int h = 1; h <= 2; h += 1)
            for (int w = 1; w <= 2; w += 1) {
                flagMatrix = createflag(h * 12, w * 24);

                JOptionPaneArrays.showColorArray2D(null, flagMatrix);

            }

    }

    public static int[][] createCOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;
        
        rowIni = (height * 0) / 4;
        rowEnd = (height * 2) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        rowIni = (height * 2) / 4;
        rowEnd = (height * 3) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 3) / 4;
        rowEnd = (height * 4) / 4;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createVENflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 3;
        rowEnd = (height * 1) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = YELLOW;

        rowIni = (height * 1) / 3;
        rowEnd = (height * 2) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 2) / 3;
        rowEnd = (height * 3) / 3;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createPOLflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 1;
        colEnd = (width * 1) / 1;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createPANflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (width * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createCHIflag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = BLUE;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = (height * 1) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = WHITE;

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (width * 0) / 2;
        colEnd = (width * 2) / 2;

        for (int r = rowIni; r < rowEnd; r += 1)
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;

        return flag;
    }

    public static int[][] createCZEflag(int height, int widht) {
        int[][] flag = new int[height][widht];
        int rowIni = 0, rowEnd = 0, colIni = 0, colEnd = 0;

        rowIni = (height * 0) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 0) / 2;
        colEnd = (height * 1) / 2;
        for (int c = colIni; c < colEnd; c += 1) {
            for (int r = rowIni; r < rowEnd - (c * 2); r++)
                flag[r + c][c] = BLUE;
        }

        rowIni = (height * 0) / 2;
        rowEnd = (height * 1) / 2;
        colIni = 0;
        colEnd = widht;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni + r + 1; c < colEnd; c += 1) {
                flag[r][c] = WHITE;
                flag[height - 1 - r][c] = RED;
            }
        }

        rowIni = (height * 1) / 2;
        rowEnd = (height * 2) / 2;
        colIni = (height * 1) / 2;
        colEnd = (widht * 2) / 2;
        for (int r = rowIni; r < rowEnd; r += 1) {
            for (int c = colIni; c < colEnd; c += 1)
                flag[r][c] = RED;
        }
        return flag;
    }