public class waveTraversal {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int minrow, mincol, maxrow, maxcol;
        minrow = 0;
        mincol = 0;
        maxrow = arr.length - 1;
        maxcol = arr[0].length - 1;

        while (mincol<=maxcol || minrow<=mincol) {
            //// mincolfixed
            for (int i = minrow, j = mincol; i <= maxrow; i++) {
                System.out.println(arr[i][j] + "from 1st");
            }
            mincol++;
            // maxrow fixed
            for (int i = maxrow, j = mincol; j <= maxcol; j++) {
                System.out.println(arr[i][j]+ "from 2nd");
            }
            maxrow--;

            // maxcol fixed
            for (int i = maxrow, j = maxcol; i >= minrow; i--) {
                System.out.println(arr[i][j] + "from 3rd");
            }
            maxcol--;

            // minrow fixed
            for (int i = minrow, j = maxcol; j >= mincol; j--) {
                System.out.println(arr[i][j] + "from 4th");
            }
            minrow++;

        }


            
        

    }
}
