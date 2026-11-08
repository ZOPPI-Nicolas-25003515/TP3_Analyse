import java.util.Date;

public class Student extends Adherent {
    private int numStudent;
    public Student(int numStudent,String name, String secondName, String address, String email, Date adhesionDate) {
        super(name,secondName,address,email,adhesionDate);
        this.numStudent = numStudent;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }
}