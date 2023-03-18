package com.learning.lovebabar450.tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class BottomViewOfTree_173 {

	 static ArrayList<Integer> topView(TreeNode root)
	    {
	        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
	      node(root,0,0,map);
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
	        	list.add(entry.getValue().get(1));
	        }
	        
	        return list;
	      
	    }
		
		static void node(TreeNode root,int level, int addr,TreeMap<Integer,ArrayList<Integer>> map) {
			
			if(root==null)
				return;
			
			node(root.left,level+1,addr-1,map);
			
			if(map.containsKey(addr)) {
				//check the level and update accordingly
		        // low level & address value need to be store.
			ArrayList<Integer> li = map.get(addr);
					if(level<li.get(0)) {
						li.clear();
					    map.remove(addr);
						li.add(level);
						li.add(root.data);
						map.put(addr, li);
					}
			}
			else {
				ArrayList<Integer> li = new ArrayList<Integer>();
			
			//First node -- Storing level
			//Second node -- Storing data
				li.add(level);
				li.add(root.data);
				map.put(addr, li);
			}
			
					node(root.right,level+1,addr+1,map);

		}
}
