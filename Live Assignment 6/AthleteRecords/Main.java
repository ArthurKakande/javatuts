import java.util.*;

public class Main {

  public static void main (String[] args) {

    Map<String, Integer> records = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    addTime("Peter:120", records);
    addTime("Peter:110", records);
    addTime("Katja:115", records);

    //print finsihed records
    System.out.println("Final Data:");
    for (Map.Entry<String, Integer> entry : records.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  //adding records
  public static void addTime(String line, Map<String, Integer> records) {
    //spliting the name string
    String[] parts = line.split(":");
    String name = parts[0].trim();
    int newTime = Integer.parseInt(parts[1].trim());

    //check if name exists
    if (records.containsKey(name)) {
      //if name exists, check if new time is better
      if (newTime < records.get(name)) {
        records.put(name, newTime);
      }
    } else {
      //if name does not exist, add new entry
      records.put(name, newTime);
      
    }
  }
}