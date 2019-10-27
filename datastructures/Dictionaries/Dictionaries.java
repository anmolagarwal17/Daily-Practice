//reference: blondybytes youtube channel 9th day of code

import java.util.*;  //java.util.HashMap; java.util.Map;

public class Dictionaries
{
	public static void main(String args[])
	{
		//English to Spanish Dictionary
		Map<String,String> engSpanDictionary = new HashMap<String,String>();

		//Putting things inside dictionary
		engSpanDictionary.put("Monday","Lunes");
		engSpanDictionary.put("Tuesday","Martes");
		engSpanDictionary.put("Wednesday","Miercoles");
		engSpanDictionary.put("Thursday","Jueves");
		engSpanDictionary.put("Friday","Viernes");
		engSpanDictionary.put("Saturday","Sabado");
		engSpanDictionary.put("Sunday","Domingo");

		//Retrieve things from our dictionary
		System.out.println(engSpanDictionary.get("Monday"));
		System.out.println(engSpanDictionary.get("Tuesday"));
		System.out.println(engSpanDictionary.get("Wednesday"));
		System.out.println(engSpanDictionary.get("Thursday"));
		System.out.println(engSpanDictionary.get("Friday"));

		//Print out all the keys
		System.out.println(engSpanDictionary.keySet());

		//Print out all the values
		System.out.println(engSpanDictionary.values());

		//Print out all size
		System.out.println("The size of our dictionary is "+engSpanDictionary.size());

		System.out.println();
		System.out.println();

		//Shopping List
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();

		// Put some stuff in Dictionary
		shoppingList.put("Ham",true);
		shoppingList.put("Bread",Boolean.FALSE);  //or we could write false  
						//by using Boolean.FALSE we use Boolean object corresponding to boolean value false

		shoppingList.put("Oreos",Boolean.FALSE);
		shoppingList.put("Eggs",Boolean.FALSE);
		shoppingList.put("Sugar",false);

		// Retrive items
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos"));

		//Printing all keys and values
		System.out.println(shoppingList.keySet());		
		System.out.println(shoppingList.values());

		System.out.println("Size of our shopping list is "+shoppingList.size());

		// Key-Value Pairs Print Out
		System.out.println(shoppingList.toString());
		// Is empty?
		System.out.println(shoppingList.isEmpty());

		//Remove things
		shoppingList.remove("Eggs");

		//Replace value of certain key
		shoppingList.replace("Bread",Boolean.FALSE);

		System.out.println(shoppingList.toString());


		// Cleat our dictionary(of shopping list)
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		// Is empty?
		System.out.println(shoppingList.isEmpty());




	}
}