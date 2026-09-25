public class Person {
    protected String lastName;
    protected String firstName;
    /*public Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    */
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
}
