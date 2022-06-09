import java.util.ArrayList;

public class School {

    //fields
    public ArrayList<Teacher> teachers = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<String> courses = new ArrayList<>();

    private String schoolName;
    private String schoolCity;
    static int schoolRanking=1;
    private int schoolRank=1;

    //constructor
    School(String schoolName,String schoolCity){
        this.schoolName="";
        this.schoolCity="";
        this.schoolRank=schoolRanking;
        schoolRanking++;
    }

    //adding teachers and students to the list
    public void addTeacher(Teacher t){
        teachers.add(t);
    }

    public void addStudent(Student s){
        students.add(s);
    }

    //removing teachers and students from the list with their index position
    public void delTeacher(int t){
        if(t<teachers.size()) teachers.remove(t);
    }
    public void delStudent(int s){
        if(s<students.size()) students.remove(s);
    }

    //iterating through the lists to display student/teacher info
    public void showTeacher(){
        for(int i=0;i<teachers.size();i++){
            Teacher t = teachers.get(i);
            t.show();
        }
    }

    public void showStudent(){
        for(int i=0;i<students.size();i++){
            Student s = students.get(i);
            s.show();
        }
    }

    //getters and setters
    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public int getSchoolRank() {
        return schoolRank;
    }

    public void setSchoolRank(int schoolRank) {
        this.schoolRank = schoolRank;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}//end of class
