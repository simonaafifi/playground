package com.simo.algorithms;

public class AraaySort {

	static int[] array={7,4,11,14,0,2,5,1,12,8,6,10,17,3};
	public static  void partition(int[]array, int lowerIndex, int higherIndex){
		
		int iL= lowerIndex;
		int jH= higherIndex;
		int pivot= (lowerIndex+higherIndex)/2;
		
		while(iL<=jH){
			while(array[iL]<array[pivot])
				iL++;
				
			while(array[jH]>array[pivot])
				jH--;
			
			//swap
			if(iL<=jH){
				int temp=array[iL];
				array[iL]=array[jH];
				array[jH]=temp;
				iL++;
				jH--;
			}
		}
		if(lowerIndex<jH)
			partition(array,lowerIndex, jH);
		if(higherIndex>iL)
			partition(array,iL,higherIndex);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AraaySort.partition(array,0, array.length-1);
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]+" ");
		}

	}

}
