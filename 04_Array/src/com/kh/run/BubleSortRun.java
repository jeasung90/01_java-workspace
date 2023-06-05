package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {
		int[] arr = {22,90,30,68,87,1,13};
		// 임시 변수 => temp
		int temp=0;
		
		for(int i=0; i<arr.length;i++) {// 전체 사이클
			for(int k=1;k<arr.length;k++) { // 안쪽 사이클
				
				if(arr[k-1]>arr[k]) { // 앞의 숫자가 뒤의 숫자보다 큰 경우
					temp = arr[k-1]; // temp에 앞에있는 숫자 보관
					arr[k-1]=arr[k]; // 앞자리에 더 작은 숫자를 넣기
					arr[k]=temp;	// temp에 보관한 숫 자를 뒷자리에 넣기
					
				}
				
				
				
				
				
			}
		}
		
	}

}
