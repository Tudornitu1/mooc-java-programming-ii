public class Container {
    private int x;

    public Container() {
        this.x = 0;
    }

    public int contains() {
        return x;
    }

    public void add(int amount) {
        if (amount > 0) {
            x += amount;
        }
        if (x > 100) {
            x = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            x -= amount;
        }
        if (x < 0) {
            x = 0;
        }
    }

    public String toString() {
        return x+"/100";
    }

}
