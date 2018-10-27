package org.pursuit;

import java.util.Scanner;

public class TheLastShotGame implements Game {
    Scanner scanner = new Scanner(System.in);

    String controls = "";
    int time = 13;

    @Override
    public void startGame() {
        logo();
        System.out.println();
        instructions();
        System.out.println();
        stats();
        System.out.println();
        scenarios();
        System.out.println();

    }

    private void logo() {
        System.out.println("                        \n" +
                "                         .ze$**\"\"\"\"**$be.                    \n" +
                "                    .eP\"\"                 \"*b.     \"\"\"\"                     \n" +
                "                 zP\"    .zed$$$$$$$$$$$ee.    \"*e.                          \n" +
                "              .$\"  .e$$$$$**\"\"\"    \"\"\"**$$$$$e.   *e                        \n" +
                "            .P  z$$$P\"\"                     \"*$$$c  \"e                      \n" +
                "           d\" e$$P\"                             *$$c  *.                    \n" +
                "          $ .$$P                                  *$$  \"r                   \n" +
                "         d  $$%                                    ^$$  3                   \n" +
                "         F 4$F                                      3$F  L                  \n" +
                "        $  4$                                        $F  $                  \n" +
                "        $  4$           $$$$$$$$$$$$$$$$$$           $F  $                  \n" +
                "        $  4$           $$              $$           $F  $                  \n" +
                "        $  4$           4$              $$           $F  $                  \n" +
                "        $  4$           $$              $$           $F  $                  \n" +
                "        $  4$           $$              $$           $F  $                  \n" +
                "        $  4$           $$              $$           $F  $                  \n" +
                "        $  4$           $$              $$           $F  $                  \n" +
                "        $  4$          e$$$$$$$$$$$$$$$$$$b          $F  $                  \n" +
                "        $  4$F         *$**$***$**$***$P*$*         4$F  $                  \n" +
                "        $   $$          *. $   $  $   $  $          $$   $                  \n" +
                "         L  '$b         'b $F  $  $   $  P         d$F   F                  \n" +
                "         3.  \"$$         $$$$$$$$$$$$$$$$F        $$P   J                   \n" +
                "          3.  ^$$e       $ 4$  4F $  4F $       z$$\"   z                    \n" +
                "           ^c   \"$$e     *F $  'F $  $\" $     z$$P    @                     \n" +
                "             *.   \"$$$.  'be$eedbd$ee$ee$  .d$$*    z\"                      \n" +
                "               *.    *$$b.$ $F  $4F  $ 4Le$$P\"    z\"                        \n" +
                "                 \"c    ^*$$ 4b  $$F 4P $$$\"    .@\"                          \n" +
                "                   ^*.    $L.$..$$..JL.$    .e\"                             \n" +
                "                      \"%. 4$\"$\"\"$$\"\"$\"3$ .e\"               " +
                "                 \n" +
                "                         \"*$ $  $$  $ J$\"                                   \n" +
                "                           $ 4L $$  F $                                     \n" +
                "                           4$$$$$$$$$$$                                     \n" +
                "                            b $ 4$ $  F                                     \n" +
                "                            $ 3 4$ $ J\"                                     \n" +
                "                            $.JL.$.$.$ " +
                "                            THE LAST SHOT");
    }

    private void instructions() {
        slowPrint(" Instructions:\n The name of the game is The Last Shot. The rules are simple. There are 14 seconds\n" +
                "left on the shot clock, there are no more timeouts. Your team is down 93-92 and The Heat have the ball.\n" +
                "Make the right plays to will your team to a victory. Be careful, some of your\n " +
                "players might not make the shot causing you to lose. The stats provided represent each players stats of the current game.\n " +
                "As you can see some players are having an efficient game, while others are having " +
                "a bad game. Make the right decision.\n WARNING : IF YOU DO NOT ENTER THE ACTIONS THAT ARE IN CAPS CAN CAUSE YOU TO LOSE THE GAME\n GOOD LUCK!\n", 9);
    }

