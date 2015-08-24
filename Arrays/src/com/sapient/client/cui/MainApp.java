package com.sapient.client.cui;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin");
		
		
		int[][] num;
		num= new int[5][];
		num[0]= new int[3];    //zigzag array
		num[1]= new int[4];
		num[2]= new int[2];
		num[3]= new int[5];
		
		
		
		
		int src[];
		int dest[];
		src= new int[10];
		for (int i = 0; i < src.length; i++) {
			src[i]= i*7;
		}
		dest= new int[11];
		int length= src.length;
		System.arraycopy(src, 0, dest, 1, length);
		for (int data = 0; data < dest.length; data++) {
			System.out.print(data);
		}

		}	
		
		
		
		
		
		/* int [][] num;
		num = new int[5][3];
		num[1][1]=7;
		for (int[] r : num)
		{
			for (int c : r)
			{
				System.out.println(c);
			}
		}

		int[][][] arr;
		arr= new int[3][4][2];
		arr[1][1][1]=11;
		for (int[][] is : arr) {
			for (int[] is2 : is) {
				System.out.println(" ");
				for (int i : is2) {
					System.out.print(i);
				}
			}
		}
		*/
	int[][] num= {{1,2,3},{3,4,5},{6,7,8}};
	
	
		
		
	}


