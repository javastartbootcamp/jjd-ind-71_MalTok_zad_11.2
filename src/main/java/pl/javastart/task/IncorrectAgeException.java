package pl.javastart.task;

class IncorrectAgeException extends RuntimeException {
    private final int minimumAge;

    public IncorrectAgeException(String message, int minimumAge) {
        super(message);
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge() {
        return minimumAge;
    }
}
