package circularLinkedList;
class Node
{
	int value;
	Node next;

	Node(int d)
	{
		value = d;
		next = null;
	}
}

class CircularLinkedList
{
	Node head;
	CircularLinkedList() { head = null; }


	void sortedInsert(Node new_node)
	{
		Node current = head;

		
		if (current == null)
		{
			new_node.next = new_node;
			head = new_node;

		}

		else if (current.value >= new_node.value)
		{

			while (current.next != head)
				current = current.next;

			current.next = new_node;
			new_node.next = head;
			head = new_node;
		}

		else
		{

		
			while (current.next != head &&
				current.next.value < new_node.value)
				current = current.next;

			new_node.next = current.next;
			current.next = new_node;
		}
	}

	void printList()
	{
		if (head != null)
		{
			Node temp = head;
			do
			{
				System.out.print(temp.value + " ");
				temp = temp.next;
			} while (temp != head);
		}
	}

	public static void main(String[] args)
	{
		CircularLinkedList list = new CircularLinkedList();

		int arr[] = new int[] {12, 56, 2, 11, 1, 90};

		Node temp = null;

		for (int i = 0; i < 6; i++)
		{
			temp = new Node(arr[i]);
			list.sortedInsert(temp);
		}

		list.printList();
	}
}


