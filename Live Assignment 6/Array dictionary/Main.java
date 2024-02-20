public class Main {

  public static void main(String[] args) {
    ArrayDictionary arrayDictionary = new ArrayDictionary(10);

    /// example dict
    arrayDictionary.add("first", "value1");
    arrayDictionary.add("key2", "value2");
    arrayDictionary.add("key3", "value3");
    arrayDictionary.add("key4", "value4");
    arrayDictionary.add("key5", "value5");
    //experimenting
    arrayDictionary.add("key2", "updated value"); // add already existing key

    System.out.println("value for key2: " + arrayDictionary.get("key2")); // should print "updated value"
    System.out.println("value for key6: " + arrayDictionary.get("key6")); // should be null
  }
}