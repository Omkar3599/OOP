class Students{
    final static String COLLEGE = "MIT";
    String name;
    int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    

    void display_details(){
        System.out.println("Student name : "+name+"\nStudent id: "+id +"\nCollege name: "+COLLEGE);
    }

}

public class Student_details{
    public static void main(String[] args) {
        Students s1 = new Students("Rishi",55);
        s1.display_details();
        Students s2  = new Students("Mihir",56);
        s2.display_details();
        Students s3 =  new Students("Omkar",57);
        s3.display_details();
    }
}