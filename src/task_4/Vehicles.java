package task_4;

public enum Vehicles {
    BMW("Черный", 10000),
    MERCEDES("Белый", 11000),
    HONDA("Серый", 7000),
    CHEVROLET("Красный", 6000),
    MAZDA("Бежевый", 8000);

    private final String color;
    private final int price;

    Vehicles(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Модель: " + name() + ", стоимость: " + price + ", цвет: " + color;
    }
}

