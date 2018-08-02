class RandomElement
{
static void Selsort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j>0;j--)
			{
			if(arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	}
	
	static void printArray(int arr[])
	{
		for(int a:arr)
	System.out.print(a+"\t");

	}
	
	static void Disp(int arr[])
	{
		int n=arr.length;
		
	Selsort(arr);
	//for(int i=0,j=n-1;i<--n/2;i++,--j)  output will be 1,11,1,10,2,9,4,7,6,6
	for(int i=0,j=n-1;i<n/2;i++,--j)     // output will be 1,11,1,10,2,9,4,7
	{
	System.out.print(arr[i]+","+arr[j]+",");
	//j--;
	}
	System.out.print(arr[n/2]);
		
	System.out.print('\n');
	//printArray(arr);  you can see output of soted array by uncommenting it 
	}
public static void main(String s[])
{
int arr[]=new int[]{1,4,1,7,10,2,6,9,11};
Disp(arr);
}
}