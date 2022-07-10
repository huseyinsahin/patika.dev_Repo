public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name, String mpNo, String branch){
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch; 
    }

    void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Mobil Phone : " + this.mpNo);
        System.out.println("Branch : " + this.branch);
    }
}
