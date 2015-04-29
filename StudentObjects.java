import java.util.ArrayList;

public class StudentObjects{
  

  public static void main(String[] args)
  {
    Student[] studentObjects = new Student[5];
    ArrayList<String> presidentsList = new ArrayList<String>();
    
    studentObjects[0] = new Student("John", "Smith", "00000001", 3.2f);
    studentObjects[1] = new Student("James", "Cowen", "00000002", 3.27f);
    studentObjects[2] = new Student("Nathan", "Howell", "00000003", 3.72f);
    studentObjects[3] = new Student("Daniel", "Dubois", "00000004", 3.9f);
    studentObjects[4] = new Student("Yohan", "Kraus", "00000005", 3.2f);
    
    
    for(int i = 0; i < studentObjects.length; i++)
    {
      if(studentObjects[i].isGoodStudent())
      {
        presidentsList.add(studentObjects[i].getFirstName() + " " + studentObjects[i].getLastName());
      }
    }
    
    System.out.println(presidentsList); //Print the students that made the President's List
    
  } // End main
  
} // End class