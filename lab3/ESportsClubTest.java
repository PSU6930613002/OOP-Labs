public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        System.out.println("===== ESportsClub e = new ESportsClub(\"Esport\", 100) =====");
        System.out.println("[attributes]");
        System.out.println("clubName     = " + e.getName());
        System.out.println("minNumMember = " + e.minNumMember);
        System.out.println("numMember    = " + e.getNumMember());
        System.out.println("[methods]");
        System.out.print("advertise()       -> ");
        e.advertise();
        System.out.println("determineBudget() -> " + e.determineBudget());
        System.out.println("getName()         -> " + e.getName());
        System.out.println();
        Club c = new ESportsClub("Esport", 100);
        System.out.println("===== Club c = new ESportsClub(\"Esport\", 100) =====");
        System.out.println("[attributes]");
        System.out.println("clubName     = " + c.getName());
        System.out.println("minNumMember = " + c.minNumMember);
        System.out.println("numMember    = " + ((ESportsClub) c).getNumMember());
        System.out.println("[methods]");
        System.out.print("advertise()       -> ");
        c.advertise();
        System.out.println("determineBudget() -> " + c.determineBudget());
        System.out.println("getName()         -> " + c.getName());
    }
}