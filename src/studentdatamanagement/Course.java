
package studentdatamanagement;

public class Course {
    //member variable
    private Student name;
    private Student id;
    private Student dept;
    private String courseName = "";
    private String courseID = "";
    public int courseSeatCount = 0;
    private Student listOfStudent[];
    private int counter = 0;
    //constructor
    public Course(){}
    
    public Course(String cn, String cid, int csc)
    {
        this.courseName = cn;
        this.courseID = cid;
        this.courseSeatCount = csc;
        listOfStudent = new Student [30];
    }
    
    public void addStudent(Student s)
    {
        if(counter < 30)
        {
            listOfStudent[counter] = s;
            counter++;
        }
    }
    
    public void removeStudent(Student s)
    {
        if(counter > 0)
        {
            for(int i =0; i < counter; i++)
            {
                if(listOfStudent[i] == s)
                {
                    listOfStudent[i] = null;
                    for(int k = 0; k < counter; k++)
                    {
                        if(listOfStudent[k] == null)
                        {
                            for(int j = k; j < counter-1; j++)
                            {
                                listOfStudent[j] = listOfStudent[j+1];
                            }
                            
                        }
                    }
                    counter--;
                    /*
                    for(int j = i; j <= courseCount; j++)
                    {
                        listOfCourse[j] = listOfCourse[j+1];
                    }
                    courseCount--;*/
                    //courseCount--;
                    break;
                }
    
            }
        }
    }
    
    public void courseAdd()
    {
        this.courseSeatCount -= 1;
    }
    public void courseRemove()
    {
        this.courseSeatCount += 1;
    }
    
    public void showCourse()
    {
        System.out.println(this.courseName);
    }
    
    public void courseDetails()
    {
        System.out.println("Course Name : "+this.courseName+"   Course ID : "+ this.courseID + "    Total Seat : "+this.courseSeatCount);
        //System.out.println(this.name.getName());
        for(int i=0; i<counter; i++)
        {
            System.out.print((i+1) + "=> ");
            listOfStudent[i].showStudentInfo();
        }
    }
}
