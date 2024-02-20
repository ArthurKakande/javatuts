import java.util.*;
class ArrayDictionary implements Dictionary {

  private DictionaryElement[] dictionary;

  //constructor
  public ArrayDictionary (int size) {
    dictionary = new DictionaryElement[size];
  }

  @Override
  public void add(String key, String value) {
      // Search for the next free entry/position or update the value if the key already exists
      for (int i = 0; i < dictionary.length; i++) {
          if (dictionary[i] != null && dictionary[i].getKey().equals(key)) {
              // Update the value if the key already exists
             // dictionary[i].setValue(value);
              return;
          } else if (dictionary[i] == null) {
              // Add a new entry if an empty slot is found
              dictionary[i] = new DictionaryElement(key, value);
              return;
          }
      }
  }
  
  @Override
  public String get(String key) {
      // Search for a DictionaryElement with the given key
      for (DictionaryElement element : dictionary) {
          if (element != null && element.getKey().equals(key)) {
              return element.getValue();
          }
      }
      return null; // Return null if no matching DictionaryElement is found
  }
  
}