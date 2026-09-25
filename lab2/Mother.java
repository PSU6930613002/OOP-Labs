public class Mother extends Parent {
    private Father husband;
    public Mother() {
        super(0);
    }
    @Override
    public String getFirstName() {
        return "Ms." + super.getFirstName();
    }
}