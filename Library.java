/* This is a stub for the Library class */

import java.util.Hashtable;

/*
 * Library class that extends Building class
 * @author Sierra Zhang
 * @version March 27, 2025
 */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  /*
   * constructor for Library class
   * @param String name
   * @param String address
   * @param int nFloors
   * @param Hashtable<String, Boolean> collection
   */
  public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /*
    * add the title of a new book to the collection list
    * @param String title
    */
  public void addTitle(String Title){
    collection.putIfAbsent(Title, true);
  }

  /*
    * remove the title of a book in the collection
    * @param String title
    * @return String title or error message
    */
  public String removeTitle(String title){
    if (collection.containsKey(title)){
      collection.remove(title);
      return title;
    }
    else{
      return "This book is not in the collection";
    }
  }

  /*
    * check out a book that is currently in the collection
    * @param String title
    */
  public void checkOut(String title){
    try{
      if (collection.containsKey(title)){
    collection.replace(title, false);
    }
    }
    catch (RuntimeException e){}
  }

  /*
    * return a book that is currently not in the collection
    * @param String title
    */
  public void returnBook(String title){
    try{
      if (collection.containsKey(title)){
        collection.replace(title, true);
      }
    } catch (RuntimeException e){}
  }

  /*
    * check if a book exists in the collection using its title
    * @param title
    * @return true or false
    */
  public boolean containsTitle(String title){
    if (collection.containsKey(title)){
      return true;
    } else{
      return false;
    }
  }

  /*
    * check if a book is available in the collection by its title
    * @param String title
    * @return true or false
    */
  public boolean isAvailable(String title){
    if (collection.get(title) == true){
      return true;
    } else {
      return false;
    }
  }

  /*
    * print out the entire collection list with both String and Boolean
    */
  public void printCollection(){
    System.out.println("The collection contains: ");
    for (int i = 0; i<= collection.size(); i++){
      System.out.println("Book: ");
    }
    
  }
  
    public static void main(String[] args) {
      Hashtable<String, Boolean> collection = new Hashtable<String, Boolean>();
      String title = "Think Java";
      String author = "Allen Downey and Chris Mayfield";
      collection.put(title+" by "+author, true);
      Library l = new Library("Neilson Library", "somewhere, MA 01063", 6, collection);
    }
  
  }