public class Student{
  
  private String firstName, lastName, studentId;
  private float gpa;
  private final float THRESHOLD = 3.5f;
  
  public Student(String firstName, String lastName, String studentId, float gpa)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentId = studentId;
    this.gpa = gpa;
  } // End Constructor
  
  //Accessor Methods
  public String getFirstName(){
    return firstName;
  }
  
  public String getLastName(){
    return lastName;
  }
  
  public String getId(){
    return studentId;
  }
  
  public float getGpa(){
    return gpa;
  }
  
  //Modifier Methods
  public void setFirstName(String fName){
    this.firstName = fName;
  }
  
  public void setLastName(String lName){
    this.lastName = lName;
  }
  
  public void setStudentId(String newStudentId){
    this.studentId = newStudentId;
  }
  
  public void setGpa(float newGpa){
    this.gpa = newGpa;
  }
  
  //This method checks to see if the student's GPA is above 3.5
  public boolean isGoodStudent()
  {
    return this.gpa > THRESHOLD;
  }
  
  //Method to format data output
  public String toString(){
    return "First Name: " + firstName + ", Last Name: " + lastName + ", Student ID: " + studentId + ", GPA: " + gpa;
  }
  
  
} // End Class