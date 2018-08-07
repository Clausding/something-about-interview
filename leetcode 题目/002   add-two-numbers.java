import java.util.List;

/**
 * @Author: dingya
 * @Description:利用链表求两个十进制数的和
 * @Date: Created in 9:16 2018/6/15
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Solution {
    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 9, 1};
        int[] arr2 = {5, 6, 4};
        ListNode listNode1 = getList(arr1);
        ListNode listNode2 = getList(arr2);
        ListNode listNode = addTwoNumbers(listNode1, listNode2);

        // 打印结果链表
        System.out.printf("\n%s", "结果链表：");
        printListNode(listNode);
    }

    /**
     * 利用链表求两个十进制数的和
     *
     * @param listNode1
     * @param listNode2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2) {
        ListNode listNode = new ListNode(0);
        ListNode result = listNode;
        int sum = 0;
        int carry = 0;
        while (listNode1 != null && listNode2 != null) {
            printListNode(result, listNode1, listNode2, carry);

            sum = listNode1.value + listNode2.value + carry;
            listNode.next = new ListNode(0);
            listNode = listNode.next;
            listNode.value = sum % 10;
            carry = sum / 10;

            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        while (listNode1 != null) {
            printListNode(result, listNode1, listNode2, carry);

            sum = listNode1.value + 0 + carry;
            listNode.next = new ListNode(0);
            listNode = listNode.next;
            listNode.value = sum % 10;
            carry = sum / 10;

            listNode1 = listNode1.next;
        }
        while (listNode2 != null) {
            printListNode(result, listNode1, listNode2, carry);

            sum = listNode2.value + 0 + carry;
            listNode.next = new ListNode(0);
            listNode = listNode.next;
            listNode.value = sum % 10;
            carry = sum / 10;

            listNode2 = listNode2.next;
        }
        // 如果carry有值，末位加一
        if (carry == 1) {
            listNode.value = 1;
        }
        return result.next;
    }

    /**
     * 本题特有打印方法
     *
     * @param listNode
     * @param listNode1
     * @param listNode2
     * @param carry
     */
    private static void printListNode(ListNode listNode, ListNode listNode1, ListNode listNode2, int carry) {
        System.out.printf("\n%s", "listNode:");
        printListNode(listNode);
        System.out.printf("\n%s", "listNode1:");
        printListNode(listNode1);
        System.out.printf("\n%s", "listNode2:");
        printListNode(listNode2);
        System.out.printf("\ncarry: %d\n\n", carry);
    }

    /**
     * 打印链表
     *
     * @param node
     */
    public static void printListNode(ListNode node) {
        if (node == null) {
            System.out.print("null");
            return;
        }
        while (true) {
            System.out.printf(" %d", node.value);
            if (node.next == null) {
                break;
            }
            node = node.next;
        }
    }

    /**
     * 根据数组获得链表
     *
     * @param arr
     * @return 一个链表对象
     */
    public static ListNode getList(int[] arr) {
        ListNode listNode = new ListNode(0);
        ListNode index = listNode;
        for (int i = 0; i < arr.length; i++) {
            index.value = arr[i];
            if (i == arr.length - 1) {
                break;
            }
            index.next = new ListNode(0);
            index = index.next;
        }
        return listNode;
    }
}