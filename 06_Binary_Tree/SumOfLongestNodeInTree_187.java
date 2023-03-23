package com.learning.lovebabar450.tree;

import java.util.HashMap;
import java.util.Map;

public class SumOfLongestNodeInTree_187 {
	
	
	 public int sumOfLongRootToLeafPath(TreeNode root)
	    {
	        //code here
	        Map<String,Integer> map = new HashMap<String,Integer>();
	        map.put("maxSum", 0);
	        map.put("maxLevel", 0);
	        solve(root,0,0,map);

	        return map.get("maxSum");
	    }

	private void solve(TreeNode root,int level,int sum,Map<String,Integer> map) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		
		sum = sum+root.data;
		if(level == map.get("maxLevel")) {
			if(sum>map.get("maxSum"))
				map.put("maxSum", sum);
		}
		else if(level>map.get("maxLevel")) {
			map.put("maxSum", sum);
			map.put("maxLevel", level);
		}
		
		solve(root.left,level+1,sum+root.data,map);
		solve(root.right,level+1,sum+root.data,map);

	}
	    
	 

}
