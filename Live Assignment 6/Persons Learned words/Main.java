public class Main {
  public static void main(String[] args) {
    PersonA personA = new PersonA("John", "Doe");
    PersonB personB = new PersonB("Jane", "Doe");

    personA.learn("Hello");
    personA.learn("World");

    personB.learn("Bonjour");
    personB.learn("Monde");
    personB.learn("Hola");

    System.out.println("Number of learned by PersonA: "+ personA.getNumberOfWords());
    System.out.println("Number of learned by PersonB: "+ personB.getNumberOfWords());
  }
}