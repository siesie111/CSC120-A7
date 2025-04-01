/* This is a stub for the House class */

import java.util.ArrayList;
import java.util.Arrays;

/*
 * House class that extends Building class
 * @author Sierra Zhang
 * @version March 27, 2025
 */
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /*
   * constructor for House class
   * @param String name
   * @param String address
   * @param int nFloors
   * @param ArrayList<String> residents
   * @param boolean hasDiningRoom
   */
  public House(String name, String address, int nFloors, ArrayList<String> resident, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /*
   * accessor for hasDiningRoom
   * @return boolean hasDiningRoom
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /*
   * accessor for ArrayList<String> residents that returns the number of elements in this ArrayList
   * @return int residents.size()
   */
  public int nResidents(){
    return residents.size();
  }

  /*
   * add a resident to the ArrayList<String> residents
   * @param String name
   */
  public void moveIn(String name){
    residents.add(name);
  }

  /*
   * remove a resident from the ArrayList<String> residents
   * @param String name
   * @return String name
   */
  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
    }
    else{
      System.out.println(name + "is not in the residence list, please check again.");
    }
    return name;
  }

  /*
   * check if a person is in the residence list
   * @param String person
   * @return boolean true or false
   */
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    ArrayList<String> residents = new ArrayList<String>(Arrays.asList("Apple", "Banna", "Watermelon"));
    House h = new House("Cutter House", "71 Elm Street, MA 01063", 3, residents, true);
  }

}