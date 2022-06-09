public class Teacher {

    //fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //display teacher info
    public void show(){
        System.out.println("Name: "+firstName +" "+ lastName + " Subject: "+subject);
    }

    //getters and setters
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}//end of class
