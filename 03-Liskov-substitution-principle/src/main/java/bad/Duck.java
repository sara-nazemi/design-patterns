package bad;

public class Duck extends Bird {
    public Duck(String name) {
        super(name);
    }

    // duck can not fly
    // this method is not correct here
    @Override
    void fly() {
        super.fly();
    }
}
