public class Card
{
    private int suit;// non static member are created
    // separately for each object
    public static String name="casino";
    public Card()
    {


    }
    public Card(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + '}';
    }
}

