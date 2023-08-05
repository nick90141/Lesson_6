package task_2;

public enum Animals {
    CAT("Кошка", 1),
    DOG("Собака", 2),
    BIRD("Птица", 3);

    private final String name;
    private final int age;
    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + ", возраст: " + age;
    }
}


