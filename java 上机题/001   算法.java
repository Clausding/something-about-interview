

/*
	 * 折半查找
	 */
	public static int halfSearch(int[] arr, int value) {
		int min, mid, max;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) / 2;
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid;
			} else {
				min = mid;
			}
			mid = (min + max) / 2;
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}

/**
 * 50个人围坐一圈，当数到三或者三的倍数出圈，问剩下的人是谁，原来的位置是多少（约瑟夫环问题）
 * 
 * @date 2018年5月3日
 * @author dingya
 */
public class P1 {
	public static void main(String[] args) {
		int result = circle(10, 3);
		System.out.println(result);
	}

	public static int circle(int total, int k) {
		int index = -1;
		List<Integer> dataList = new LinkedList<>();
		for (int i = 0; i < total; i++) {
			dataList.add(i);
		}
		while (dataList.size() > 1) {
			index = (index + k) % dataList.size();
			System.out.println(index);
			dataList.remove(index--);
		}
		return dataList.get(0).intValue();
	}
}