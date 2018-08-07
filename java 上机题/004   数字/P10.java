package com.dingya.number;

/**
 * 10.一个排好序的int数组，找出两数之和为m的所有组合
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P10 {
	/*
	 * 测试方法
	 */
	public static void main(String[] args) {
		int[] arr = { -4, 2, 5, 6, 8, 9, 9, 10, 11, 19 };
		getGroup(arr, 15);
	}

	private static void getGroup(int[] arr, int m) {
		if (null == arr && arr.length == 0) {
			try {
				throw new Exception("problems2.Test5.getGroup(int[], int):参数int[]没有长度");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			if (arr[start] + arr[end] == m) {
				System.out.printf("和为%d的数组的两个数是:%d,%d%n", m, arr[start], arr[end]);
				start++;
				end--;
			} else if (arr[start] + arr[end] < m) {
				start++;
			} else if (arr[start] + arr[end] > m) {
				end--;
			}
		}
	}
}
