package hello;

public class App {
  public static void main(String[] args) {
    Person navid = new Person("Navid", "Mashayekhi");
    Person mohammad = new Person("Mohammad", "Mahboubi");
    Person parham = new Person("Parham", "Alvani");
    Person elahe = new Person("Elahe", "Dastan");

    parham.addFriends(navid);
    parham.addFriends(mohammad);
    parham.addFriends(elahe);

    System.out.println(parham);
  }
}
