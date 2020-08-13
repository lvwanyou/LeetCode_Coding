package coding_space;

//快捷键： 
//代码格式化: ctrl +i
//代码提示补全: alt + /
//包自动补全 ： ctrl + shift + o




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {


	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> tree = new ArrayList<Integer>();
		if(root != null){
			tree.add(root.val);
			List<TreeNode> roots = new ArrayList<TreeNode>();
			roots.add(root);
			while(roots.size() > 0){
				TreeNode see = new TreeNode(-1);
				List<TreeNode> temp = new ArrayList<TreeNode>();
				for(int i =0 ; i< roots.size();i++){

					if(roots.get(i).left == null && roots.get(i).right == null ){
						continue;
					}else if(roots.get(i).right ==null){
						see = roots.get(i).left;
						temp.add(see);
					}else{
						see = roots.get(i).right;
						if(roots.get(i).left !=null) {
							temp.add(roots.get(i).left)  ;
						}

						temp.add(roots.get(i).right);   
					}

				}
				if( see.val != -1){
					tree.add(see.val);
				}

				roots =  temp;
			}
		}
		return tree;
	}
}

public class MainClass {
	public static TreeNode stringToTreeNode(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return null;
		}

		String[] parts = input.split(",");
		String item = parts[0];
		TreeNode root = new TreeNode(Integer.parseInt(item));
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);

		int index = 1;
		while(!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int leftNumber = Integer.parseInt(item);
				node.left = new TreeNode(leftNumber);
				nodeQueue.add(node.left);
			}

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int rightNumber = Integer.parseInt(item);
				node.right = new TreeNode(rightNumber);
				nodeQueue.add(node.right);
			}
		}
		return root;
	}

	public static String integerArrayListToString(List<Integer> nums, int length) {
		if (length == 0) {
			return "[]";
		}

		String result = "";
		for(int index = 0; index < length; index++) {
			Integer number = nums.get(index);
			result += Integer.toString(number) + ", ";
		}
		return "[" + result.substring(0, result.length() - 2) + "]";
	}

	public static String integerArrayListToString(List<Integer> nums) {
		return integerArrayListToString(nums, nums.size());
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			TreeNode root = stringToTreeNode(line);

			List<Integer> ret = new Solution().rightSideView(root);

			String out = integerArrayListToString(ret);

			System.out.print(out);
		}
	}
}