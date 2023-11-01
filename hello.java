public class hello{

    public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr[]=new int[]{1,2,3,4,5,6,7};
		int left=0,right=arr.length-1;
		while(left<right){
			
		    
		     if(arr[left]%2==0) //if left is even,just increment and done
                     left++;
		    
		    else if(arr[left]%2!=0){ //if left is odd swap with right
		        int temp=arr[left];
		        arr[left]=arr[right];
		        arr[right]=temp;
		        right--;
		    }
        
		}
		for(int ele:arr)
		    System.out.print(ele+" ");
		



}
}