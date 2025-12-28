abstract class Human {

    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void info();

    public void sleep() {
        System.out.println(name + " sleeps");
    }
}

