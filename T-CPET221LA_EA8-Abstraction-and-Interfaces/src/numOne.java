// The following (Name, Race, Stats) are the information needed for character creation in a RPG game. The following are abstract methods to set the character details. Display the details of the character in the main program. There are two players who will create a character.
//      •	abstract string NAME() – will return the input in-game character name of the player.
//      •	abstract string RACE() – will return the input race of the character of the player. The choices are;
//          1 – Human			4 – Angel
//          2 – Elf				5 – Demon
//          3 – Orc
//      •	abstract int[] STATS() – input three initial stats of the character (HP, DEF, ATK) and return it as an array [HP,DEF,ATK].

public class numOne {
    public static void main(String[] args) {
        charac chs = new charac();
        String chname = chs.Name();
        String chrace = chs.Race();
        int[] chstats = chs.Stats();
        System.out.println("Player 1 Character Name: " + chname);
        System.out.println("Player 1 Race Choice: " + chrace);
        System.out.println("Player 1 Hp: " + chstats[0] + " Def: " + chstats[1] + " Atk: " + chstats[2]);

        System.out.println();

        charac chs2 = new charac();
        String chname2 = chs2.Name();
        String chrace2 = chs.Race();
        int[] chstats2 = chs2.Stats();
        System.out.println("Player 2 Character Name: " + chname2);
        System.out.println(("Player 2 Race Choice: " + chrace2));
        System.out.println("Player 2 Hp: " + chstats2[0] + " Def: " + chstats2[1] + " Atk: " + chstats2[2]);

    }
}