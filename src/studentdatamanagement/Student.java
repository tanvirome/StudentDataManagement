
package studentdatamanagement;

public class Student {
    //member variable
    private String id="";
    private String name="";
    private String dept="";
    private int courseCount = 0;
    private Course listOfCourse[];
    //constructor
    public Student()
    {
        //default constructor
    }
    public Student(String n, String i, String d)
    {
        this.id=i;
        this.name=n;
        this.dept=d;
        listOfCourse = new Course[5];
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getDept()
    {
        return dept;
    }
    
    public void AddCourse(Course c)
    {
        if(courseCount < 5)
        {
            //System.out.println("Course Added1");
            if(c.courseSeatCount > 0)
            {
                //System.out.println("Course Added2");
                if(courseCount == 0)
                {
                    c.courseAdd();
                    System.out.println("Course Added");
                    listOfCourse[courseCount] = c;
                    courseCount++;
                    c.addStudent(this);
                }
                else
                {
                    int f=0;
                    for(int i =0; i < courseCount; i++)
                    {
                        if(listOfCourse[i]==c)
                        {
                            f = 1;
                            break;
                        }
                    }
                    if(f==0)
                    {
                        c.courseAdd();
                        System.out.println("Course Added");
                        listOfCourse[courseCount] = c;
                        courseCount++;
                        c.addStudent(this);
                    }
                    else if(f==1)
                    {
                        System.out.println("You Already Take This Course");
                    }
                }
            }
            else
            {
                System.out.println("Don't Have Enough Seat");
            }
        }
        else
        {
            System.out.println("You Have Already Take Maximum Courses");
        }
    }
    
    public void RemoveCourse(Course c)
    {
        if(courseCount > 0)
        {
            for(int i =0; i < courseCount; i++)
            {
                if(listOfCourse[i]==c)
                {
                    c.courseRemove();
                    System.out.println("Course Removed");
                    listOfCourse[i] = null;
                    for(int k = 0; k < courseCount; k++)
                    {
                        if(listOfCourse[k] == null)
                        {
                            for(int j = k; j < courseCount-1; j++)
                            {
                                listOfCourse[j] = listOfCourse[j+1];
                            }
                        }
                    }
                    courseCount--;
                    c.removeStudent(this);
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
        else
        {
            System.out.println("You Don't Take Any Courses");
        }
    }
    //helper method
    public void showInfo()
    {
        System.out.println("\nStudent Name : "+this.name);
        System.out.println("Student ID   : "+this.id);
        System.out.println("Department   : "+this.dept);
        System.out.println("Course Taken : " + this.courseCount);
        System.out.println("Courses      : ");
        for(int i=0; i<courseCount; i++)
        {
            System.out.print("\t   "+(i+1) + "=> ");
            if(listOfCourse[i] != null)
            {
                listOfCourse[i].showCourse();
            }
        }
    }
    public void showStudentInfo()
    {
        System.out.print("Student Name : "+this.name);
        System.out.print("  Student ID   : "+this.id);
        System.out.println("    Department   : "+this.dept);
    }
}
