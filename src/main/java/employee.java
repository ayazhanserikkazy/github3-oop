class Employee extends Human implements IStudy, IWork {

    public Employee(String name) {
        super(name);
    }

    public void info() {
        System.out.println("Employee: " + name);
    }

    public void study() {
        System.out.println(name + " studies");
    }

    public void exam() {
        System.out.println(name + " passed test");
    }

    public void work() {
        System.out.println(name + " works");
    }

    public void salary() {
        System.out.println("Gets salary");
    }
}

