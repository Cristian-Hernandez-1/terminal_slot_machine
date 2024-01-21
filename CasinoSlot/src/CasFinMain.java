import java.util.*;


public class CasFinMain {




        public static void main(String[] args) {


                String[] username = { "Zack", "Jerry", "haRRY", "Berry", "juicy" };
                String[] password = { "zbeez", "bueno", "abc123", "cde123", "jkt" };
                Scanner scan = new Scanner(System.in);
                Random r = new Random();
                String userNIn = " ";
                String userPIn = " ";
                System.out.println("Enter username: ");
                userNIn = scan.nextLine();
                System.out.println("Enter password: ");
                userPIn = scan.nextLine();


                int userID = -1;
                int userPoints = -1;
                int loop = 1;
                int spinAmount = 0;
                int spinSum = 0;


                String playAgain = " ";
                String spinChoice = " ";


                for (int i = 0; i < username.length; i++) {
                        if (username[i].equals(userNIn)) {
                                if (!password[i].equals(userPIn)) {
                                        System.out.print("Password Incorrect ");
                                }
                                if (password[i].equals(userPIn)) {
                                        System.out.println();
                                        System.out.println("Welcome " + userNIn + ":");
                                        userID = i;
                                        userPoints = i;


                                        CasfinClass member = new CasfinClass(0, userID);


                                        while (loop == 1) {

                                                Random r1 = new Random();


                                                int num1 = r1.nextInt(8);
                                                int num2 = r1.nextInt(8);
                                                int num3 = r1.nextInt(8);
                                                int num4 = r1.nextInt(8);
                                                int num5 = r1.nextInt(8);
                                                int num6 = r1.nextInt(8);
                                                int num7 = r1.nextInt(8);
                                                int num8 = r1.nextInt(8);
                                                int num9 = r1.nextInt(8);


                                                System.out.println();
                                                System.out.println();


                                                System.out.println(" ---------");
                                                System.out.println("| " + "Lucky 7" + " |");


                                                System.out.print(" ---------");
                                                System.out.println();
                                                System.out.print("|  " + num1 + " " + num2 + " " + num3 + "  |");
                                                System.out.println("   o");
                                                System.out.print("|  " + num4 + " " + num5 + " " + num6 + "  |");
                                                System.out.println("  /");
                                                System.out.print("|  " + num7 + " " + num8 + " " + num9 + "  |");
                                                System.out.println("_/");
                                                System.out.println(" ---------");


                                                if (num1 == num2 && num2 == num3 || num4 == num5 && num5 == num6
                                                                || num7 == num8 && num8 == num9) {
                                                        System.out.println("Lucky match!!");
                                                        System.out.println("Line Pays: 250 Credits");
                                                        member.addingPoints(250, userID);
                                                }



                                                if (num1 == num5 && num5 == num9 || num3 == num5 && num5 == num7) {
                                                        System.out.println("Lucky match!!");
                                                        System.out.println("Line Pays: 250 Credits");
                                                        member.addingPoints(250, userID);


                                                }



                                                if (num1 == num5 && num5 == num9 && num3 == num5 && num5 == num7) {
                                                        System.out.println("Minor Jackpot!!");
                                                        System.out.println("Line Pays: 500 Credits");
                                                        member.addingPoints(500, userID);
                                                }


                                          
                                                if (num1 == num2 && num2 == num3 && num4 == num5 && num5 == num6
                                                                || num4 == num5 && num5 == num6 && num6 == num7 && num7 == num8 && num8 == num9) {
                                                        System.out.println("Minor Jackpot!!");
                                                        System.out.println("Line Pays: 500 Credits");
                                                        member.addingPoints(500, userID);
                                                }


                                               
                                                if (num1 == num2 && num2 == num3 && num4 == num5 && num5 == num6 && num7 == num8
                                                                && num8 == num9) {


                                                        System.out.println("Jackpot!!");
                                                        System.out.println("Jackpot!!");
                                                        System.out.println("Jackpot!!");
                                                        System.out.println("Line Pays: 1000000 Credits");
                                                        member.addingPoints(1000000, userID);
                                                }
                                                System.out.print("Press enter to PLAY AGAIN | To STOP enter / ");
                                                playAgain = scan.nextLine();


                                                if ("/".equals(playAgain)) {


                                                        System.out.println("Would you like to spin the wheel of fortune");
                                                        System.out.println("Enter yes or no");
                                                        spinChoice = scan.nextLine().toLowerCase();


                                                        if ("yes".equals(spinChoice)) {
                                                                System.out.println("for every 1000 credits you earn one spin " + "you have: "
                                                                                + member.displayPoint(userID));
                                                                System.out.println("= " + member.displayspinAmount(userID));


                                                                spinAmount = member.displayspinAmount(userID);


                                                                System.out.println(
                                                                                "if you would like to use all your spins enter yes otherwise for one spin enter no");
                                                                spinChoice = scan.nextLine().toLowerCase();


                                                                if ("yes".equals(spinChoice)) {
                                                                        for (int g = 0; g < spinAmount; g++) {
                                                                                int randspin = r1.nextInt(5);
                                                                                member.updateSpins(userID, -g);
                                                                                member.deductingPoints((g * 100), userID);


                                                                                System.out.println("Win possibilities:");
                                                                                System.out.println("0 = 0");
                                                                                System.out.println("1 = 500");
                                                                                System.out.println("2 = 0");
                                                                                System.out.println("3 = 750");
                                                                                System.out.println("4 = 250");
                                                                                System.out.println("Spin Results");
                                                                                System.out.println("---");
                                                                                System.out.println("|" + randspin + "|");
                                                                                System.out.println("---");


                                                                                if (randspin == 0) {
                                                                                        System.out.println("you won 0 credits");


                                                                                }
                                                                                if (randspin == 1) {
                                                                                        System.out.println("you won 500 credits");


                                                                                        spinSum += 500;
                                                                                }
                                                                                if (randspin == 2) {
                                                                                        System.out.println("you won 0 credits");


                                                                                }
                                                                                if (randspin == 3) {
                                                                                        System.out.println("you won 750 credits");


                                                                                        spinSum += 750;
                                                                                }
                                                                                if (randspin == 4) {
                                                                                        System.out.println("you won 250 credits");


                                                                                        spinSum += 250;
                                                                                }
                                                                        }
                                                                        System.out.println("Total won: " + spinSum);
                                                                        member.addingPoints(spinSum, userID);


                                                                }
                                                                if ("no".equals(spinChoice)) {
                                                                        int randspin = r1.nextInt(5);


                                                                        member.updateSpins(userID, -1);
                                                                        member.deductingPoints(1000, userID);
                                                                        System.out.println("Win possibilities:");
                                                                        System.out.println("0 = 0");
                                                                        System.out.println("1 = 500");
                                                                        System.out.println("2 = 0");
                                                                        System.out.println("3 = 750");
                                                                        System.out.println("4 = 250");
                                                                        System.out.println("Spin Results");
                                                                        System.out.println("---");
                                                                        System.out.println("|" + randspin + "|");
                                                                        System.out.println("---");


                                                                        if (randspin == 0) {
                                                                                System.out.println("you won 0 credits");


                                                                        }
                                                                        if (randspin == 1) {
                                                                                System.out.println("you won 500 credits");
                                                                                member.addingPoints(500, userID);
                                                                        }
                                                                        if (randspin == 2) {
                                                                                System.out.println("you won 0 credits");


                                                                        }
                                                                        if (randspin == 3) {
                                                                                System.out.println("you won 750 credits");
                                                                                member.addingPoints(750, userID);
                                                                        }
                                                                        if (randspin == 4) {
                                                                                System.out.println("you won 250 credits");
                                                                                member.addingPoints(250, userID);
                                                                        }
                                                                        System.out.println("Spins remaining: " + member.displayspinAmount(userID));
                                                                }


                                                        }
                                                        loop = 0;
                                                }


                                        }
                                }
                        }
                }
                System.out.println("Goodbye");
        }


}