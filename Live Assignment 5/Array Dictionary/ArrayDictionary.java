public class ArrayDictionary{
  private DictionaryElement[] dictionary;

  public ArrayDictionary(int size){
    this.dictionary = new DictionaryElement[size];
  }

  public boolean add(Object key, Object value){
    for (int i = 0; i < dictionary.length; i++){
      if (dictionary[i] == null || dictionary[i].getKey().equals(key)) {
        // If entry with the same key already exists, overwrite the value
        dictionary[i] = new DictionaryElement(key, value);
        return true;
      }
    }
    return false; //already full
  }

  // Method to get the value associated with a key in the dictionary
  public Object get(Object key){
    for (DictionaryElement entry : dictionary){
      if (entry != null && entry.getKey().equals(key)){
        return entry.getValue();
      }
    }
    return null; // Key not found
  }
}