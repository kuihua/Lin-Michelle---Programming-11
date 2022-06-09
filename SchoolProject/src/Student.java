public class Student {

    //fields
    private String firstName;
    private String lastName;
    private int grade;
    private int idNum;
    static int studentNum = 1;

    //constructor
    Student(String firstName, String lastName, int grade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grade=grade;
        this.idNum = studentNum;
        studentNum++;
    }

    //displaying student info
    public void show(){
        System.out.println("Name: "+firstName +" "+ lastName + " Grade: "+grade);
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

} //end of class