    private void stats() {
        System.out.println("Lebron James: 32 PTS; 12/15 FG; 10 REB; 9 AST ");
        System.out.println("Dwayne Wade: 21 PTS; 8/17 FG; 6 REB; 4 AST");
        System.out.println("Mario Chalmers: 5 PTS; 1-3 3PT FG; 2 REB; 2 AST");
        System.out.println("Birdman: 5 PTS; 13 REB; 2 BLKS");
        System.out.println("Ray Allen 18 PTS; 4-5 3PT; 2 AST\n");
        enterToStart();


    }
    private void enterToStart(){
        slowPrint("Press Enter To Start", 5);
        controls= scanner.nextLine();
    }
    private void input() {
        slowPrint("\nWhat should you do?",8);
        controls = scanner.nextLine();

    }
    private void gameOverMaybe2() {
        String controls;
        do {
            System.out.println("Play Again? [Y/n]: ");
            controls = scanner.nextLine();
            if (controls.equals("Y") || controls.equals("y")) {
                startGame();
            } else if (controls.equals("n") || controls.equals("N")) {
                System.out.println("  ____    U  ___ u   U  ___ u  ____          ____   __   __U _____ u      _____    _   _      _      _   _       _  __   ____          _____   U  ___ u   ____          ____      _         _      __   __             _   _     ____   \n" +
                        "U /\"___|u   \\/\"_ \\/    \\/\"_ \\/ |  _\"\\      U | __\")u \\ \\ / /\\| ___\"|/     |_ \" _|  |'| |'| U  /\"\\  u | \\ |\"|     |\"|/ /  / __\"| u      |\" ___|   \\/\"_ \\/U |  _\"\\ u     U|  _\"\\ u  |\"|    U  /\"\\  u  \\ \\ / /    ___     | \\ |\"| U /\"___|u \n" +
                        "\\| |  _ /   | | | |    | | | |/| | | |      \\|  _ \\/  \\ V /  |  _|\"         | |   /| |_| |\\ \\/ _ \\/ <|  \\| |>    | ' /  <\\___ \\/      U| |_  u   | | | | \\| |_) |/     \\| |_) |/U | | u   \\/ _ \\/    \\ V /    |_\"_|   <|  \\| |>\\| |  _ / \n" +
                        " | |_| |.-,_| |_| |.-,_| |_| |U| |_| |\\      | |_) | U_|\"|_u | |___        /| |\\  U|  _  |u / ___ \\ U| |\\  |u  U/| . \\\\u u___) |      \\|  _|/.-,_| |_| |  |  _ <        |  __/   \\| |/__  / ___ \\   U_|\"|_u    | |    U| |\\  |u | |_| |  \n" +
                        "  \\____| \\_)-\\___/  \\_)-\\___/  |____/ u      |____/    |_|   |_____|      u |_|U   |_| |_| /_/   \\_\\ |_| \\_|     |_|\\_\\  |____/>>      |_|    \\_)-\\___/   |_| \\_\\       |_|       |_____|/_/   \\_\\    |_|    U/| |\\u   |_| \\_|   \\____|  \n" +
                        "  _)(|_       \\\\         \\\\     |||_        _|| \\\\_.-,//|(_  <<   >>      _// \\\\_  //   \\\\  \\\\    >> ||   \\\\,-.,-,>> \\\\,-.)(  (__)     )(\\\\,-      \\\\     //   \\\\_      ||>>_     //  \\\\  \\\\    >>.-,//|(_.-,_|___|_,-.||   \\\\,-._)(|_   \n" +
                        " (__)__)     (__)       (__)   (__)_)      (__) (__)\\_) (__)(__) (__)    (__) (__)(_\") (\"_)(__)  (__)(_\")  (_/  \\.)   (_/(__)         (__)(_/     (__)   (__)  (__)    (__)__)   (_\")(\"_)(__)  (__)\\_) (__)\\_)-' '-(_/ (_\")  (_/(__)__)  ");
                break;
            } else {
                System.out.println("Sorry, does not compute...");
            }
        } while (!controls.equals("n") || !controls.equals("N") || !controls.equals("Y") || !controls.equals("y"));
    }


