/**
 * Del av løsningsforslaget til øving 12
 */

/**
  * Kortsorteringstest
  *
  */
class Kortsorteringstest {
  public static void main(String[] args) {
    Kort[] kortene = new Kort[10];
    kortene[0] = new Kort("hjerter", 8);
    kortene[1] = new Kort("ruter", 8);
    kortene[2] = new Kort("spar", 7);
    kortene[3] = new Kort("hjerter", 3);
    kortene[4] = new Kort("ruter", 1);
    kortene[5] = new Kort("spar", 6);
    kortene[6] = new Kort("kløver", 4);
    kortene[7] = new Kort("kløver", 3);
    kortene[8] = new Kort("hjerter", 9);
    kortene[9] = new Kort("spar", 2);

    System.out.println("Før sortering: ");
    for (int i = 0; i < kortene.length; i++) {
      System.out.println(kortene[i]);
	}
	java.util.Arrays.sort(kortene);
    System.out.println("Etter sortering: ");
    for (int i = 0; i < kortene.length; i++) {
      System.out.println(kortene[i]);
	}
  }
} // Kortsorteringstest


/* Kjøring:
F°r sortering:
hjerter 8
ruter 8
spar 7
hjerter 3
ruter 1
spar 6
kl°ver 4
kl°ver 3
hjerter 9
spar 2
Etter sortering:
ruter 1
spar 2
hjerter 3
kl°ver 3
kl°ver 4
spar 6
spar 7
hjerter 8
ruter 8
hjerter 9
*/
