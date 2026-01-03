public class Student extends Person{
    private final int student_id;
    private static int id_gen = 1;
    private double gpa;
    private int year_of_study;

    Student(String first_name, String last_name, double gpa, int year_of_study){
        student_id = id_gen++;
        super(first_name,last_name);
        setGpa(gpa);
        setYear_of_study(year_of_study);
    }

    //role
    @Override
    public String getRole(){
        return "Studying";
    }

    //getters
    public double getGpa(){
        return gpa;
    }

    public int getYear_of_study(){
        return year_of_study;
    }

    //setters
    public void setGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }
    }

    public void setYear_of_study(int year_of_study){
        this.year_of_study = year_of_study;
    }

    @Override
    public String toString() {
        return "ID:" + student_id + ", FirstName:" + getFirstName() + ", LastName:" + getLastName() + ", GPA:" + getGpa() + ", YearOfStudy:" + getYear_of_study();
    }
}