    private void scenarios() {
        slowPrint("\nDwayne Wade inbounds the ball to Lebron, Birdman managed to make it to the basket while\n" +
                "Dwayne Wade and Ray Allen make it to the left and right sides of the court. Chalmers calls for the\n" +
                "ball at mid-court, Should you PASS him the ball or SHOOT the ball?\n", 8);
        do {
            input();
            int newTime = time; // making a new variable for the new time

            if (controls.equals("pass")|| controls.equals("PASS")) { // if the user chooses to pass the ball
                scenario1(); // this method is called when they decide to pass the ball
                time = newTime - 2; // time is reduced by 8 because he decided to pass
                System.out.println("\nRemaining time on the shot clock: " + time + " seconds left");
                input();
                if (controls.equals("kick")|| controls.equals("KICK")) {
                    scenario1_2();
                    time = newTime - 4;
                    System.out.println("\nRemaining time on the shot clock: " + time + " seconds left");
                    input();
                    if (controls.equals("pass")|| controls.equals("PASS")){
                        scenario1_3();
                        time = newTime - 9;
                        System.out.println("\nRemaining time on the shot clock: " + time + " seconds left");
                        input();
                    } else if (controls.equals("shoot")|| controls.equals("SHOOT")){
                        gameWinningShot();
                    }else {
                        travel();
                        gameOverMaybe2();
                    }

                }else if (controls.equals("pass")|| controls.equals("PASS")){
                    scenario3();
                    time = newTime - 8;
                    System.out.println("\nRemaining time on the shot clock: " + time + " seconds left");
                    input();
                    if (controls.equals("pass")|| controls.equals("PASS")){
                        marioChalmersMiss();
                        System.out.println();
                        gameOverMaybe2();
                    }else if (controls.equals("shoot")|| controls.equals("SHOOT")){
                        scenario3_1();
                    }
                }else {
                    travel();
                    gameOverMaybe2();
                }
            } else if (controls.equals("shoot") || controls.equals("SHOOT")) {
                scenario2_1();
                time = newTime - 10;
                System.out.println("Remaining time on the shot clock: " + time + " seconds left");
                input();
                if (controls.equals("shoot")|| controls.equals("SHOOT")){
                    System.out.println("LE'BRON IS FOULED AND PUT ON THE LINE!!\n");
                    lebronFreeThrows();
                    time = newTime - 11;
                    System.out.println("Remaining time on the shot clock: " + time + " seconds left\n");
                    System.out.println("           ____|\n" +
                            "        o  \\%/ |~~\\\n" +
                            "  o//              |\n" +
                            "  8                |\n" +
                            " / >               |\n" +
                            "~ ~             ~~~~~~\nWarriors call timeout and take the ball out at half-court. Steph takes the shot at half court.....AND MAKES THE SHOT!!!!!" +
                            "ANDDD THE CROWD GOES WILDDDDDD\n");
                    gameOverMaybe2();
                }else if (controls.equals("pass") || controls.equals("PASS")){
                    scenario2_2();
                    gameOverMaybe2();
                }
            } else {
                newTime = time - 14;
                System.out.println("\nLe'bron trips on his shoe lace and breaks his ankle, forcing the team to not care\n" +
                        "about what happens in the game now because their star player has been injured. \n");
                System.out.println("\nRemaining time on the shot clock: " + newTime + " seconds left");
                gameOverMaybe2();
                if (controls.equals("Y") || controls.equals("y")) {
                    startGame();
                } else if (controls.equals("N")|| controls.equals("n")) {
                    System.out.println("Thank You For Playing!");
                }
            }
        } while ("".equals(controls));
    }


