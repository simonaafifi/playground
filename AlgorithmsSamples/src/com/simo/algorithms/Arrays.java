package com.simo.algorithms;

public class Arrays {
	int[] theGlobalArray=new int[10];
	int arraySize=5;
	public void generateRandomArray(){
		for (int i=0; i<5; i++){
			theGlobalArray[i]=i;//(int)(Math.random()*10+i);
		}
	}
	public void binarySearch(int value){
		int minIndex=0;
		int maxIndex=arraySize;
		int middle=(minIndex+maxIndex)/2;
		
		while(minIndex<=maxIndex){
			if(value<theGlobalArray[middle]){
				maxIndex=middle+1; 
			}else if(value>theGlobalArray[middle]){
				minIndex=middle+1;
			}else{
				break;
			}
			
		}
	}
	public void printArray(){
		System.out.println("******************");
		for(int i=0;i<arraySize; i++){
			System.out.println(theGlobalArray[i]);
		}
		System.out.println("******************");

	}
	public void deleteIndex(int index){
		if(index<theGlobalArray.length){
			for(int i=index; i<theGlobalArray.length-1;i++){
				theGlobalArray[i]=theGlobalArray[i+1];
			}
			arraySize--;
		}
		printArray();
	}
	public void insertAtIndex(int index, int value){
		if(index<arraySize){
			for(int i=arraySize; i>=index;i--){
				theGlobalArray[i]=theGlobalArray[i-1];
			}
			theGlobalArray[index]=value;
			arraySize++;
		}
		printArray();
	}
	public void search(int target){
		int index=-1;
		for(int i=0; i<theGlobalArray.length; i++){
			if(target==theGlobalArray[i]){
				index=i;
				break;
			}
		}
		if(index==-1){
			System.out.println(target+" Not found");
			
		}else {
			System.out.println(target+" is found at the index"+index);
		}
		
	}
	/**
	 * Find the min value and replace across the array
	 * Sorting
	 */
	public void sortByFindingMinAndReplace(){
		
		for(int i=0; i<theGlobalArray.length;i++){
			int minIndex=i;
			int minValue=theGlobalArray[i];
			for(int j=i+1; j<theGlobalArray.length; j++){
				if(theGlobalArray[j]<minValue){
					minValue=theGlobalArray[j];
					minIndex=j;
				}
			}
			if(minIndex!=-1){
				int temp=theGlobalArray[i];
				theGlobalArray[i]=theGlobalArray[minIndex];
				theGlobalArray[minIndex]=temp;
			}
		}
		printArray();

	}
	public void sortBySelection(){
		for(int i=0; i<theGlobalArray.length;i++){
			for(int j=i+1; j<theGlobalArray.length;j++){
				if(theGlobalArray[i]>theGlobalArray[j]){
					int temp=theGlobalArray[i];
					theGlobalArray[i]=theGlobalArray[j];
					theGlobalArray[j]=temp;
					
				}
			}
		}
		printArray();

	}
	public static void main(String[] args) {
		Arrays s= new Arrays();

		s.generateRandomArray();
		s.printArray();
//		s.sortByFindingMinAndReplace();
//		s.sortBySelection();
//		s.deleteIndex(2);
//		s.insertAtIndex(2, 200);
		s.binarySearch(4);

	}

}
