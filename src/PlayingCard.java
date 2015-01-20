public abstract class PlayingCard
{
  private int suit;
  private int rank;
  public PlayingCard(int cardSuit, int cardRank)
  {
    suit=cardSuit;
    rank=cardRank;
  }
  public abstract String toString();
  public int getSuit()
  {
    return suit;
  }
  public int getRank()
  {
    return rank;
  }
}
