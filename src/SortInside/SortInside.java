package SortInside;

import java.util.*;
import java.io.*;

public class SortInside {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		int Num = str.length();
		
		int[] arr = new int[Num];
		
		for(int i = 0; i < Num; i++) {
			//아스키코드에 의거해서 문자열에서 하나를 분리한 값을 정수로 바꾸어서 배열에 저장
			arr[i] = (str.charAt(i) - 48);
		}
		//내림차순으로 정렬
		for(int i = 0; i < Num - 1; i++) {
			for(int j = i + 1 ;j < Num; j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i : arr) {
			sb.append(i);
		}
		System.out.print(sb);
	}

}
