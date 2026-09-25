public class CardUtilTest {
    public static void main(String[] args) {
        System.out.println("=== Class constants (no CardUtil object created) ===");
        System.out.println("HIGHEST_RANK  -> " + CardUtil.HIGHEST_RANK);
        System.out.println("HIGHEST_SUITE -> " + CardUtil.HIGHEST_SUITE);
        Card c1 = new Card(Card.Rank.ACE, Card.Suite.SPADES);
        Card c2 = new Card(Card.Rank.ACE, Card.Suite.HEARTS);
        Card c3 = new Card(Card.Rank.KING, Card.Suite.SPADES);
        Card c4 = new Card(Card.Rank.TWO, Card.Suite.CLUBS);
        System.out.println("c1 -> " + c1.getRank() + " of " + c1.getSuite());
        System.out.println("c2 -> " + c2.getRank() + " of " + c2.getSuite());
        System.out.println("c3 -> " + c3.getRank() + " of " + c3.getSuite());
        System.out.println("c4 -> " + c4.getRank() + " of " + c4.getSuite());
        System.out.println("=== isHighestCard ===");
        System.out.println("ACE of SPADES  (expect true)  -> " + CardUtil.isHighestCard(c1));
        System.out.println("ACE of HEARTS  (expect false) -> " + CardUtil.isHighestCard(c2));
        System.out.println("KING of SPADES (expect false) -> " + CardUtil.isHighestCard(c3));
        System.out.println("TWO of CLUBS   (expect false) -> " + CardUtil.isHighestCard(c4));
    }
}