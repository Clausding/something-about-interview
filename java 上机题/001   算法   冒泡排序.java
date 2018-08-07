/**
 * 冒泡排序的高逼格写法
 * 
 * @date 2018年5月3日
 * @author dingya
 */
public class P3 implements Sorter {
	@Override
	public <T extends Comparable<T>> void sort(T[] list) {
		boolean swapped = true;
		for (int i = 1, len = list.length; i < len && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < len - i; ++j) {
				if (list[j].compareTo(list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

	@Override
	public <T> void sort(T[] list, Comparator<T> comp) {
		boolean swapped = true;
		for (int i = 1, len = list.length; i < len && swapped; ++i) {
			swapped = false;
			for (int j = 0; j < len - i; ++j) {
				if (comp.compare(list[j], list[j + 1]) > 0) {
					T temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}
}

interface Sorter {
	/**
	 * 排序
	 * 
	 * @param list
	 *            待排序的数组
	 */
	public <T extends Comparable<T>> void sort(T[] list);

	/**
	 * 排序
	 * 
	 * @param list
	 *            待排序的数组
	 * @param comp
	 *            比较两个对象的比较器
	 */
	public <T> void sort(T[] list, Comparator<T> comp);
}