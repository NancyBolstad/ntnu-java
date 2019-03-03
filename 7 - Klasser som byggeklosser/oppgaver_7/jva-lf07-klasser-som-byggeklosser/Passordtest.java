/**
 * L�sningsforslag til �ving 7
 *
 */

/*
 * Passordtegn (oppgitt klasse)
 */
class Passordtegn {
  public static final int STOR_AS_TALLVERDI = 'A'; // A's tallverdi i Unicode-tegnsettet (s. 62, 921)
  public static final int LITEN_AS_TALLVERDI = 'a';
  public static final int NULLS_TALLVERDI = '0';
  public static final int F�RSTETEGNSTALLVERDI = 33; // den f�rste av de skrivbare unntatt ' ' (mellomrom som er nr 32)
  public static final int SISTETEGNSTALLVERDI = 126; // den siste av de skrivbare ('~')

  public static final int ANTALL_STORE_BOKSTAVER = 'Z' - 'A' + 1; // f.o.m. A t.o.m. Z
  public static final int ANTALL_SM�_BOKSTAVER = 'z' - 'a' + 1;  // f.o.m. a t.o.m. z
  public static final int ANTALL_SIFRE = '9' - '0' + 1;  // f.o.m. 0 t.o.m. 9

  private static final java.util.Random randomGen = new java.util.Random(); // Se delkapittel 8.4 og s. 275

  public static boolean erStorBokstav(char tegn) {
    return tegn >= 'A' && tegn <= 'Z';
  }

  public static boolean erLitenBokstav(char tegn) {
    return tegn >= 'a' && tegn <= 'z';
  }

  public static boolean erSiffer(char tegn) {
    return tegn >= '0' && tegn <= '9';
  }

  public static boolean erSpesialtegn(char tegn) {
    return erPassordtegn(tegn) && !erStorBokstav(tegn) && !erLitenBokstav(tegn) && !erSiffer(tegn);
  }

  public static boolean erPassordtegn(char tegn) {
     return tegn >= F�RSTETEGNSTALLVERDI && tegn <= SISTETEGNSTALLVERDI;
  }

  /* ekstra */
  public static boolean erBokstavEllerSiffer(char tegn) {
    return erStorBokstav(tegn) || erLitenBokstav(tegn) || erSiffer(tegn);
  }

  public static char trekkStorBokstav() {
    int tall = randomGen.nextInt(ANTALL_STORE_BOKSTAVER) + STOR_AS_TALLVERDI;
        // nextInt() returnerer et heltall i intervallet [0, ANTALL_STORE_BOKSTAVER - 1]
    return (char) tall;
  }

  public static char trekkLitenBokstav() {
    int tall = randomGen.nextInt(ANTALL_SM�_BOKSTAVER) + LITEN_AS_TALLVERDI;
        // nextInt() returnerer et heltall i intervallet [0, ANTALL_SM�_BOKSTAVER - 1]
    return (char) tall;
  }

  public static char trekkSiffer() {
    int tall = randomGen.nextInt(ANTALL_SIFRE) + NULLS_TALLVERDI;
        // nextInt() returnerer et heltall i intervallet [0, ANTALL_SIFRE - 1]
    return (char) tall;
  }

  public static char trekkSpesialtegn() {
    int tall = STOR_AS_TALLVERDI;
    while (erBokstavEllerSiffer((char) tall)) {
      tall = randomGen.nextInt(SISTETEGNSTALLVERDI - F�RSTETEGNSTALLVERDI + 1) + F�RSTETEGNSTALLVERDI;
      /* nextInt() returnerer et heltall i intervallet [0, SISTETEGNSTALLVERDI - F�RSTETEGNSTALLVERDI] */
    }
    return (char) tall;
  }
} // Passordtegn



/*
 * Passordhjelper
 */
class Passordhjelper {
  private String passordet;
  private final int MIN_LENGDE = 8;

  public Passordhjelper(String forslaget) {
    passordet = fjernUlovligeTegn(forslaget);
  }

  public String getPassordet() {
    return passordet;
  }

