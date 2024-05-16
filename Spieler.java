public class Spieler {
    int spielerLeben;
    boolean spielerCuffed;
    boolean spielerDran;
    String keineZigaretten = "Du hast keine Zigaretten";
    String zigaretten = "Du rauchst eine Zigarette und regenerierst ein Leben";
    int spielerZigaretten;
    int spielersaegen;
    int spielerLupen;
    int spielerInventar[] = new int[8];

    public void ziagrettenrauchen(){
        if (spielerZigaretten >0){
            spielerLeben = spielerLeben +1;
            System.out.println(zigaretten);
        }
    System.out.println(keineZigaretten);
    }
    public void traderHandschellenumlegen(){
        if(spielerZigaretten >0){
            int a = 1;
        }


    }


}
