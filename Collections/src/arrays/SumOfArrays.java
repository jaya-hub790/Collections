package arrays;

public class SumOfArrays {
	public static void main(String[] args) {
		double average=0;
		int [] arr=new int [5];
		int sum=0;
		 //long average;
		arr[0]=20;
		arr[1]=30;
		arr[2]=10;
		arr[3]=50;
		arr[4]=40;
		for (int j = 0; j < arr.length; j++)
		{
			
            System.out.println(arr[j]);
			sum=sum+arr[j];
			
		    average=sum/arr.length;
		}
		System.out.println("Length of the array is:"+arr.length);
		System.out.println("\n sum of the array: "+sum);
		System.out.println("\n average  of the array: "+average);
		
	}

}
