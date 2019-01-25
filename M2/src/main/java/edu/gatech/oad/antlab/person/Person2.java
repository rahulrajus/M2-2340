
package edu.gatech.oad.antlab.person;
import java.util.ArrayList;

import java.util.ArrayList;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
<<<<<<< HEAD
	  String random = "";
	  ArrayList<Integer> prevIndices = new ArrayList<>();
    for(int i  = 0; i < input.length(); i++){
      int index = (int) (Math.random() * input.length());
      if(prevIndices.contains(index)){
        while(prevIndices.contains(index)){
            index = (int) (Math.random() * input.length());
        }
      }
      prevIndices.add(index);
      random += "" + input.charAt(index);


=======
    ArrayList<Integer> prevIndex = new ArrayList<Integer>();
    int index = 0;
    String random = "";
    for(int i = 0; i < input.length(); i++){
      index = (int) (Math.random() * input.length());
      while(prevIndex.contains(index)){
        index = (int) (Math.random() * input.length());
      }
      random += "" + input.charAt(index);
      prevIndex.add(index);
>>>>>>> 9ea524e982327ca8a7cffcccb39a28e3bcc69e65
    }
    return random;

	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

<<<<<<< HEAD
=======
  public static void main(String[] args){
    Person2 newperson = new Person2("Rahul");

    System.out.println(newperson);
  }
>>>>>>> 9ea524e982327ca8a7cffcccb39a28e3bcc69e65
}
