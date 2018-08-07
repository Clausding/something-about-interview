import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: dingya
 * @Description: 在int数组中，找出两个数字，它们的和等于一个给定的数
 * @Date: Created in 9:36 2018/6/14
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9,Output: index1=1, index2=2
 */
public class TwoSum {
    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] indexs = new TwoSum().getIndexs(numbers, 9);
        for (int i = 0; i < indexs.length; i++) {
            System.out.println(indexs[i]);
        }
    }

    /**
     * 在int数组中，找出两个数字，它们的和等于一个给定的数
     *
     * @param arr    int数组
     * @param target
     * @return {index1, index2},两个数字的下标(起始值1)，且index1 < index2
     */
    public int[] getIndexs(int[] arr, int target) {
        int[] result = {0, 0};
        int len = arr.length;
        int index1 = 0;
        int index2 = len - 1;
        Node[] nodes = new Node[len];
        for (int i = 0; i < len; i++) {
            nodes[i] = new Node(i, arr[i]);
        }
        Arrays.sort(nodes);
        while (index1 < index2) {
            int value1 = nodes[index1].getNodeValue();
            int value2 = nodes[index2].getNodeValue();
            int sum = value1 + value2;
            if (sum == target) {
                break;
            } else if (sum < target) {
                index1++;
            } else {
                index2--;
            }
        }
        result[0] = nodes[index1].getNodeIndex() + 1;
        result[1] = nodes[index2].getNodeIndex() + 1;
        Arrays.sort(result);
        return result;
    }

    private class Node implements Comparable<Node> {
        private int nodeIndex;
        private int nodeValue;

        public int getNodeIndex() {
            return nodeIndex;
        }

        public int getNodeValue() {
            return nodeValue;
        }

        /**
         * 构造方法
         *
         * @param nodeIndex
         * @param nodeValue
         */
        public Node(int nodeIndex, int nodeValue) {
            this.nodeIndex = nodeIndex;
            this.nodeValue = nodeValue;
        }

        @Override
        public int compareTo(Node o) {
            return this.getNodeValue() - o.getNodeValue();
        }
    }
}
