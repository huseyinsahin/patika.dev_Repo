public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int verbalNote;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int verbalNote = 0;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println("Transaction successful.");
        }else{
            System.out.println("An academic named " + teacher.name + " cannot teach this course.");
        }
        
    }

    void printTeacher(){
        if(courseTeacher != null){
            System.out.println("Academician of the " + this.name + " course " + courseTeacher.name);
        }else{
            System.out.println("No academician has been assigned to the " + this.name + " course.");
        }
    }
}
