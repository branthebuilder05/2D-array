
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[][]={{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
		
		for(int i=arr.length-1,k=0;i>=0;i--,k++){
		    for(int j=0,l=k;j<=i;j++,l++){
		        System.out.println(arr[j][l]+" ");
		    }
		}
		
		
		
	}
}




public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int arr[][]={{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
		
// 		for(int i=arr.length-1,k=0;i>=0;i--,k++){
// 		    for(int j=0,l=k;j<=i;j++,l++){
// 		        System.out.println(arr[j][l]+" ");
// 		    }
// 		}

        for(int i=0;i<arr.length;i++)
            for (int j=0;j<arr.length-i;j++)
                     System.out.println(arr[j][j+i]+" ");
		
		
		
	}
}
