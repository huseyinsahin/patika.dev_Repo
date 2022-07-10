public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Huseyin", "33333", "MTH");
        Teacher t2 = new Teacher("Ertugrul", "55555", "PHY");
        Teacher t3 = new Teacher("Faruk", "99999", "CHM");

        Course math = new Course("Math", "101", "MTH");
        Course physics = new Course("Physics", "102", "PHY");
        Course chemistry = new Course("Chemistry", "103", "CHM");
        
        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Burak", "348923", 2, math, physics, chemistry);
        s1.addBulkExamNote(60, 50, 30);
        s1.addBulkVerbalNote(70,60,20);
        s1.isPass();

        Student s2 = new Student("Ziya", "636733", 2, math, physics, chemistry);
        s2.addBulkExamNote(30, 60, 70);
        s2.addBulkVerbalNote(50,60,90);
        s2.isPass();

        Student s3 = new Student("Eray", "457878", 2, math, physics, chemistry);
        s3.addBulkExamNote(70, 80, 25);
        s3.addBulkVerbalNote(60,75,50);
        s3.isPass();
    }
}
