class Main
{
	public static void main(String[]args)
	{
		LinkedList list1 = new LinkedList(0);
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.show();
		list1.delete(0);
		list1.show();
		System.out.println("3"+list1.search(3));
		System.out.println("5"+list1.search(5));
	}
}
class Node
{
	int data;
	Node next;
	Node(int value)
	{
		data = value;
	}
}
class LinkedList
{
	Node head;
	// creating a new linked list with header value in head variable
	LinkedList(int value)
	{
		head = new Node(value);
	}
	void insert(int value)
	{
		Node pointer = head;
		while(pointer.next != null)
		{
			pointer = pointer.next;
		}
		pointer.next = new Node(value);
	}
	void show()
	{
		Node pointer = head;
		while(pointer != null)
		{
			System.out.println(pointer.data);
			pointer = pointer.next;
		}
	}
	void delete(int index)
	{
		int i=0;
		boolean deleted = false;
		// Node previous = head;
		// Node current = head;
		// Node next = current.next;
		
		// while(current.next != null)
		// {
		// 	if(i == index && index > 0)
		// 	{
		// 		previous.next = current.next;
		// 		deleted = true;
		// 		break;
		// 	}
		// 	else if(index == 0)
		// 	{
		// 		previous = current.next;
		// 		deleted = true;
		// 		break;
		// 	}

		// 	previous = current;
		// 	current = current.next;
		// 	next = current.next;
		// 	i++;
		// }
		// if(deleted)
		// 	System.out.println("Deleted");
		// else
		// 	System.out.println("Not Deleted");
	}
	boolean search(int value)
	{
		Node pointer = head;
		boolean found = false;
		while(pointer.next != null)
		{
			if(pointer.data == value)
			{
				found = true;
				break;
			}
			pointer = pointer.next;
		}
		return found;
	}
}