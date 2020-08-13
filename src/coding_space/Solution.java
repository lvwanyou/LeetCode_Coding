package coding_space;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

class Solution {
   List<TreeNode> list = new ArrayList<TreeNode>();
	
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	this.returnNeed(s, t);
    	if(this.list.size()==0) return false;
    	String printT = this.firstPrint(t);
    	for(TreeNode middle:this.list) {
    		 String printS = this.firstPrint(middle);
    		 if(printS.equals(printT)) return true;
    	}
       
        return false;
    }
    
    public void returnNeed(TreeNode s,TreeNode t) {
    	Stack<TreeNode> st = new Stack<TreeNode>();
 
    	while(s!=null||!st.empty()) {
    		while(s!=null) {
    			if(s.val==t.val) {
    				list.add(s);
    			}
    			st.push(s);
    			s=s.left;
    		}
    		
    		if(!st.empty()) {
    			s=st.pop();
    			s=s.right;
    		}
    	}
    }
    
    public String firstPrint(TreeNode s) {
    	if(s==null) return "";
    	else {
    		String res="";
            res=firstPrint(s.left);
    		res=res+Integer.toString(s.val);
    		res = res+firstPrint(s.right);
    		return res;
    	}
    }
}
