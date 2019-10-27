class Main
{
	public static void main(String[]args)
	{
		DynamicArray a = new DynamicArray();

		System.out.println("Inserting values to dynamic array");
		a.insert(1);
		a.insert(3);
		a.insert(56);
		a.insert(45);

		System.out.println("Using getArray() to get the dynamic array and printing from that:");
		int b[] = a.getArray();
		for(int i : b)
			System.out.println(i);

		System.out.println("\nNo of elements :"+a.getNoOfElements());
		System.out.println("Array length :"+a.getArrayLength());

		System.out.println("\nInserting 1 more value to dynamic array");
		a.insert(44);
		a.show();

		System.out.println("\nNo of elements :"+a.getNoOfElements());
		System.out.println("Array length :"+a.getArrayLength()+"\n");

		System.out.println("delete index -1");
		a.delete(-1);
		System.out.println("delete index 34");
		a.delete(34);

		System.out.println("delete index 4");
		a.delete(4);
		a.show();


		// a.delete(3);

		System.out.println("delete index 2");
		a.delete(2);
		a.show();

		System.out.println("\nNo of elements : "+a.getNoOfElements());
		System.out.println("Array length : "+a.getArrayLength());
		System.out.println("Delete from index 3 : ");
		a.delete(3);
		a.show();


	}
}
class DynamicArray
{
	int a[] = new int[1];
	int no_of_elements =0;
	void insert(int value)
	{
		if(no_of_elements == a.length)
		{
			// create new array of double size
			int b[] = new int[no_of_elements * 2];
			// copy all elements
			for(int i=0; i<a.length; i++)
				b[i] = a[i];
			a = b;
		}
		a[no_of_elements] = value;
		
		no_of_elements++;
	}
	void delete(int index)
	{
		if(index >= no_of_elements || index < 0)
		{
			System.out.println("Cannot delete form specified index.");
			return;
		}
		else
		{
			for(int i=index; i<no_of_elements-1; i++)
				a[i] = a[i+1];
			a[no_of_elements-1] = 0;
			no_of_elements--;
			if(no_of_elements <= a.length/2)
			{
				int b[] = new int[no_of_elements];
				for(int i=0; i<no_of_elements; i++)
				{
					b[i] = a[i];
				}
				a = b;
			}
		}
	}
	int[] getArray()
	{
		return a;
	}
	void show()
	{
		for(int i : a)
			System.out.println(i);
	}
	int getNoOfElements()
	{
		return no_of_elements;
	}
	int getArrayLength()
	{
		return a.length;
	}
}