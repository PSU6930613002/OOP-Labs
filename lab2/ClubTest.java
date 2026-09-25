public class ClubTest {
    public static void main(String[] args) {
        System.out.println("========== SportsClub ==========");
        SportsClub s = new SportsClub("Tennis", 10);
        System.out.println("=== Constructor ===");
        System.out.println("name -> " + s.getName());
        System.out.println("=== determineBudget ===");
        System.out.println("10 members, min 10 (expect 10000) -> " + s.determineBudget());
        s.addMember(5);
        System.out.println("15 members, min 10 (expect 15500) -> " + s.determineBudget());
        System.out.println("=== changeName should NOT change the name ===");
        s.changeName("Chess");
        System.out.println("after changeName(\"Chess\") (expect Tennis) -> " + s.getName());
        System.out.println("=== advertise (inherited from Club) ===");
        s.advertise();
        System.out.println("========== MarketingClub ==========");
        MarketingClub m = new MarketingClub("Ads", 5, 1500);
        System.out.println("=== determineBudget when budget > 1000 ===");
        System.out.println("budget 1500 (expect 0) -> " + m.determineBudget());
        System.out.println("=== useBudget ===");
        System.out.println("use 600, 1500 -> 900 (expect true)  -> " + m.useBudget(600));
        System.out.println("budget now 900, so Club's formula 5 x 1000 (expect 5000) -> " + m.determineBudget());
        System.out.println("use 1000, would be -100 (expect false) -> " + m.useBudget(1000));
        System.out.println("use 900, 900 -> 0 exactly (expect true) -> " + m.useBudget(900));
        System.out.println("use 1, would be -1 (expect false) -> " + m.useBudget(1));
        System.out.println("=== determineBudget when budget is exactly 1000 ===");
        MarketingClub edge = new MarketingClub("Edge", 3, 1000);
        System.out.println("budget 1000 is not > 1000, so 3 x 1000 (expect 3000) -> " + edge.determineBudget());
        System.out.println("=== changeName works normally (not overridden) ===");
        m.changeName("Promo");
        System.out.println("after changeName(\"Promo\") (expect Promo) -> " + m.getName());
        System.out.println("=== advertise (inherited from Club) ===");
        m.advertise();
    }
}