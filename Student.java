import java.util.Date;

public class Student {
    private int RollNo;
    private String Name;
    private Date DOB;
    private String ClassCurent;

    public Student(int rollNo, String name, Date DOB, String classCurent){
        this.RollNo=rollNo;
        this.Name=name;
        this.DOB=DOB;
        this.ClassCurent=classCurent;
    }

    public int getRollNo() {
        return RollNo;
    }
    public String getName(){
        return Name;
    }
    public Date getDOB(){
        return DOB;
    }
    public String getClassCurent(){
        return ClassCurent;
    }
    public void setRollNo(int rollNo){
        this.RollNo=rollNo;
    }
    public void setName(String name){
        this.Name=name;
    }
    public void setDOB(Date DOB){
        this.DOB=DOB;
    }
    public void setClassCurent(String classCurent){
        this.ClassCurent=classCurent;
    }
    public String toString(){
        return "'" +RollNo+ ","+Name+"," +DOB+ ","+ClassCurent+ "'";
    }
}
