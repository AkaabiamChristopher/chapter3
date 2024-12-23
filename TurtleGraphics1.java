import java.util.Scanner;

public class TurtleGraphics1 {
    public static void main(String[] args) {
        int floor[][] = new int[20][19];
        int x = 0, y = 0; 
        boolean penDown = false;    
        int direction = 0; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter commands (1-9), separated by spaces. End with 9:");

        while (true) {
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    penDown = false;
                    break;
                case 2:
                    penDown = true;
                    break;
                case 3:
                    direction = (direction + 1) % 4;
                    break;
                case 4:
                    direction = (direction + 3) % 4;
                    break;
                case 5:
                    System.out.print("Enter number of spaces to move forward: ");
                    int spaces = scanner.nextInt();
                    for (int i = 0; i < spaces; i++) {
                        switch (direction) {
                            case 0:
                                if (x + 1 < 20) x++;
                                break;
                            case 1:
                                if (y + 1 < 19) y++;
                                break;
                            case 2:
                                if (x - 1 >= 0) x--;
                                break;
                            case 3:
                                if (y - 1 >= 0) y--;
                                break;
                        }
                        if (penDown) {
                            floor[y][x] = 1;
                        }
                    }
                    break;
                case 6:
                    for (int row = 0; row < 20; row++) {
                        for (int col = 0; col < 19; col++) {
                            System.out.print(floor[row][col] == 1 ? "*" : " ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    for (int row = 0; row < 20; row++) {
                        for (int col = 0; col < 19; col++) {
                            floor[row][col] = 0;
                        }
                    }
                    x = 0;
                    y = 0;
                    penDown = false;
                    direction = 0;
                    break;
                case 9:
                              }
        }
    }
}
