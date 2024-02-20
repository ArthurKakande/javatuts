import java.util.*;
class PersonA extends Person {

  //
  private String[] learnedWords;
  private int numberOfWords;

  public PersonA(String firstName, String lastName) {
    super(firstName, lastName);
    learnedWords = new String[100];
    numberOfWords = 0;
  }

  @Override
  public void learn (String newWord) {
    if (numberOfWords < learnedWords.length) {
      learnedWords[numberOfWords] = newWord;
      numberOfWords++;
    }
  }

  @Override
  public int getNumberOfWords() {
    return numberOfWords;
  }



  
}