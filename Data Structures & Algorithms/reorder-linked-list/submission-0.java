class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode curr = head;
        List<Integer> arr = new ArrayList<>();

        // Store values in array
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        int i = 0;
        int j = arr.size() - 1;

        curr = head;

        // Reassign values in required order
        while (curr != null) {
            if (i <= j) {
                curr.val = arr.get(i++);
                curr = curr.next;
            }
            if (curr != null && i <= j) {
                curr.val = arr.get(j--);
                curr = curr.next;
            }
        }
    }
}