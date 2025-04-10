
class Student {

    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";

    }

}

class F {

    public static void main(String[] args) {
        Student.school = "jvm";
        Student student1 = new Student();
        student1.name = "tony";
        System.out.print(student1.school);
    }
}
