// main fuction at end in class Main

class Node
{
	int data;
	Node next;
}
class LinkedList
{
	Node head;
	void insert(int value)
	{
		Node new_node = new Node();
		new_node.data = value;
		new_node.next = null;

		if(head != null)
		{
			Node pointer = head;
			
			while(pointer.next != null)
			{
				pointer = pointer.next;
			}

			pointer.next = new_node;
		}
		else
		{
			head = new_node;
		}
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
	void insertAt(int position,int value)
	{
		int length = length();
		int i=0;

		Node new_node = new Node();
		new_node.data = value;

		// if position is greater than length+2 of linked list or position is negative then exit
		if(position > (length+1) || position < 0)
		{
			System.out.println("Cannot insert at position "+position);
			return;
		}
		// if position is 1 greater than lenght of LL then inserting will be done at end
		else if(position == length+1)
			insert(value);
		// if inserting at position 0 i.e, at start then call insertAtStart()
		else if(position == 0)
			insertAtStart(value);
		// if inserting in between
		else
		{
			Node previous = null;
			Node current = head;
			while(i < position)
			{
				previous = current;
				current = current.next;
				i++;
			}
			new_node.next = current;
			previous.next = new_node;
		}

	}
	void insertAtStart(int value)
	{
		Node new_node = new Node();
		new_node.data = value;
		new_node.next = head;
		head = new_node;
	}
	int length()
	{
		int length = 0;
		Node pointer = head;
		while(pointer != null)
		{
			pointer = pointer.next;
			length++;
		}
		return length;
	}
	boolean search(int element)
	{
		Node pointer = head;
		while(pointer != null)
		{
			if(pointer.data == element)
			{
				// if element is present then return true for present
				return true;
			}
			pointer = pointer.next;
		}
		return false;
	}
	void delete(int index)
	{
		int length = length();

		Node previous = null;
		Node current = head;
		if(index == 0)
		{
			head = head.next;
		}
		// if index is greater than length of linked list or index is negative then deleting not possible as that index does not exist
		else if(index > length || index < 0)
		{
			System.out.println("Cannot delete element");
			return;
		}
		else
		{
			int i=0;
			// go to the requested index
			while(i < index)
			{
				previous = current;
				current = current.next;
				i++;
			}
			// instead of pointer of current node, put the pointer of current.next(that is next) node
			previous.next = current.next;
		}
	}
	// drop complete linked list
	void drop()
	{
		head = null;
	}
}




class Main
{
	public static void main(String[]args)
	{
		LinkedList list1 = new LinkedList();

		// insert value at end
		list1.insert(5);
		list1.insert(4);
		list1.insert(34);
		list1.insert(23);

		list1.show();

		// deleting at index that does not exist
		System.out.println("deleting at index 5");
		list1.delete(5);
		
		System.out.println("deleting at index 3");
		list1.delete(3);
		list1.show();

		System.out.println("deleting at index 0");
		list1.delete(0);
		list1.show();

		// list1.search(integer value) returns true or false when value is present or not in linked list
		System.out.println("34 is present : "+list1.search(34));
		System.out.println("5 is present : "+list1.search(5));

		System.out.println("insert at start value 67");
		list1.insertAtStart(67);
		list1.show();

		System.out.println("insert at 0 value 62");
		list1.insertAt(0,62);
		list1.show();

		System.out.println("insert at 1 value 223");
		list1.insertAt(1,223);
		list1.show();

		System.out.println("insert at 5 value 59");
		list1.insertAt(5,59);
		list1.show();

		int length = list1.length();
		System.out.println("Length : "+length);

		// insert at the end of linked list using insertAt()
		System.out.println("insert at "+(length+1)+" value 58");
		list1.insertAt((length+1),58);
		list1.show();

		length = list1.length();
		System.out.println("Length : "+length);
		
		// inserting at index that does not exist
		System.out.println("insert at "+(length+3)+" value 58");
		list1.insertAt((length+3),58);
		list1.show();

		// inserting at index that does not exist
		System.out.println("insert at "+(-2)+" value 58");
		list1.insertAt((-2),58);
		list1.show();


	}
}