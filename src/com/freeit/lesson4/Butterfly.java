package com.freeit.lesson4;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 06.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class Butterfly {
    /**
     * нарисовать бабочку с помощью массива *_*
     */
    public static void main(String[] args) {

        boolean[][] stars = new boolean[17][19];// размер поля по Х и У

        //   stars[1][6]=true;stars[1][13]=true;
        //   stars[2][7]=true;stars[2][12]=true;
        //   stars[3][8]=true;stars[3][11]=true;
        //   stars[4][9]=true;stars[4][10]=true;
        //   stars[5][3]=true;stars[5][4]=true;stars[5][8]=true;stars[5][11]=true;stars[5][15]=true;stars[5][16]=true;
        //   stars[6][2]=true;stars[6][5]=true;stars[6][8]=true;stars[6][11]=true;stars[6][14]=true;stars[6][17]=true;
        //   stars[7][2]=true;stars[7][5]=true;stars[7][6]=true;stars[7][9]=true;stars[7][10]=true;stars[7][13]=true;stars[7][14]=true;stars[7][17]=true;
        //   stars[8][2]=true;stars[8][6]=true;stars[8][7]=true;stars[8][8]=true;stars[8][11]=true;stars[8][12]=true;stars[8][13]=true;stars[8][17]=true;
        //   stars[9][3]=true;stars[9][7]=true;stars[9][12]=true;stars[9][16]=true;
        //   stars[10][4]=true;stars[10][5]=true;stars[10][6]=true;stars[10][7]=true;stars[10][12]=true;stars[10][13]=true;stars[10][14]=true;stars[10][15]=true;
        //   stars[11][5]=true;stars[11][6]=true;stars[11][7]=true;stars[11][12]=true;stars[11][13]=true;stars[11][14]=true;
        //   stars[12][3]=true;stars[12][7]=true;stars[12][12]=true;stars[12][16]=true;
        //   stars[13][3]=true;stars[13][7]=true;stars[13][12]=true;stars[13][16]=true;
        //   stars[14][3]=true;stars[14][6]=true;stars[14][8]=true;stars[14][9]=true;stars[14][10]=true;stars[14][11]=true;stars[14][13]=true;stars[14][16]=true;
        //   stars[15][4]=true;stars[15][5]=true;stars[15][14]=true;stars[15][15]=true;

        stars[1][6]=true;stars[1][13]=true;
        stars[2][7]=true;stars[2][12]=true;
        stars[3][8]=true;stars[3][11]=true;
        stars[4][9]=true;stars[4][10]=true;
        stars[5][3]=true;stars[5][4]=true;stars[5][8]=true;stars[5][9]=true ;stars[5][10]=true ;stars[5][11]=true;stars[5][15]=true;stars[5][16]=true;
        stars[6][2]=true;stars[6][5]=true;stars[6][8]=true ;stars[6][9]=true ;stars[6][10]=true ;stars[6][11]=true;stars[6][14]=true;stars[6][17]=true;
        stars[7][2]=true;stars[7][5]=true;stars[7][6]=true;stars[7][9]=true;stars[7][10]=true;stars[7][13]=true;stars[7][14]=true;stars[7][17]=true;
        stars[8][2]=true;stars[8][6]=true;stars[8][7]=true;stars[8][8]=true;stars[8][9]=true ;stars[8][10]=true ;stars[8][11]=true;stars[8][12]=true;stars[8][13]=true;stars[8][17]=true;
        stars[9][3]=true;stars[9][7]=true;stars[9][8]=true ;stars[9][9]=true ;stars[9][10]=true ;stars[9][11]=true ;stars[9][12]=true;stars[9][16]=true;
        stars[10][4]=true;stars[10][5]=true;stars[10][6]=true;stars[10][7]=true;stars[10][8]=true ;stars[10][9]=true ;stars[10][10]=true ;stars[10][11]=true ;stars[10][12]=true;stars[10][13]=true;stars[10][14]=true;stars[10][15]=true;
        stars[11][5]=true;stars[11][6]=true;stars[11][7]=true;stars[11][8]=true ;stars[11][9]=true ;stars[11][10]=true ;stars[11][11]=true ;stars[11][12]=true;stars[11][13]=true;stars[11][14]=true;
        stars[12][3]=true;stars[12][7]=true;stars[12][8]=true ;stars[12][9]=true ;stars[12][10]=true ;stars[12][11]=true ;stars[12][12]=true;stars[12][16]=true;
        stars[13][3]=true;stars[13][7]=true;stars[13][8]=true ;stars[13][9]=true ;stars[13][10]=true ;stars[13][11]=true ;stars[13][12]=true;stars[13][16]=true;
        stars[14][3]=true;stars[14][6]=true;stars[14][8]=true;stars[14][9]=true;stars[14][10]=true;stars[14][11]=true;stars[14][13]=true;stars[14][16]=true;
        stars[15][4]=true;stars[15][5]=true;stars[15][14]=true;stars[15][15]=true;

      // stars[16][]=true;stars[16][13]=true;
        for (int i = 0; i < stars.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < stars[i].length; j++) {
                char mark = (stars[i][j]) ? '*' : ' ';
                System.out.print(mark);
            }
        }
    }
}






