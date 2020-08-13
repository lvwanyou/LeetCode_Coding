import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result_list = new ArrayList<Integer>();
        Stack<ListNode> stack = new Stack<ListNode>();
        while(listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while(!stack.empty()){
            result_list.add(stack.pop().val);
        }
        return result_list;
    }
    
}