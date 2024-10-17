/*
import java.util.*;

class Student{
    private int roll;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public Student(int roll, String name, String branch, double score, boolean dayScholar){
        this.roll=roll;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar  =dayScholar;
    }
    //getter
    public int getRoll(){
        return this.roll;
    }
    public String getName(){
        return this.name;
    }
    public String getBranch(){
        return this.branch;
    }
    public double getScore(){
        return this.score;
    }
    public boolean getDayScholar(){
        return this.dayScholar;
    }


}
public class StudentMain {
    public static int findCountOfDayscholarStudents(Student [] s){
        int count = 0;
        for(int i = 0; i <s.length; i++){
            if(s[i].getScore() > 80  && s[i].getDayScholar() == true){
                count++;
            }
        }
        return count;
    }
    public static Student findStudentwithSecondHighestScore(Student []s){
       //finding max form not dayscholars
        double max= 0;
        for(int i = 0; i<s.length; i++){
            if(s[i].getDayScholar() == false){
                if(max < s[i].getScore()){
                    max = s[i].getScore();
                }
            }
        }
        double secondMax = 0;
        // finding second max from non day scolars
        for(int i = 0; i<s.length; i++){
            if(s[i].getDayScholar() == false){
                if( max > s[i].getScore() && secondMax < s[i].getScore()){
                   secondMax = s[i].getScore();
                }
            }
        }

        //searching that value of second max and returning it
        for(int i = 0; i<s.length; i++){
            if(secondMax == s[i].getScore()){
               return s[i];
            }
        }
        
        
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s [] = new Student[4];
        for(int i = 0; i<s.length; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();
            s[i] = new Student(a,b,c,d,e);
        }
        int ans1 = findCountOfDayscholarStudents(s);
        Student ans2 = findStudentwithSecondHighestScore(s);
        
        if(ans1 > 0){
            System.out.println(ans1);
        }
        else{
            System.out.println("There are no such dayscholar students");
        }
        if(ans2 !=null){
            System.out.println(ans2.getRoll()+"#"+ans2.getName()+"#"+ans2.getScore());
        }
        else{
            System.out.println("There are no student from non day scholar");
        }
    }
}

*/

package IPA3;
import java.util.*;
public class IPA3 {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<student.length; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean(); 

            student[i] = new Student(a,b,c,d,e);
        }

        int ans1 = findCountofDayscholarStudents(student);
        if(ans1>0)
        {
            System.out.println(ans1);
        }
        else
        {
            System.out.println("No student found");
        }

        Student ans2 = findStudentWithSecondHighestScore(student);
        if(ans2== null)
        {
            System.out.println("No student found");
        }
        else{
            System.out.println(ans2.getRollNo()+"#"+ans2.getName()+"#"+ans2.getScore());
        }
    }
    public static int findCountofDayscholarStudents(Student[] student)
    {
        int count=0;
        for(int i=0; i<student.length; i++)
        {
            if (student[i].getDayScholar()==true && student[i].getScore()>80)
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        return 0;
    }
    public static Student findStudentWithSecondHighestScore(Student[] student)
    {
        double[] arr = new double[0];  // length of array = 0
        for(int i=0; i<student.length; i++)
        {
            if(student[i].getDayScholar()==false)
            {
                arr = Arrays.copyOf(arr,arr.length+1); // length of array = 1
                arr[arr.length-1] = student[i].getScore();
            }
        }
        Arrays.sort(arr);
        double shs = arr[arr.length-2];
        for(int i=0; i<student.length; i++)
        {
            if(student[i].getScore()== shs)
            {
                return student[i];
            }
        }

        return null;
    }
}
class Student
{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

// constructor   

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

// getter and setter to access by main method

    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getScore()
    {
        return score;
    }
    public void setScore(double score)
    {
        this.score = score;
    }
    public boolean getDayScholar()
    {
        return dayScholar;
    }
    public void setDayScholar(boolean dayScholar)
    {
        this.dayScholar = dayScholar;
    }

}
