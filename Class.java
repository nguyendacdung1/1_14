public class Class {
    private int ClassID;
    private String ClassName;
    public Class(){
        this.ClassID=2109007;
        this.ClassName="Nguyễn Đắc Dũng";
    }
    public Class(int ClassID, String ClassName){
        this.ClassID=ClassID;
        this.ClassName=ClassName;
    }
    public int getClassID(){
        return ClassID;
    }
    public String getClassName(){
        return ClassName;
    }
    public void setClassID(int classID){
        this.ClassID=classID;
    }
    public  void setClassName(String className){
        this.ClassName=className;
    }
    public String toString(){
        return "ClassID: "+ClassID+"" +
                "Class Name: "+ClassName+".";
    }

    public static void main(String[] args) {
        Class C = new Class();
        System.out.println(C);
        Class C1=new Class(2109,"Nguyễn Đắc Dũng");
        System.out.println(C1);
        C.setClassName("Võ Huy Hoàng");
        System.out.println(C);
        System.out.println("ID: " + C.getClassID());
        System.out.println("Class: ");
    }
}
