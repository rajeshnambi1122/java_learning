public class LinkedList {
    static class ListNode {
        int val;
        ListNode fun;

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) { this.val = val; this.fun = next; }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.fun = new ListNode(20);
        head.fun.fun = new ListNode(30);
        head.fun.fun.fun = new ListNode(40);
        head.fun.fun.fun.fun = new ListNode(50, head.fun);


        System.out.println(head.val);
        System.out.println(head.fun.val);
        System.out.println(head.fun.fun.val);
        System.out.println(head.fun.fun.fun.val);
        System.out.println(head.fun.fun.fun.fun.fun.val);
    }
}