  public int finnPassordstyrken() {
    int poeng = 0;
    boolean harStorBokstav = false;
    boolean harLitenBokstav = false;
    boolean harSiffer = false;
    boolean harSpesialtegn = false;

    for (int i = 0; i < passordet.length(); i++) {
      if (Passordtegn.erStorBokstav(passordet.charAt(i))) harStorBokstav = true;
      else if (Passordtegn.erLitenBokstav(passordet.charAt(i))) harLitenBokstav = true;
      else if (Passordtegn.erSiffer(passordet.charAt(i))) harSiffer = true;
      else harSpesialtegn = true;
    }

    if (passordet.length() >= MIN_LENGDE) poeng += 1;
    if (harStorBokstav) poeng += 1;
    if (harLitenBokstav) poeng += 1;
    if (harSiffer) poeng += 1;
    if (harSpesialtegn) poeng += 1;
    return poeng;
  }

  /**
   * Ekstra: Deloppgave d)
   * store inneholder de posisjonene der vi �nsker stor bokstav,
   * sm� inneholder de posisjonene der vi �nsker liten bokstav osv.
   * For tomme tabeller lages passordet "".
   * Antar at disse tabellene ikke er null.
   */
  public void lagPassordEtter�nske(int[] store, int[] sm�, int[] sifre, int[] spesialtegn) {
    char[] ord = new char[store.length + sm�.length + sifre.length + spesialtegn.length];
    for (int i = 0; i < store.length; i++) {
      ord[store[i]] = Passordtegn.trekkStorBokstav();
    }
    for (int i = 0; i < sm�.length; i++) {
	  ord[sm�[i]] = Passordtegn.trekkLitenBokstav();
	}
    for (int i = 0; i < sifre.length; i++) {
      ord[sifre[i]] = Passordtegn.trekkSiffer();
    }
    for (int i = 0; i < spesialtegn.length; i++) {
      ord[spesialtegn[i]] = Passordtegn.trekkSpesialtegn();
    }
    passordet = String.valueOf(ord);
  }

  public String toString() {
    return passordet;
  }

  private static String fjernUlovligeTegn(String tekst) {
    String kunLovlige = "";
    for (int i = 0; i < tekst.length(); i++) {
      char tegn = tekst.charAt(i);
      if (Passordtegn.erPassordtegn(tegn)) kunLovlige += tegn;
    }
    return kunLovlige;
  }
} // Passordhjelper



/*
 * Bruker
 */
class Bruker {
  private String brukernavnet;
  private Passordhjelper hjelperen; // inneholder brukerens passord
  private boolean p�Logget;

  public Bruker(String navn, String passord) {
    brukernavnet = navn;
    hjelperen = new Passordhjelper(passord);
    p�Logget = false;
   }

  public String getBrukernavnet() {
    return brukernavnet;
  }

  public String getPassordet() {
    return hjelperen.getPassordet();
  }

  public boolean erP�Logget() {
    return p�Logget;
  }

  public void loggInn(String navn, String passord) {
    if (brukernavnet.equals(navn) && getPassordet().equals(passord) && !p�Logget) p�Logget = true;
  }

  public void loggUt() {
    p�Logget = false;
  }

  public void lagPassordEtter�nske(int[] store, int[] sm�, int[] sifre, int[] spesialtegn) {
    if (p�Logget) hjelperen.lagPassordEtter�nske(store, sm�, sifre, spesialtegn);
  }

  public int finnPassordstyrken() {
    return hjelperen.finnPassordstyrken();
  }

  public String toString() {
    String p�loggetTekst = "";
    if (p�Logget) p�loggetTekst = " er logget inn";
    else p�loggetTekst = " er ikke logget inn";
    return brukernavnet + " med passord " + hjelperen + p�loggetTekst;
  }
} // Bruker



/*
 * Passordtest
 *
 * Ekstra: Vi tester her ogs� lagPassordEtter�nske().
 */
