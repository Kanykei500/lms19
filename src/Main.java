import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String day=scanner.nextLine();

           

            switch (day){
                case "MONDAY" -> System.out.println("Дуйшомбу куну жава окуйм");
                case "TUESDAY" -> System.out.println("Шейшемби куну англис тилин окуйм");
                case "WEDNESDAY"-> System.out.println("Шаршемби куну жава скрипт окуйм");
                case "THURSDAY"-> System.out.println("Бейшемби куну орус тилин окуйм");
                case "FRIDAY"-> System.out.println("Жума куну кыргыз тилин окуйм");
                case "SATURDAY"-> System.out.println("Ишемби куну немец тилин окуйм");
                case "SUNDAY"-> System.out.println("Жекшемби куну сабакка даярданам");
                default -> System.out.println("Окуу жок");
            }

        }










    }
