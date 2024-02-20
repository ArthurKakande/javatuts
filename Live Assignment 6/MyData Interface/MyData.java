public class MyData implements MyDataInterface {
  private int[] data;

  //contructor to initialise the data array
  public MyData() {
    //choose size based on requirements
    data = new int[10];
  }

  @Override 
  public void init(int[] array) {
    //copy content of provided array to data array
    System.arraycopy(array, 0, data, 0, Math.min(array.length, data.length));
  }

  @Override
  public int at(int n) {
    //checking if the next index is within bounds to retrun value
    if (n >= 0 && n < data.length) {
      return data[n];
    } else {
      System.out.println("Invalid index");
      return 0;
    }
  }

  public static void main(String[] args) {
    //create an instance of MyData
    MyData myDataObject = new MyData();

    int[] inputArray = {1, 2, 3, 4, 5};
    myDataObject.init(inputArray);

    //printing
    for (int i = 0; i < inputArray.length; i++) {
      System.out.println("Element at index " + i + ": " + myDataObject.at(i));
    }
  }
}