package Lection06.online.HomeWork06;

public class Animal {

    private String type;
    protected String name;
    int swimLimit;
    int runLimit;

    public static int count = 0;

    public Animal(String type, String name, int runLimit, int swimLimit) {
        this.type = type;
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        ++count;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public int getRunLimit() {
        return runLimit;
    }

    protected boolean run(int distance) {
        return (distance <= runLimit);
    }

    protected boolean swim(int distance) {
        return (distance <= swimLimit);
    }

}
