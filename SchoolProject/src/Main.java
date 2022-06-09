public class Main {
    public static void main(String[] args) {
        //creating a school
        School school = new School("Abc", "Edmonton");

        //adding students to the list
        school.addStudent(new Student("Travis","Smith",5));
        school.addStudent(new Student("Bill","Elzer",6));
        school.addStudent(new Student("Premaya","Sol",2));
        school.addStudent(new Student("Jiritza","Ty",9));
        school.addStudent(new Student("Dreia","Prius",3));
        school.addStudent(new Student("Eia","Brioche",3));
        school.addStudent(new Student("Scott","Fiz",10));
        school.addStudent(new Student("Yun","Smith",1));
        school.addStudent(new Student("Susie","Olris",7));
        school.addStudent(new Student("Yiris","Jin",8));

        //adding teachers to the list
        school.addTeacher(new Teacher("Ezreal","Theis","Math"));
        school.addTeacher(new Teacher("Qira","Yonis","Physics"));
        school.addTeacher(new Teacher("Yipha","Fei","Chemistry"));

        //displaying both lists
        school.showStudent();
        school.showTeacher();

        //removing 2 students and 1 teacher
        school.delStudent(3);
        school.delStudent(5);
        school.delTeacher(1);

        //displaying both lists
        school.showStudent();
        school.showTeacher();

    } //end of main
}
