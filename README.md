War - Thursday 1/15/2015: due Monday 1/19/2015
==============

## Objectives
- Understand how to create classes from an abstract class and interfaces

## Assignment
- Complete program War

### PlayingCard
- Finish implementing methods
  
### Card
- Complete Class card by extending abstract Class PlayingCard and implementing the Comparable interface
    
### CardList
- Create class CardList - see PowerPoint for design specification
  
  
### CardDeck
- Create class CardDeck that extends CardList - see PowerPoint for design specification
  
### CREATE main program War
main method should play one two-player game of war and create output similar to that below:
- create deck, hands and stacks
- deal the cards
- play the game
  - print out the array formatted as below:
    - HeaderRow: A --- player --- B
    - Each Round: 
      - 26 ---round 1--- 26  (# of cards in player A's hand ---round # or WAR--- # of cards in player B's hand)
      - player A's card : player B's card
```
A --- player --- B
26 ---round 1--- 26
     3-C : K-C
25 ---round 2--- 27
     5-S : 7-H
24 ---round 3--- 28
     Q-C : Q-S
23 ----- WAR ----- 27
     2-H : 7-S
21 ---round 5--- 29
     T-H : T-D
20 ----- WAR ----- 28
     5-D : J-S
18 ---round 7--- 30
     Q-D : J-D
21 ---round 8--- 29
     2-C : 6-D
20 ---round 9--- 30
     8-S : 2-D
21 ---round 10--- 29
     3-D : J-H
20 ---round 11--- 30
     9-C : K-H
19 ---round 12--- 31
     K-D : 7-D
20 ---round 13--- 30
     T-S : J-C
19 ---round 14--- 31
     4-D : 8-H
18 ---round 15--- 32
     3-H : 3-S
17 ----- WAR ----- 31
     2-S : 6-S
15 ---round 17--- 33
     4-H : T-C
14 ---round 18--- 36
     8-D : 4-C
15 ---round 19--- 35
     5-H : A-S
16 ---round 20--- 34
     9-D : 5-C
17 ---round 21--- 33
     Q-H : K-S
16 ---round 22--- 34
     9-H : 9-S
15 ----- WAR ----- 33
     Q-D : 3-C
17 ---round 24--- 31
     T-H : K-C
16 ---round 25--- 34
     J-D : 5-S
17 ---round 26--- 33
     T-D : 7-H
18 ---round 27--- 32
     8-S : 2-H
19 ---round 28--- 31
     2-D : 6-H
18 ---round 29--- 32
     K-D : 7-S
19 ---round 30--- 31
     7-D : 7-C
18 ----- WAR ----- 30
     4-C : 4-S
16 ----- WAR ----- 28
     A-S : A-C
14 ----- WAR ----- 26
     5-C : 6-D
12 ---round 34--- 32
     Q-D : 3-D
17 ---round 35--- 31
     A-H : J-H
16 ---round 36--- 34
     3-C : 9-C
15 ---round 37--- 35
     6-C : K-H
14 ---round 38--- 36
     J-D : T-S
15 ---round 39--- 35
     5-S : J-C
14 ---round 40--- 36
     T-D : 4-D
15 ---round 41--- 35
     7-H : 8-H
14 ---round 42--- 36
     8-S : 2-S
15 ---round 43--- 35
     2-H : 8-C
14 ---round 44--- 36
     K-D : 6-S
15 ---round 45--- 35
     7-S : A-D
16 ---round 46--- 34
     Q-D : 4-H
17 ---round 47--- 33
     4-C : 3-H
18 ---round 48--- 32
     8-D : T-C
17 ---round 49--- 33
     3-D : 3-S
16 ----- WAR ----- 32
     5-D : K-S
14 ---round 51--- 34
     J-D : T-H
17 ---round 52--- 33
     T-S : 9-H
18 ---round 53--- 32
     T-D : K-C
17 ---round 54--- 33
     4-D : 9-S
16 ---round 55--- 34
     8-S : 2-D
17 ---round 56--- 33
     2-S : 6-H
16 ---round 57--- 34
     K-D : 5-C
17 ---round 58--- 33
     6-S : 9-D
16 ---round 59--- 34
     7-S : A-S
17 ---round 60--- 33
     A-D : 5-H
16 ---round 61--- 34
     Q-D : 6-D
17 ---round 62--- 33
     4-H : 2-C
18 ---round 63--- 32
     4-C : A-C
19 ---round 64--- 31
     3-H : J-S
18 ---round 65--- 32
     J-D : A-H
19 ---round 66--- 31
     3-D : 7-D
18 ---round 67--- 32
     T-H : J-H
17 ---round 68--- 33
     3-S : 7-C
16 ---round 69--- 34
     T-S : 3-C
17 ---round 70--- 33
     9-H : 9-C
16 ----- WAR ----- 32
     2-D : K-H
14 ---round 72--- 34
     K-D : 5-S
17 ---round 73--- 33
     5-C : J-C
16 ---round 74--- 34
     7-S : 7-H
15 ----- WAR ----- 33
     Q-D : 2-H
17 ---round 76--- 31
     6-D : 8-C
16 ---round 77--- 34
     4-H : 8-D
15 ---round 78--- 35
     2-C : T-C
14 ---round 79--- 36
     4-C : 5-D
13 ---round 80--- 37
     A-C : 4-S
12 ---round 81--- 38
     J-D : K-S
11 ---round 82--- 39
     A-H : Q-H
10 ---round 83--- 40
     T-S : T-D
9 ----- WAR ----- 39
     K-D : 4-D
11 ---round 85--- 37
     9-H : 9-S
10 ----- WAR ----- 36
     9-C : 6-H
14 ---round 87--- 34
     Q-D : 6-S
17 ---round 88--- 33
     A-S : 9-D
16 ---round 89--- 34
     2-H : A-D
17 ---round 90--- 33
     8-H : 5-H
18 ---round 91--- 32
     K-D : 3-H
19 ---round 92--- 31
     3-C : J-S
18 ---round 93--- 32
     4-D : 3-D
19 ---round 94--- 31
     K-C : 7-D
20 ---round 95--- 30
     9-C : T-H
19 ---round 96--- 31
     5-S : J-H
18 ---round 97--- 32
     9-H : 3-S
19 ---round 98--- 31
     6-H : 7-C
18 ---round 99--- 32
     2-S : 2-D
17 ----- WAR ----- 31
     Q-D : K-H
15 ---round 101--- 33
     T-S : 6-C
18 ---round 102--- 32
     6-S : 5-C
19 ---round 103--- 31
     T-D : J-C
18 ---round 104--- 32
     2-H : 6-D
17 ---round 105--- 33
     A-D : 7-S
16 ---round 106--- 34
     8-H : 8-C
15 ----- WAR ----- 33
     K-D : 4-H
17 ---round 108--- 31
     3-H : 8-D
16 ---round 109--- 34
     4-D : 2-C
17 ---round 110--- 33
     3-D : T-C
16 ---round 111--- 34
     K-C : 4-C
17 ---round 112--- 33
     7-D : 5-D
18 ---round 113--- 32
     9-H : A-C
19 ---round 114--- 31
     3-S : 4-S
18 ---round 115--- 32
     T-S : J-D
17 ---round 116--- 33
     2-S : K-S
16 ---round 117--- 34
     6-C : A-H
17 ---round 118--- 33
     2-D : Q-H
16 ---round 119--- 34
     6-S : A-S
17 ---round 120--- 33
     5-C : 9-D
16 ---round 121--- 34
     K-D : 3-C
17 ---round 122--- 33
     5-H : J-S
16 ---round 123--- 34
     4-H : 9-C
15 ---round 124--- 35
     7-H : T-H
14 ---round 125--- 36
     4-D : 5-S
13 ---round 126--- 37
     2-C : J-H
12 ---round 127--- 38
     K-C : 6-H
13 ---round 128--- 37
     4-C : 7-C
12 ---round 129--- 38
     7-D : Q-D
11 ---round 130--- 39
     5-D : 9-S
10 ---round 131--- 40
     9-H : K-H
9 ---round 132--- 41
     A-C : 8-S
8 ---round 133--- 42
     6-C : T-D
7 ---round 134--- 43
     A-H : J-C
6 ---round 135--- 44
     6-S : 2-H
7 ---round 136--- 43
     A-S : 6-D
6 ---round 137--- 44
     K-D : A-D
7 ---round 138--- 43
     3-C : 7-S
6 ---round 139--- 44
     K-C : 3-H
7 ---round 140--- 43
     6-H : 8-H
6 ---round 141--- 44
     6-S : 8-D
5 ---round 142--- 45
     2-H : 8-C
4 ---round 143--- 46
     K-D : 3-D
5 ---round 144--- 45
     A-D : T-C
4 ---round 145--- 46
     K-C : 3-S
5 ---round 146--- 45
     3-H : 4-S
4 ---round 147--- 46
     K-D : T-S
5 ---round 148--- 45
     3-D : J-D
4 ---round 149--- 46
     K-C : 2-S
5 ---round 150--- 45
     3-S : K-S
4 ---round 151--- 46
     K-D : 2-D
5 ---round 152--- 45
     T-S : Q-H
4 ---round 153--- 46
     K-C : 5-C
5 ---round 154--- 45
     2-S : 9-D
4 ---round 155--- 46
     K-D : 5-H
5 ---round 156--- 45
     2-D : J-S
4 ---round 157--- 46
     K-C : 4-H
5 ---round 158--- 45
     5-C : 9-C
4 ---round 159--- 46
     K-D : 7-H
5 ---round 160--- 45
     5-H : T-H
4 ---round 161--- 46
     K-C : 4-D
5 ---round 162--- 45
     4-H : 5-S
4 ---round 163--- 46
     K-D : 2-C
5 ---round 164--- 45
     7-H : J-H
4 ---round 165--- 46
     K-C : 4-C
5 ---round 166--- 45
     4-D : 7-C
4 ---round 167--- 46
     K-D : 7-D
5 ---round 168--- 45
     2-C : Q-D
4 ---round 169--- 46
     K-C : 5-D
5 ---round 170--- 45
     4-C : 9-S
4 ---round 171--- 46
     K-D : 9-H
5 ---round 172--- 45
     7-D : K-H
4 ---round 173--- 46
     K-C : A-C
5 ---round 174--- 45
     5-D : 8-S
4 ---round 175--- 46
     K-D : 6-C
5 ---round 176--- 45
     9-H : T-D
4 ---round 177--- 46
     K-C : A-H
5 ---round 178--- 45
     A-C : J-C
4 ---round 179--- 46
     K-D : A-S
5 ---round 180--- 45
     6-C : 6-D
4 ----- WAR ----- 44
     A-H : 7-S
2 ---round 182--- 46
     K-D : 6-H
5 ---round 183--- 45
     A-S : 8-H
4 ---round 184--- 46
     K-D : 6-S
5 ---round 185--- 45
     6-C : 8-D
4 ---round 186--- 46
     6-H : 2-H
5 ---round 187--- 45
     6-D : 8-C
4 ---round 188--- 46
     K-D : A-D
5 ---round 189--- 45
     6-S : T-C
4 ---round 190--- 46
     6-H : 3-H
5 ---round 191--- 45
     2-H : 4-S
4 ---round 192--- 46
     K-D : 3-D
5 ---round 193--- 45
     A-D : J-D
4 ---round 194--- 46
     6-H : 3-S
5 ---round 195--- 45
     3-H : K-S
4 ---round 196--- 46
     K-D : T-S
5 ---round 197--- 45
     3-D : Q-H
4 ---round 198--- 46
     6-H : 2-S
5 ---round 199--- 45
     3-S : 9-D
4 ---round 200--- 46
     K-D : 2-D
5 ---round 201--- 45
     T-S : J-S
4 ---round 202--- 46
     6-H : 5-C
5 ---round 203--- 45
     2-S : 9-C
4 ---round 204--- 46
     K-D : 5-H
5 ---round 205--- 45
     2-D : T-H
4 ---round 206--- 46
     6-H : 4-H
5 ---round 207--- 45
     5-C : 5-S
4 ----- WAR ----- 44
     5-H : J-H
2 ---round 209--- 46
     6-H : 4-D
5 ---round 210--- 45
     4-H : 7-C
4 ---round 211--- 46
     6-H : 2-C
5 ---round 212--- 45
     5-C : Q-D
4 ---round 213--- 46
     4-D : 4-C
3 ----- WAR ----- 45
     6-H : 7-D
1 ---round 215--- 47
     2-C : K-H
```
