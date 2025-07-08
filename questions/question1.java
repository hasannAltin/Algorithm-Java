package s2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HasanAltin_20010310016_Soru1 {

	public static void main(String[] args) {
		
	}
	
	
	
	
	public static ListNode sortLinkedList(ListNode front) {
	    if (front == null || front.next == null) {
	        return front; 
	    }

	    ListNode sorted = null; 

	    while (front != null) {
	        ListNode current = front;
	        front = front.next; 

	        if (sorted == null || current.data < sorted.data) {
	            current.next = sorted;
	            sorted = current;
	        } else {
	            ListNode search = sorted;
	            while (search.next != null && search.next.data < current.data) {
	                search = search.next;
	            }
	            current.next = search.next;
	            search.next = current;
	        }
	    }

	    return sorted;
	}
	class ListNode {
	    int data;
	    ListNode next;

	    public ListNode(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	
}
