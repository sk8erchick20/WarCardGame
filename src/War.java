import java.util.ArrayList;
public class War 
{
  public static void main(String[] args) 
  {
// create deck, hands and stacks
    CardDeck deck = new CardDeck();
    CardList p1= new CardList();
    CardList p2= new CardList();
    CardList stack1 = new CardList();
    CardList stack2 = new CardList();
    deck.Shuffle();
    System.out.println("A --- Player --- B");
    System.out.println(deck.getSize());
    for(int i= 0; i<26; i++)
    {
      Card c = deck.takeCardFromTop();
      p1.addCardToTop(c);
    }
    for(int i=0; i<26; i++){
      Card d= deck.takeCardFromTop();
      p2.addCardToTop(d);
    }
    int r=1;
    while(p1.getSize()>0 && p2.getSize()>0)
    {
      Card c1 = p1.takeCardFromTop();
      stack1.addCardToTop(c1);
      Card c2 = p2.takeCardFromTop();
      stack2.addCardToTop(c2);
      System.out.println(p1.getSize()+" ---round "+r+"--- "+p2.getSize());
      System.out.println(c1.toString()+" : "+c2.toString());
      r++;
      if(c1.compareTo(c2) >0)
      {
        p1.addCardToBottom(c1);
        p1.addCardToBottom(c2);
      }
      else if(c1.compareTo(c2)< 0)
      {
        p2.addCardToBottom(c1);
        p2.addCardToBottom(c2);
      }
      else
      {
        while(stack1.getCard(stack1.getSize()-1)== stack2.getCard(stack2.getSize()-1))
        {
     
          stack1.addCardToTop(p1.takeCardFromTop());
          stack1.addCardToTop(p1.takeCardFromTop());
          stack2.addCardToTop(p2.takeCardFromTop());
          stack2.addCardToTop(p2.takeCardFromTop());
        }
        if((stack1.getCard(stack1.getSize()-1)).compareTo( stack2.getCard(stack2.getSize()-1)) >0)
        {
          for(int i=0; i<stack1.getSize(); i++)
          {
            p1.addCardToBottom(stack1.takeCardFromTop());
            p1.addCardToBottom(stack2.takeCardFromTop());
          }
        }
        if((stack1.getCard(stack1.getSize()-1)).compareTo(stack2.getCard(stack2.getSize()-1))> 0)
        {
          for(int i=0; i<stack1.getSize(); i++)
          {
            p1.addCardToBottom(stack1.takeCardFromTop());
            p1.addCardToBottom(stack2.takeCardFromTop());
          }
        }
      }
    }
  }
}
