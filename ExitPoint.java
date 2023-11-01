public class ExitPoint {
    public static void main(String[] args) {
        //exit point
        int arr[][] = {{0,0,1,0},{1,0,0,1},{0,0,0,0},{1,0,1,0}};


        int dir=0;
        // 0 means east
        // 1 means south
        // 2 means west 
        // 3 means north
        int ci=0,cj=0;
        while(ci<arr.length && cj<arr[0].length){
            if(arr[ci][cj]==1){
                dir++;
                dir%=4;
                switch(dir){
                case 0: cj++; break;
                case 1: ci++; break;
                case 2: cj--; break;
                case 3: ci--; break;


                }
}
            else{
                switch(dir){
                case 0: cj++; break;
                case 1: ci++; break;
                case 2: cj--; break;
                case 3: ci--; break;

           
            }



        }
        
    }
    System.out.println(ci+" "+cj);
}
}
