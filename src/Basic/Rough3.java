package Basic;

public class Rough3 {
	/*
	There are three threads T1, T2, and T3.
	T1 prints 1,4,7... 
	T2 prints 2,5,8... 
	T3 prints 3,6,9...
	How do you synchronize these three to print sequence 1,2,3,4,5,6,7,8,9... upto some MAX.
	t1 1
	t2 2
	t3 3
	t1 4...
*/


/*
	Consider lines of slopes -1 passing through between the nodes.
	Given a Tree, print all diagonal elements in a tree belonging to same lines.
	
	Input 
			 8
		   /   \
		  3    10
		 / \     \
		1   6    14
		   / \   / 
		  4   7 2
		  
		  
		  \   8
		   \/  \ 
		   /\   \
	  \   3  \   10
	   \/ \   \   \
	   /\  \   \   \
	  /  \  6   \  14
	 1    \/ \   \/
		  /\  \  /\
	     /  \  \ 2 \ 
		4    \  7   \
	   / \
	  /   \
	 2     3

     Output: 8, 10, 14
             3, 6, 7, 2
			 1, 4
			 
			 8, 10, 14
             3, 6, 7, 2
			 1, 4, 3
			 2
*/


    
/*
	Create a immutable employee class.
	Employee class should have:
	Name: String
	Id: Integer
	Metadata: Map<String, String>
*/

// shallowcopy & deepcopy



}
