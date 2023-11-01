public class matrixMul {
    public static void main(String[] args) {
        int arr1[][] = {{2,3,4},{5,6,7}};
         int arr2[][] = {{2,3,4},{5,6,7},{2,3,4}};
          

        int result[][] = new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr1[1].length;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][j]; 
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print(result[i][j]+" ");

            }
            System.out.println();
        }

        
    }
    
}
