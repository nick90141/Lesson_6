package task_4;

public enum Vehicles {
    BMW(10000),
    MERCEDES(11000),
    HONDA(7000),
    CHEVROLET(6000),
    MAZDA(8000);
    private final int price;

    Vehicles(int price) {
        this.price = price;
    }
    public String getColor(){
        switch (this){
            case BMW:
                return "Черный";
            case MERCEDES:
                return "Белый";
            case HONDA:
                return "Серый";
            case CHEVROLET:
                return "Красный";
            case MAZDA:
                return "Бежевый";
        }
        return null;
    }
    @Override
    public String toString() {
        return "Модель: " + name () + ", стоимость: " + price + ", цвет: " + getColor();
    }
}

