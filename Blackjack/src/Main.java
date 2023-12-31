

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        //Card.printDeck(deck);
        Card[] cardArray =new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray, aceOfHearts);
       // Card.printDeck(Arrays.asList(cardArray),"Aces of Hearts", 1);

        List<Card> cards=new ArrayList<>(52);
      //  Collections.fill(cards, aceOfHearts);
//        System.out.println(cards);
//        System.out.println("cards.size()= "+cards.size());

        List<Card> acesOfHearts=Collections.nCopies(13,aceOfHearts);
       // Card.printDeck(acesOfHearts,"Aces of Hearts",1);



//        List<String> test=Collections.nCopies(13,"x");
//        test.stream().forEach(s-> System.out.println(s));

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingsOfClubs=Collections.nCopies(13,kingOfClubs);
       // Card.printDeck(kingsOfClubs,"king Of Clubs",1);

        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Card collection with acess  added",1);

    }
}












