
package Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Student extends Person{
    float gpa;
    String major;

    public Student(String major, String name1, Date dateOfBirth1, float gpa, String major1) {
        this.gpa = gpa;
        this.major=major;
    }

    


    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public Student() {
    }
    public void addStudent(){
        
    }
    public void updateStudent(String id){
        
    }
    public void displayInfo(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(getDateOfBirth());
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("date: "+date);
        System.out.println("gpa: "+gpa);
        System.out.println("major: "+major);
    }
    
}