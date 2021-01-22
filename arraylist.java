package qajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class arraylist {
	public static void main(String[] args) {
		List<String> myAList = new ArrayList<>();
		myAList.add("Apple");
		myAList.add("Orange");
		myAList.add("Banana");
		myAList.add("Strawberry");
		myAList.add("Grape");
		
		System.out.print(myAList);
		System.out.print('\n');
		
		System.out.print('\n');
		for (int i=0; i<myAList.size(); i++){
		    System.out.println(myAList.get(i));
		}
		
		System.out.print('\n');
		System.out.print(myAList.get(2));
		System.out.print('\n');
		
		System.out.print('\n');
		myAList.set(2, "B a n a n a");
		System.out.print(myAList);
		System.out.print('\n');
		
		System.out.print('\n');
		myAList.remove(2);
		System.out.println(myAList);
		System.out.print('\n');
		
		System.out.print('\n');
		Collections.sort(myAList);

        for (String i : myAList){
            System.out.println(i);
        }
		System.out.print('\n');
	}
}
