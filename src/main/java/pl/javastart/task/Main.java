package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", null, 25, "1234567890");
            System.out.println(person);
//            Person person = new Person("Jan", "Kowalski", 25, "1234567890");
//            System.out.println(person);
//            person.setAge(-10);
//            System.out.println(person);
        } catch (IncorrectAgeException e) {
            System.err.println("Błędny wiek, minimalny wiek wynosi " + e.getMinimumAge());
        } catch (NameUndefinedException e) {
            if (e.getName() == null) {
                System.err.println("Należy podać wartość inną niż null");
            } else {
                System.err.println("Dane niepoprawne, tekst jest za krótki");
            }
        }
    }
}
