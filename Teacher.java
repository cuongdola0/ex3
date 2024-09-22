
package Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Teacher extends Person {
    String department;
    String teachingSubject;

    public Teacher(String Tid, String Tname, Date teacherDob, String department1, String subject) {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    

    public String getDepartment() {
        return department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
    public void addTeacher(){
        
    }
    public void updateTeacher(String id){
        
    }
    public void displayInfo(){
        SimpleDateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(getDateOfBirth());
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("date: "+date);
        System.out.println("department: "+department);
        System.out.println("teachingSubject: "+teachingSubject);
    }
            
}