import java.util.*;
class PersonB extends Person {
  //
  private List<String> learnedWords;

  public PersonB (String firstName, String lastName) {
    super(firstName, lastName);
    learnedWords = new ArrayList<>();
  }
  @Override
  public void learn(String newWord) {
    learnedWords.add(newWord);
  }

  @Override
  public int getNumberOfWords() {
    return learnedWords.size();
  }


  
}