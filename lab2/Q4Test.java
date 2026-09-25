public class Q4Test {
    public static void main(String[] args) {
        System.out.println("=== Lab example ===");
        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println("Mother (expect Ms.Alice) -> " + m.getFirstName());
        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println("Father (expect Mr.Bob) -> " + f.getFirstName());
        Person p = new Person();
        p.setFirstName("John");
        System.out.println("Person (expect John) -> " + p.getFirstName());
        System.out.println("=== Last name ===");
        m.setLastName("Smith");
        f.setLastName("Smith");
        System.out.println("Mother last name (expect Smith) -> " + m.getLastName());
        System.out.println("Father last name (expect Smith) -> " + f.getLastName());
        System.out.println("=== Father.getWife ===");
        Mother wife = f.getWife();
        System.out.println("Bob's wife (expect Ms.Alice) -> " + wife.getFirstName());
        System.out.println("=== Child ===");
        Child c = new Child(8, 130, 25.5);
        c.setFirstName("Tom");
        System.out.println("Child name (expect Tom) -> " + c.getFirstName());
        c.setGuardian(m);
        Person g = c.getGuardian();
        System.out.println("Tom's guardian (expect Ms.Alice) -> " + g.getFirstName());
        System.out.println("=== Parent.setChild / getChild ===");
        m.setChild(c);
        f.setChild(c);
        Child kid1 = m.getChild();
        Child kid2 = f.getChild();
        System.out.println("Alice's child (expect Tom) -> " + kid1.getFirstName());
        System.out.println("Bob's child (expect Tom) -> " + kid2.getFirstName());
    }
}