    private void scenario1() {
        slowPrint("\nMario Chalmers notices that the Warriors are double teaming Le'Bron as soon as he receives the ball to force the ball in the hands of another " +
                "player on the team\nbesides Le'Bron, which leaves Mario slightly open to be able to get to the basket. He turns to take the ball to the basket." +
                "In doing so the center on the\n Warriors comes over to defend Mario from getting to the basket. Mario notices Birdman open as the center comes over to guard him." +
                "Should you PASS the ball to\n" +
                " Birdman or KICK the ball out to Ray Allen?  \n", 8);

    }

    private void scenario1_2() {
        slowPrint("\nRay Allen shoots the open shot and Birdman comes down with the rebound after the missed shot. With the opposing team still in the paint Birdman decides to pass the\n" +
                "ball back out to Dwayne Wade who is wide open at the three point line. Dwayne Wade looks at Le'bron who is at the top of the 3 point line with his man still in the paint\n"+
                " while two defenders come out to defend Dwayne as they see him open. Should Wade PASS the ball to Le'bron or SHOOT the ball?\n",8);
    }
    private void scenario1_3(){
        slowPrint("\nLe'Bron catches the ball, does a quick in and out move to cross the incoming defender who comes to defend the shot, and drives to the basket. Dwayne Wade cuts\n" +
                " to the basket as Le'Bron drives, should Le'Bron PASS the ball or should he SHOOT? \n",8);

    }
    private void scenario2_1(){
        slowPrint("\nUnfortunately, the shot is a long rebound for Stephen Curry who takes a little time off the clock before the Heat immediately foul Stephen Curry to put him\n" +
                " at the free throw line. The score is now 95-92. Heat call timeout to inbound the ball at half-court. Birdman inbounds the ball to Le'bron who is immediately double teamed\n" +
                " by Ray Allen's defender. Should he PASS to Ray Allen or SHOOT the ball? \n",8);
    }
    private void scenario2_2(){
        slowPrint("Ray Allen catches the ball and is forced to put up a bad shot due to the shot clock. at the shot clock and shoots an air-ball.\n",8);
    }

