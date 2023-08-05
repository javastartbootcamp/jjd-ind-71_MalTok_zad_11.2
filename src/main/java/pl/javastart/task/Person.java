package pl.javastart.task;

class Person {
    private static final int MINIMUM_AGE = 1;
    private static final int MINIMUM_CHARACTERS = 2;
    private String firstName;
    private String lastName;
    private int age;
    private final String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public void setFirstName(String firstName) {
        if (textIncorrect(firstName)) {
            throw new NameUndefinedException("Incorrect length or null", firstName);
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (textIncorrect(lastName)) {
            throw new NameUndefinedException("Incorrect length or null", lastName);
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < MINIMUM_AGE) {
            throw new IncorrectAgeException("Age minimum exceeded", MINIMUM_AGE);
        }
        this.age = age;
    }

    private boolean textIncorrect(String text) {
        return text == null || text.length() < MINIMUM_CHARACTERS;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}