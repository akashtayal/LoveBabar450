package com.learning.lovebabar450.string;

import java.util.Stack;

public class BalancedParenthesis_62 {

	static boolean ispar(String x)
	{
		// add your code here
		if(x.length()%2!=0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for(int index=0;index<x.length();index++) {
			
			switch(x.charAt(index)) {
				case ']':
					if(stack.isEmpty())
						return false;
					if(stack.peek().equals('['))
					stack.pop();
						else 
					return false;
					break;
				case '}':
					if(stack.isEmpty())
						return false;
					if(stack.peek().equals('{'))
					stack.pop();
					else 
					return false;
					break;
				case ')':
					if(stack.isEmpty())
						return false;
					if(stack.peek().equals('('))
					stack.pop();
					else 
					return false;
					break;
				default:
					stack.push(x.charAt(index));
					break;
			}
		}

		if(stack.isEmpty())
			return true;
		else
			return false;

	}
}