    private void scenario3_1() {
        int gameWinner = (int) Math.ceil(Math.random() * 10);
        if ((gameWinner % 2) == 0){
            System.out.println("LEBRON JAMES MAKES THE SHOT!!!!!!!!HE MAKES THE SHOT!!!!!!!!!!! THE GAME IS OVER!!!!!!!!!!!!!!!!!!!!!!!!" +
                    "                              _____\n" +
                    " ____________________        /       \\\n" +
                    "|____________________|      |         |\n" +
                    " \\/\\/\\/\\/\\/\\/\\/\\/\\/\\/        >     >  |\n" +
                    "  \\/\\/\\/\\/\\/\\/\\/\\/\\/        <         |\n" +
                    "   \\/\\/\\/\\/\\/\\/\\/\\/          _\\      |\n" +
                    "    \\/\\/\\/\\/\\/\\/\\/          <_/__    |\n" +
                    "     |/\\/\\/\\/\\/\\|             ___=   |___\n" +
                    "     |\\/\\/\\/\\/\\/|          _=| | |   | | |=_\n" +
                    "     |/\\/\\/\\/\\/\\|         /  |  |     |  |   =\n" +
                    "                         |   |   \\___/    |    |\n" +
                    "                         |   |            |    |\n" +
                    "                         |    |            |   |\n" +
                    "                         |    |            |   |\n" +
                    "                         |     |           |   |\n" +
                    "                          |    |          |   |\n" +
                    "                          |     |        |   |\n" +
                    "                            |   |______ |   |\n" +
                    "                             ||  |_____|   |\n" +
                    "                            |   | |/ \\|  |\\_\n" +
                    "                            |  | __/  \\_  \\  \\_\n" +
                    "                           |  | /        \\  |   \\_\n" +
                    "                          |   | \\         | |     \\_\n" +
                    "                         |     \\_|       |_/        \\_\n" +
                    "                        |         \\_____/  \\_         |\n" +
                    "                        |         |           \\______/\\_\n" +
                    "                         \\_______/                \\_    \\_\n" +
                    "                        |     |                      \\_    \\_\n" +
                    "                       |     |                          \\    \\\n" +
                    "                       |    |                             \\    \\\n" +
                    "                       |   |                                 \\   \\\n" +
                    "                        |  |                                    \\  \\\n" +
                    "                       |   |                                      \\/ ==\n" +
                    "                       |   |                                       |    \\\n" +
                    "                        |   |                                       \\     =\n" +
                    "                         |  |                                        |____/\n" +
                    "                          |_|\n" +
                    "                         /   \\\n" +
                    "                         |    |\n" +
                    "                        /    |\n" +
                    "                       |    |\n" +
                    "                        \\__/\n");
            gameOverMaybe2();
        }else {
            slowPrint("\nLebron James misses the shot and the ball is rebounded by Klay Thompson and the Warriors win the game!\n",8);
            System.out.println("  __   __   U  ___ u   _   _        _       U  ___ u  ____   U _____ u \n" +
                    "  \\ \\ / /    \\/\"_ \\/U |\"|u| |      |\"|       \\/\"_ \\/ / __\"| u\\| ___\"|/ \n" +
                    "   \\ V /     | | | | \\| |\\| |    U | | u     | | | |<\\___ \\/  |  _|\"   \n" +
                    "  U_|\"|_u.-,_| |_| |  | |_| |     \\| |/__.-,_| |_| | u___) |  | |___   \n" +
                    "    |_|   \\_)-\\___/  <<\\___/       |_____|\\_)-\\___/  |____/>> |_____|  \n" +
                    ".-,//|(_       \\\\   (__) )(        //  \\\\      \\\\     )(  (__)<<   >>  \n" +
                    " \\_) (__)     (__)      (__)      (_\")(\"_)    (__)   (__)    (__) (__) ");
            gameOverMaybe2();
        }
    }

