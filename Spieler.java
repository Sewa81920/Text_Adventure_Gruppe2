public class Spieler {
    int spielerLeben;
    boolean spielerCuffed;
    String Cuffs = "Du legst dem Dealer Handschellen um du bist 2 mal dran.";
    int spielerCuffes;

    boolean spielerDran;
    String keinItem = "Du hast das Item nicht";
    String zigaretten = "Du rauchst eine Zigarette und regenerierst ein Leben";
    int spielerZigaretten;
    String saegen = "Du sägst den Lauf der Flinte ab.Jetzt macht sie 2 Damage";
    int spielersaegen;
    String luppen= "Du guckst in die Flinte die nächste Patrone ist: ";
    int spielerLupen;
    int spielerInventar[] = new int[8];

    public void ziagrettenrauchen(){
        if (spielerZigaretten >0){
            spielerLeben = spielerLeben +1;
            System.out.println(zigaretten);
        }
    System.out.println(keinItem);
    }
    public void traderHandschellenumlegen(){
        if(spielerCuffes >0){
            System.out.println(Cuffs);
        }
    System.out.println(keinItem);

    }
    public void lupenutzen() {
        if (spielerLupen > 0) {
            System.out.println(luppen);
            //Array munition nächste munition
        }
        System.out.println(keinItem);
    }
    public void laufAbsaegen(){
        if(spielersaegen>0){
            System.out.println(saegen);
        }
    System.out.println(keinItem);
    }


}
