public class Main {
    public static void main(String[] args) {

        Student student = new Student("Kamila", "AITU");
        Human human = new Employee("Lara");
        IStudy studyRef = new Employee("Tomiris");

        student.info();
        student.study();
        student.exam();
        student.showUniversity();
        student.sleep();

        human.info();
        human.sleep();

        studyRef.study();
        studyRef.exam();
    }
}