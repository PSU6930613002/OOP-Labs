public abstract class PSUStudent{
    protected int age;
    protected double gpa;
    public PSUStudent(int age, double gpa){
        if(age < 0){
            throw new IllegalArgumentException("Illegal input!");
        }
        else{
            this.age = age;
        }
        if(gpa >=0.0 && gpa <=4.0){
            this.gpa = gpa;
        }
        else{
            throw new IllegalArgumentException("Illegal input!");
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public abstract double revealGrade();
    public void setCurrentYear(int currentYear) {
        throw new UnsupportedOperationException("Only undergraduate students have a current year");
    }
    public void setPassThesis(boolean passThesis) {
        throw new UnsupportedOperationException("Only graduate students have a thesis status");
    }
}