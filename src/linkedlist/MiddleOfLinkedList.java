package linkedlist;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5, 6 };
		ListNode head = createLinkedList(values);
		ListNode middle = middleNode(head);
		System.out.println("The middle elements are: ");
		printLinkedList(middle);

	}

	/**
	 * This method takes an array of integers as input and returns a pointer to the
	 * head node of a linked list that contains these integers.
	 * 
	 * The method starts by initializing two pointers: head and current. The head
	 * pointer points to the head of the linked list, which is initially null. The
	 * current pointer is used to traverse the linked list and is initially set to
	 * null as well.
	 * 
	 * The method then iterates over the input array using a for-each loop. For each
	 * integer value in the array, the method creates a new ListNode object that
	 * contains that value.
	 * 
	 * If the head pointer is null (i.e., the linked list is currently empty), the
	 * method sets the head pointer to the newly created node and sets the current
	 * pointer to the same node.
	 * 
	 * If the head pointer is not null (i.e., the linked list already contains one
	 * or more nodes), the method sets the next field of the current node to the
	 * newly created node and updates the current pointer to point to the newly
	 * created node. This effectively appends the new node to the end of the linked
	 * list.
	 * 
	 * After all nodes have been created and appended to the linked list, the method
	 * returns a pointer to the head node, which represents the entire linked list.
	 * 
	 * @param values
	 * @return
	 */
	public static ListNode createLinkedList(int[] values) {
	    ListNode head = null;
	    ListNode current = null;
	    for (int val : values) {
	        ListNode node = new ListNode(val);
	        if (head == null) {
	            head = node;
	            current = node;
	        } else {
	            current.next = node;
	            current = current.next;
	        }
	    }
	    return head;
	}


	/**
	 * In this code, we define a ListNode class to represent each node in the linked
	 * list. The middleNode method takes the head node of the linked list as input
	 * and returns the middle node.
	 * 
	 * We start by initializing two pointers, slow and fast, to the head node of the
	 * linked list. We then traverse the linked list using the fast pointer, which
	 * moves two nodes at a time, and the slow pointer, which moves one node at a
	 * time.
	 * 
	 * When the fast pointer reaches the end of the list or the next node of the
	 * end, the slow pointer will be pointing to the middle node of the linked list.
	 * Finally, we return the node pointed to by the slow pointer.
	 * 
	 * Note that if the linked list has an even number of nodes, this algorithm will
	 * return the second of the two middle nodes. If you want to return the first of
	 * the two middle nodes, you can modify the algorithm to move the fast pointer
	 * three steps forward instead of two before moving the slow pointer one step
	 * forward. This ensures that the slow pointer always points to the first middle
	 * node, even if there are two middle nodes.
	 * 
	 * @param head
	 * @return
	 */
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// To return fist middle element
//		while (fast != null && fast.next != null && fast.next.next != null) {
//	        slow = slow.next;
//	        fast = fast.next.next.next;
//	    }

		return slow;
	}

	/**
	 * In this implementation, we initialize a pointer current to the head of the
	 * linked list. We then iterate over the linked list by repeatedly updating
	 * current to point to the next node and printing the value of the current node.
	 * If the current node has a next node, we also print an arrow (->) to indicate
	 * the next node.
	 * 
	 * Finally, we print a newline character (\n) to ensure that the output is
	 * properly formatted.
	 * 
	 * @param head
	 */
	public static void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
		System.out.println();
	}

}