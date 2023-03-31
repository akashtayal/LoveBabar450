package com.learning.lovebabar450.tree;

import java.util.HashMap;
import java.util.Map;

public class LargestSumTree_189 {
	public static int findLargestSubtreeSum(TreeNode root) {
        // code here
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("maxsum",Integer.MIN_VALUE);
        solve(root,map);
        return map.get("maxsum");
    }
    
    public static int solve(TreeNode node,Map<String,Integer> map){
        
        if(node==null)
        return Integer.MIN_VALUE;
        
        int left = solve(node.left,map);
        int right = solve(node.right,map);
        
        if(left>map.get("maxsum"))
        map.put("maxsum",left);
        
        if(right>map.get("maxsum"))
        map.put("maxsum",right);
     
          
        if(left==Integer.MIN_VALUE)
        left =0;
        if(right==Integer.MIN_VALUE)
        right=0;
        
        int sum = left + right + node.data;
        if(sum>map.get("maxsum"))
        map.put("maxsum",sum);
        
        return sum;
    }
}
