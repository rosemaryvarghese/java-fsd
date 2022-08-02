package singlyLinkedList;

import java.io.*; 
public class SinglyLinkedList 
{ 
Node head;
    	static class Node 
{ 
        		int value; 
        		Node next; 
        		Node(int v) 
        		{ 
        			value = v; 
            			next = null; 
        		} 
    	} 

    	public static SinglyLinkedList insert(SinglyLinkedList list, int value) 
    	{ 
        		
        		Node new_node = new Node(value); 
        		new_node.next = null; 
   
        		if (list.head == null) 
{ 
            			list.head = new_node; 
        		} 
        		else 
{ 
           
            			Node last = list.head; 
            			while (last.next != null) 
{ 
                			last = last.next; 
            			} 
   		
            			last.next = new_node; 
        		} 
        		return list; 
    	} 
   	public static void printList(SinglyLinkedList list) 
    	{	 
        		Node currNode = list.head; 
        		System.out.print("LinkedList: "); 
        		
        		while (currNode != null) 
{ 
            			 
            			System.out.print(currNode.value + " "); 
            		
            			currNode = currNode.next; 
        		} 
        		System.out.println(); 
    	} 

    	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) 
    	{ 
        		 
        		Node currNode = list.head, prev = null; 
        		if (currNode != null && currNode.value == key) 
{ 
            			list.head = currNode.next; 
            			System.out.println(key + " found and deleted"); 
            			return list; 
        		} 
        		while (currNode != null && currNode.value != key) 
{ 
            			prev = currNode; 
            			currNode = currNode.next; 
        		} 
        		if (currNode != null) 
{ 
            			prev.next = currNode.next; 
            			System.out.println(key + " found and deleted"); 
        		} 
        		if (currNode == null) 
{ 
            			System.out.println(key + " not found"); 
        		} 
        		return list; 
    	} 
    	
    	public static void main(String[] args) 
    	{ 
        		
    		SinglyLinkedList list = new SinglyLinkedList(); 
        	
        		list = insert(list, 1); 
        		list = insert(list, 2); 
        		list = insert(list, 3); 
        		list = insert(list, 4); 
        		list = insert(list, 5); 
        		list = insert(list, 6); 
        		list = insert(list, 7); 
        		list = insert(list, 8); 
        		
        		printList(list); 
        		
        		deleteByKey(list, 1); 
        	
        		printList(list); 
        	
        		deleteByKey(list, 4); 
        		
        		printList(list); 
        	
        		deleteByKey(list, 10); 
        		
        		printList(list); 
    	} 
} 
