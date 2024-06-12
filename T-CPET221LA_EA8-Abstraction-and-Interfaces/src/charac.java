
import java.util.Scanner;
public class charac extends sub{

    public String Name(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character Name: ");
        String name = sc.nextLine();
        return name;
    }

    public String Race(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character Race(1-Human, 2-Elf, 3-Orc, 4-Angel, 5-Demon): ");
        String race = sc.nextLine();

        switch (race) {
        case "1":
            race = "Human";
            break;
        case "2":
            race = "Elf";
            break;
        case "3":
            race = "Orc";
            break;
        case "4":
            race = "Angel";
            break;
        case "5":
            race = "Demon";
            break;
            default:
                System.out.println("Non-existent Choice!");
                return "Again!";
        }
        return race;

    }

    public int[] Stats(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character Stats(Hp, Def, Atk): ");
        int[] stats = new int[3];
        for(int i = 0; i < 3; i++){
            stats[i] = sc.nextInt();
        }
        return stats;
    }
}
