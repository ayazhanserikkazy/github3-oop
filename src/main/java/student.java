class Student extends Human implements IStudy {

    public final String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public void info() {
        System.out.println("Student: " + name);
    }

    public void study() {
        System.out.println(name + " studies");
    }

    public void exam() {
        System.out.println(name + " passed exam");
    }

    public final void showUniversity() {
        System.out.println("University: " + university);
    }
}

