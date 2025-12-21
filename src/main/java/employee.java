class Employee extends Human {

    public static String company = "TechCorp"; // static field

    private String position;
    private float salary;

    public Employee(int age, String name, boolean active,
                    String position, float salary) {
        super(age, name, active);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return "I am an employee";
    }
}
