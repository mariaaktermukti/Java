public class CardTester
{
    public static void main(String[] args) {
        System.out.println(Card.name);
        Card.name="No card while studying";
        Card c1= new Card(6);
        Card c2= new Card(7);
        System.out.println(c1.getSuit());
        System.out.println(c2.getSuit());

        System.out.println(c1.name);
        System.out.println(c2.name);

        c1.name="casino royale";
        System.out.println(c2.name);
    }
}
