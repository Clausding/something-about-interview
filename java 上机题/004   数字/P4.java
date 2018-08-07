package com.dingya.number;

/**
 *4. 一个数组中，有一个元素只出现1次，其余元素都出现3次。编写代码找到这个元素。
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P4 {
	public static void main(String[] args) {
		int[] intArray = { 5, 5, 5, 6, 6, 6, 7, 1, 1, 1 };
		Integer result = findTheNumber(intArray);
		if (null != result) {
			System.out.println(result);
		} else {
			System.out.println("没有找到");
		}
	}

	/**
	 * 找到这个元素
	 * @param intArray
	 * @return
	 */
	private static Integer findTheNumber(int[] intArray) {
		int arrayLength = intArray.length;
		// 对这个数组排序
		bubbleSort_array(intArray);
		// 判断数组的第一个元素
		if (intArray[0] != intArray[1]) {
			return intArray[0];
		}
		// 判断数组的最后一个元素
		if (intArray[arrayLength - 1] != intArray[arrayLength - 2]) {
			return intArray[arrayLength - 1];
		}
		// 数组其它元素和前后元素一致吗
		for (int i = 1; i < arrayLength - 1; i++) {
			if (intArray[i] != intArray[i - 1] && intArray[i] != intArray[i + 1]) {
				return intArray[i];
			}
		}
		return null;
	}

	/**
	 * 对数组进行冒泡排序
	 * @param intArray
	 */
	public static void bubbleSort_array(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - 1 - i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
	}

}
