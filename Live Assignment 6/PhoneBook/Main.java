import java.util.*;
  
public class Main {

  private static List<PhoneBookEntry> entries = new ArrayList<>();

  public static void changeEntry(String name, String number) {
    //checking if number exists first
    for (PhoneBookEntry entry : entries) {
      if (entry.name.equals(name)) {
        //if name exists, change number
        entry.number = number;
        return;
      }
    }
    //if name does not exist, add new entry
    entries.add(new PhoneBookEntry(name, number));
  }

  public static String searchNumber(String name) {
    for (PhoneBookEntry entry : entries) {
    if (entry.name.equals(name)) {
      return entry.number;
    }
    }
  //if name does not exist, return unknown
  return "Unknown";
  }

  public static void main(String[] args) {
    changeEntry("John", "555-1234");
    changeEntry("Jane", "555-5678");
    System.out.println("John's number is " + searchNumber("John")); // prints 555-1234
    System.out.println("Jane's number is " + searchNumber("Jane")); // prints 555-5678
    System.out.println("Bob's number is " +searchNumber("Bob")); // prints Unknown
  }



}