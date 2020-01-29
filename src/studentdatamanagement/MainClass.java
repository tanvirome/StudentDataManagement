
package studentdatamanagement;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student ("Tanvir Ahamed Ome1", "17-34279-1", "CSE");
        Student s2 = new Student ("Tanvir Ahamed Ome2", "17-34279-1", "CSE");
        Student s3 = new Student ("Tanvir Ahamed Ome3", "17-34279-1", "CSE");
        Student s4 = new Student ("Tanvir Ahamed Ome4", "17-34279-1", "CSE");
        Course c1 = new Course ("JAVA1", "159357", 30);
        Course c2 = new Course ("JAVA2", "159357", 30);
        Course c3 = new Course ("JAVA3", "159357", 30);
        Course c4 = new Course ("JAVA4", "159357", 30);
        Course c5 = new Course ("JAVA5", "159357", 30);
        Course c6 = new Course ("JAVA6", "159357", 30);
        s1.AddCourse(c1);
        
        //s1.AddCourse(c2);
        //s1.AddCourse(c2);
        //s1.AddCourse(c3);
        //s1.AddCourse(c4);
        //s1.AddCourse(c5);
        //s1.AddCourse(c6);
        
        //s1.RemoveCourse(c1);
        s1.AddCourse(c6);
        s2.AddCourse(c6);
        s3.AddCourse(c6);
        s4.AddCourse(c6);
        //s1.RemoveCourse(c2);
        //s1.RemoveCourse(c3);
        //s1.RemoveCourse(c4);
        //s1.RemoveCourse(c5);
        //s1.RemoveCourse(c5);
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
        c1.courseDetails();
        c2.courseDetails();
        c3.courseDetails();
        c4.courseDetails();
        c5.courseDetails();
        c6.courseDetails();
        
    }
    
}
