abstract class Person {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public abstract void learn (String newWord);
  public abstract int getNumberOfWords();

  @Override
  public String toString() {
    return("Name: " + firstName + " " + lastName);
  }
  
}