    private void gameWinningShot(){
        System.out.println(" \nBANG! THE BALL GOES IN FOR THE GAME WINNING SHOT, AND THE CROWD GOESSS WILDDDDDDDDDDDDDDD\n" +
                "           o\n" +
                "   /|   o         o\n" +
                "   \\|=--            o\n" +
                "      ##\n" +
                "                      \\\\\n" +
                "                   /   \\O\n" +
                "                  O_/   T\n" +
                "                  T    /|\n" +
                "                  |\\  | |\n" +
                "   _______________|_|________ ");
        gameOverMaybe2();
    }
    private void scenario3(){
        slowPrint("\nMario Chalmers jumps up as if he is going for the layup but instead passes it off to Birdman who comes up under the rim. As Birdman jumps for the slam, Kevin Durant\n" +
                "comes up from behind Birdman and smacks the ball out to Lebron James who stayed at the top of the paint. \n" +
                "          o- - -  \\o          __|\n" +
                "             o/   /|          vv`\\\n" +
                "            /|     |              |\n" +
                "             |    / \\_            |\n" +
                "            / \\   |               |\n" +
                "           /  |                   |\n  " +
                "\nHe notices that Mario Chalmers managed to get to the corner\n" +
                "after he passed it off to Birdman, should Le'bron SHOOT the ball or PASS the ball to Mario?\n", 8);
    }
    private void marioChalmersMiss(){
        slowPrint("\nLebron passes the ball off to Mario who shoots a wide open shot in the corner. The ball banks off the rim and is rebounded by Steph Curry who runs the clock out.\n",8);
    }
    private void lebronFreeThrows(){
        int freeThrow = 1;
        String make = null;
        switch (freeThrow){
            case 1: make = "He Makes Both!!";
                break;
            case 2: make = "Missed";
                break;
        }
        System.out.println(make);
    }
    private void travel(){
        slowPrint("\nThe referee calls a travel forcing the ball into the Warriors possession. Curry is fouled and put at the line and hits all his free throws.\n" +
                " There is not enough time to bring the ball up the court and a half court shot is heaved......AND IS NO GOOD!!!\n " ,8);
        System.out.println("\"  ____    U  ___ u   U  ___ u  ____          ____   __   __U _____ u      _____    _   _      _      _   _       _  __   ____          _____   U  ___ u   ____          ____      _         _      __   __             _   _     ____   \\n\" +\n" +
                "                        \"U /\\\"___|u   \\\\/\\\"_ \\\\/    \\\\/\\\"_ \\\\/ |  _\\\"\\\\      U | __\\\")u \\\\ \\\\ / /\\\\| ___\\\"|/     |_ \\\" _|  |'| |'| U  /\\\"\\\\  u | \\\\ |\\\"|     |\\\"|/ /  / __\\\"| u      |\\\" ___|   \\\\/\\\"_ \\\\/U |  _\\\"\\\\ u     U|  _\\\"\\\\ u  |\\\"|    U  /\\\"\\\\  u  \\\\ \\\\ / /    ___     | \\\\ |\\\"| U /\\\"___|u \\n\" +\n" +
                "                        \"\\\\| |  _ /   | | | |    | | | |/| | | |      \\\\|  _ \\\\/  \\\\ V /  |  _|\\\"         | |   /| |_| |\\\\ \\\\/ _ \\\\/ <|  \\\\| |>    | ' /  <\\\\___ \\\\/      U| |_  u   | | | | \\\\| |_) |/     \\\\| |_) |/U | | u   \\\\/ _ \\\\/    \\\\ V /    |_\\\"_|   <|  \\\\| |>\\\\| |  _ / \\n\" +\n" +
                "                        \" | |_| |.-,_| |_| |.-,_| |_| |U| |_| |\\\\      | |_) | U_|\\\"|_u | |___        /| |\\\\  U|  _  |u / ___ \\\\ U| |\\\\  |u  U/| . \\\\\\\\u u___) |      \\\\|  _|/.-,_| |_| |  |  _ <        |  __/   \\\\| |/__  / ___ \\\\   U_|\\\"|_u    | |    U| |\\\\  |u | |_| |  \\n\" +\n" +
                "                        \"  \\\\____| \\\\_)-\\\\___/  \\\\_)-\\\\___/  |____/ u      |____/    |_|   |_____|      u |_|U   |_| |_| /_/   \\\\_\\\\ |_| \\\\_|     |_|\\\\_\\\\  |____/>>      |_|    \\\\_)-\\\\___/   |_| \\\\_\\\\       |_|       |_____|/_/   \\\\_\\\\    |_|    U/| |\\\\u   |_| \\\\_|   \\\\____|  \\n\" +\n" +
                "                        \"  _)(|_       \\\\\\\\         \\\\\\\\     |||_        _|| \\\\\\\\_.-,//|(_  <<   >>      _// \\\\\\\\_  //   \\\\\\\\  \\\\\\\\    >> ||   \\\\\\\\,-.,-,>> \\\\\\\\,-.)(  (__)     )(\\\\\\\\,-      \\\\\\\\     //   \\\\\\\\_      ||>>_     //  \\\\\\\\  \\\\\\\\    >>.-,//|(_.-,_|___|_,-.||   \\\\\\\\,-._)(|_   \\n\" +\n" +
                "                        \" (__)__)     (__)       (__)   (__)_)      (__) (__)\\\\_) (__)(__) (__)    (__) (__)(_\\\") (\\\"_)(__)  (__)(_\\\")  (_/  \\\\.)   (_/(__)         (__)(_/     (__)   (__)  (__)    (__)__)   (_\\\")(\\\"_)(__)  (__)\\\\_) (__)\\\\_)-' '-(_/ (_\\\")  (_/(__)__)  \"");
        gameOverMaybe2();
    }
    public void slowPrint(String message, long millisPerChar) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            try
            {
                Thread.sleep(millisPerChar);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
