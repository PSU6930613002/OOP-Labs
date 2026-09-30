public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] clubs = new Club[4];
        clubs[0] = new Club("Student", 10);
        clubs[1] = new SportsClub("Football", 22);
        clubs[2] = new ESportsClub("RoV", 1);
        clubs[3] = new MarketingClub("Advertising", 2, 100);
        clubs[0].addMember(190);
        clubs[1].addMember(18);
        clubs[2].addMember(4);
        clubs[3].addMember(8);
        ClubManagingSystem manager = new ClubManagingSystem(clubs);
        Club highest = manager.getHighestMemberClub();
        System.out.println("getHighestMemberClub() = " + highest.getName() + "  (expected: Student)");
        System.out.println("determineAllBudget()   = " + manager.determineAllBudget() + "  (expected: 257200)");
        System.out.println("getAllMembers()        = " + manager.getAllMembers() + "  (expected: 255)");
    }
}