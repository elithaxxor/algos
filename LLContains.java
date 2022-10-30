//public class LLContains {
//     public class ListNode {
//     int val;
//     ListNode next;
//       ListNode() {}
//        ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) {
//           this.val = val;
//           this.next = next;
//       }
//      }
//
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public int numComponents(ListNode head, int[] nums) {
//
//            for (int i = 0; i < nums.length; i++){
//                System.out.println(nums[i]);
//            }
//
//            ListNode curr = new ListNode();
//            ListNode prev = null;
//
//            int count = 0;
//            while (curr != null) {
//                prev = curr;
//                curr = curr.next;
//
//                if(curr.val == nums[count] ) {
//                    System.out.println("found matching digit" + curr.val);
//                    curr = curr.next;
//                    if (curr.val != nums[count]) break;
//                    while (curr.val == nums[count]) {
//                        count++;
//                        curr = curr.next;
//                    }
//                }
//                count++;
//
//            }
//            return count;
//        }
//    }