class Passordtest {
  public static void main(String[] args) {
    Passordhjelper hjelper1 = new Passordhjelper("Mumle G�segg!");
    System.out.println("Passordet " + hjelper1 + " har styrken " + hjelper1.finnPassordstyrken());

    Passordhjelper hjelper2 = new Passordhjelper("");
    System.out.println("Passordet " + hjelper2 + " har styrken " + hjelper2.finnPassordstyrken());

    Passordhjelper hjelper3 = new Passordhjelper("1+1=2");
    System.out.println("Passordet " + hjelper3 + " har styrken " + hjelper3.finnPassordstyrken());

    Passordhjelper hjelper4 = new Passordhjelper("Dele p� 0 er tull.");
    System.out.println("Passordet " + hjelper4 + " har styrken " + hjelper4.finnPassordstyrken());

    Bruker brukeren = new Bruker("Lars", "Mumle G�segg!");
    System.out.println("\nBrukeren f�r innlogging: " + brukeren);

    brukeren.loggInn(brukeren.getBrukernavnet(), "trubadur");
    System.out.println("\nGreide ikke � logge inn brukeren: " + brukeren);

    brukeren.loggInn("trubadur", brukeren.getPassordet());
    System.out.println("\nGreide ikke � logge inn brukeren: " + brukeren);

    brukeren.loggInn(brukeren.getBrukernavnet(), brukeren.getPassordet());
    System.out.println("\nHar logget inn brukeren: " + brukeren);

    /* Ekstra: Vi tester lagPassordEtter�nske() */

    System.out.println("\nTester lagPassordEtter�nske():");

    int[] store1 = {0, 4};
    int[] sm�1 = {};
    int[] sifre1 = {1, 3};
    int[] spesialtegn1 = {2};
    brukeren.lagPassordEtter�nske(store1, sm�1, sifre1, spesialtegn1);
    System.out.println("\nstor, siffer, spesialtegn, siffer, stor: " + brukeren.getPassordet());
    System.out.println("Passordstyrke = " + brukeren.finnPassordstyrken());

    int[] store2 = {};
    int[] sm�2 = {};
    int[] sifre2 = {};
    int[] spesialtegn2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    brukeren.lagPassordEtter�nske(store2, sm�2, sifre2, spesialtegn2);
    System.out.println("\nTjue spesialtegn: " + brukeren.getPassordet());
    System.out.println("Passordstyrke = " + brukeren.finnPassordstyrken());

    int[] store3 = {};
    int[] sm�3 = {};
    int[] sifre3 = {};
    int[] spesialtegn3 = {};
    brukeren.lagPassordEtter�nske(store3, sm�3, sifre3, spesialtegn3);
    System.out.println("\nTomt passord: " + brukeren.getPassordet());
    System.out.println("Passordstyrke = " + brukeren.finnPassordstyrken());

    int[] store4 = {};
    int[] sm�4 = {};
    int[] sifre4 = {0};
    int[] spesialtegn4 = {};
    brukeren.lagPassordEtter�nske(store4, sm�4, sifre4, spesialtegn4);
    System.out.println("\nPassord med ett siffer: " + brukeren.getPassordet());
    System.out.println("Passordstyrke = " + brukeren.finnPassordstyrken());

    /* Til slutt tester vi utlogging: */
    brukeren.loggUt();
    System.out.println("\nHar logget ut brukeren: " + brukeren);
  }
} // Passordtest


/* Kj�ring:
Passordet MumleGsegg! har styrken 4
Passordet  har styrken 0
Passordet 1+1=2 har styrken 2
Passordet Delep0ertull. har styrken 5

Brukeren f�r innlogging: Lars med passord MumleGsegg! er ikke logget inn

Greide ikke � logge inn brukeren: Lars med passord MumleGsegg! er ikke logget i
n

Greide ikke � logge inn brukeren: Lars med passord MumleGsegg! er ikke logget i
n

Har logget inn brukeren: Lars med passord MumleGsegg! er logget inn

Tester lagPassordEtter�nske():

stor, siffer, spesialtegn, siffer, stor: L0}4S
Passordstyrke = 3

Tjue spesialtegn: @(+$)[`%;])#^}>-,%(+
Passordstyrke = 2

Tomt passord:
Passordstyrke = 0

Passord med ett siffer: 5
Passordstyrke = 1

Har logget ut brukeren: Lars med passord 5 er ikke logget inn
*/




