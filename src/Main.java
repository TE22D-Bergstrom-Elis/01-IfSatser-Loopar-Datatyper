import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        if (6 >= 3)
        {
            System.out.println("Hello World!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username ");
        String userName = scanner.nextLine();

        System.out.println("Enter password ");
        String userPass = scanner.nextLine();

        if (Objects.equals(userName, "noname") && Objects.equals(userPass, "nopass"))
        {
            System.out.println("Welcome");
        }
        int x = 0;

        while (x < 32)
        {
            System.out.println("Hello, World!");
            x++;
        }

        boolean pass = false;
        while (!pass)
        {
            System.out.println("Enter password ");
            String password = scanner.nextLine();

            if (Objects.equals(password, "password"))
            {
                pass = true;
            }

        }


        int y = 0;
        while (y < 5)
        {
            System.out.println("Skriv in ett tal");
            int fem = scanner.nextInt();

            if (fem > 5)
            {
                System.out.println("högre än 5!");
            }
            y++;
        }

        boolean braInput = false;

            while(!braInput)
            {
                System.out.println("Skriv in ett tal ");
                String userInput = scanner.nextLine();

                try
                {
                    int nummer = Integer.parseInt(userInput);
                    braInput = true;
                    System.out.println("Bra nummer " + nummer);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Detta är inte bra nummer");
                }
            }

            Random random = new Random();
            int randomNumber = random.nextInt(100);
            boolean rattSvar = false;

            int nummer = 0;
            while (!rattSvar)
            {
                boolean braGiss = false;

                while(!braGiss)
                {
                    System.out.println("Skriv in ett tal ");
                    String userInput = scanner.nextLine();

                    try
                    {
                        nummer = Integer.parseInt(userInput);
                        braGiss = true;
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Detta är inte nummer");
                    }
                }
                System.out.println("Gissa talet (0-99)");

                if (nummer == randomNumber)
                {
                    System.out.println("Du gissade rätt");
                    rattSvar = true;
                }
                else if (nummer > randomNumber)
                {
                    System.out.println("Du gissade för högt");
                }
                else
                {
                    System.out.println("Du gissade för lågt");
                }

            }

    }
}