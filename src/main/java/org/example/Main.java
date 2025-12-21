import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Is active? (true/false): ");
        boolean active = sc.nextBoolean();

        Human human = new Human(age, name, active);
        Employee employee = new Employee(30, "Alex", true, "Developer", 3000f);
        Student student = new Student(20, "Anna", true, "IT", 3.8f);

        human.introduce();
        System.out.println(human.getRole());

        employee.introduce();
        System.out.println(employee.getRole());
        System.out.println(Employee.company);

        student.introduce();
        System.out.println(student.getRole());
    }
}
