import java.util.Scanner;
class sorting
{
public static void main(String args[]){
	int n,temp,i,j;
	System.out.println("enter size of array:");
	Scanner inp=new Scanner(System.in);
	n=inp.nextInt();
	int arr[]=new int[20];
	System.out.println("enter array elements:");
	 for(i=0;i<n;i++){
	 	arr[i]=inp.nextInt();
	 }
	for(i=0;i<n;i++)
  	{
    		for(j=i+1;j<n;j++)
     		{
       		if(arr[i]>arr[j])
        		{
          			temp=arr[i];
          			arr[i]=arr[j];
          			arr[j]=temp;
        		}
     		}
  	} 
  	System.out.println("array in ascending order is:");
  	for(i=0;i<n;i++)
  	{
  		System.out.println(arr[i]+"");
  	}
 }	
}
