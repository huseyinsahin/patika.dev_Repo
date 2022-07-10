public class Student{
    Course math;
    Course physics;
    Course chemistry;
    String name;
    String studentNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, int classes, Course math, Course physics, Course chemistry){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkVerbalNote(int mathVerbal, int physicsVerbal, int chemistryVerbal){
        if (mathVerbal >= 0 && mathVerbal <= 100) {
            this.math.verbalNote = mathVerbal;
        }

        if (physicsVerbal >= 0 && physicsVerbal <= 100) {
            this.physics.verbalNote = physicsVerbal;
        }

        if (chemistryVerbal >= 0 && chemistryVerbal <= 100) {
            this.chemistry.verbalNote = chemistryVerbal;
        }
    }

    void addBulkExamNote(int mathExam, int physicsExam, int chemistryExam){
        if(mathExam >= 0 && mathExam <= 100){
            this.math.note = mathExam;
        }

        if(physicsExam >= 0 && physicsExam <= 100){
            this.physics.note = physicsExam;
        }

        if(chemistryExam >= 0 && chemistryExam <= 100){
            this.chemistry.note = chemistryExam;
        }
    }

    public void calcAverage(){
        double mathAverage = this.math.note * 0.8 + this.math.verbalNote * 0.2;
        double physicsAverage = this.physics.note * 0.75 + this.physics.verbalNote * 0.25;
        double chemistryAverage = this.chemistry.note * 0.6 + this.chemistry.verbalNote * 0.4;
        double GPA = (mathAverage + physicsAverage + chemistryAverage) / 3;
        this.average = Math.round(GPA * 100) / 100d;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    void isPass(){
        if(this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0){
            System.out.println("Notes are not fully entered.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if(this.isPass){
                System.out.println("Pass the class");
            }else{
                System.out.println("Fail the class");
            }
        }
    }

    void printNote(){
        System.out.println("===================================");
        System.out.println("Student : " + this.name);
        System.out.println(this.math.name + " Exam Note\t\t:" + this.math.note  
                                          + "\tVerbal Note\t:" + this.math.verbalNote);
        System.out.println(this.physics.name + " Exam Note\t:" + this.physics.note
                                             + "\tVerbal Note\t:" + this.physics.verbalNote);
        System.out.println(this.chemistry.name + " Exam Note\t:" + this.chemistry.note
                                               + "\tVerbal Note\t:" + this.chemistry.verbalNote);
    }

}