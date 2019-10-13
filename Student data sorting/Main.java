import java.util.Scanner;

class Main
{
	public static void main(String[]args)
	{
		Scanner sca = new Scanner(System.in);
		Student student[];
		
		student = new Student[4];
		student[0] = new Student("Anmol",16,5,30);
		student[1] = new Student("Shivangi",19,20,40);
		student[2] = new Student("Tushit",29,15,20);
		student[3] = new Student("Harsh",21,27,35);

		SortShow obj = new SortShow();

		System.out.println("Data as unsorted : ");
		obj.show(student);
		System.out.print("\nPress Enter");
		sca.nextLine();


		System.out.println("\nSorted according to Name:\n");
		obj.sortNameShow(student);
		System.out.print("\nPress Enter");
		sca.nextLine();


		System.out.println("\nSorted according to Age:\n");
		obj.sortAgeShow(student);
		System.out.print("\nPress Enter");
		sca.nextLine();


		System.out.println("\nSorted according to Height:\n");
		obj.sortHeightShow(student);
		System.out.print("\nPress Enter");
		sca.nextLine();


		System.out.println("\nSorted according to Weight:\n");
		obj.sortWeightShow(student);		
	}
}
class Student
{
	String name;
	int age;
	int height;
	int weight;

	Student(String name, int age, int height, int weight)
	{
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
class SortShow
{
	void show(Student student[])
	{
		System.out.println("Name\tAge\tHeight\tWeight");
		for(Student i : student)
		{
			System.out.println(i.name+"\t"+i.age+"\t"+i.height+"\t"+i.weight);
		}
	}
	void sortNameShow(Student student[])
	{
		Student temp;
		for (int i = 0; i < 4; i++) 
        {
            for (int j = i + 1; j < 4; j++) 
            {
                if (student[i].name.compareTo(student[j].name)>0) 
                {
                    temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        show(student);
	}
	void sortAgeShow(Student student[])
	{
		Student temp;
		for (int i = 0; i < 4; i++) 
        {
            for (int j = i + 1; j < 4; j++) 
            {
                if (student[i].age > student[j].age) 
                {
                    temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        show(student);
	}
	void sortHeightShow(Student student[])
	{
		Student temp;
		for (int i = 0; i < 4; i++) 
        {
            for (int j = i + 1; j < 4; j++) 
            {
                if (student[i].height > student[j].height) 
                {
                    temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        show(student);
	}
	void sortWeightShow(Student student[])
	{
		Student temp;
		for (int i = 0; i < 4; i++) 
        {
            for (int j = i + 1; j < 4; j++) 
            {
                if (student[i].weight > student[j].weight) 
                {
                    temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        show(student);
	}
}