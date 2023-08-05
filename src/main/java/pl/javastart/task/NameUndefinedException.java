package pl.javastart.task;

class NameUndefinedException extends RuntimeException {
    private final String name;

    public NameUndefinedException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
