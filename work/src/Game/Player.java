package Game;
import java.io.IOException;
import java.util.Scanner;

class Player extends Board{
	int player = 0;
	int i;
	int choice;
	char mark,ch;
	

	void playermoves() {    
			do{
				Createboard();
				Scanner in = new Scanner(System.in);
				player = (player % 2 == 0) ? 1 : 2;
				System.out.print("Player "+player+", enter a number:  " );
				int choice = in.nextInt();
				mark = (player == 1) ? 'X' : 'O';
			
				if (choice == 1 && square[1] == '1')
				 square[1] = mark;
				else if (choice == 2 && square[2] == '2')
				 square[2] = mark;
				else if (choice == 3 && square[3] == '3')
				 square[3] = mark;
				else if (choice == 4 && square[4] == '4')
				 square[4] = mark;
				else if (choice == 5 && square[5] == '5')
				 square[5] = mark;
				else if (choice == 6 && square[6] == '6')
				 square[6] = mark;
				else if (choice == 7 && square[7] == '7')
				 square[7] = mark;
				else if (choice == 8 && square[8] == '8')
				 square[8] = mark;
				else if (choice == 9 && square[9] == '9')
				 square[9] = mark;
				else
				 {
				 System.out.println("Invalid move press any key to continue");
				 player--;
				 try {
					char ch = (char) System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				};
				 }
				i = checkwin();
			}while (i ==  - 1);
			
		Createboard();
		if (i == 1)
			System.out.println("\n==>Player "+player+" win");
		else
			System.out.println("\n==>Game draw");
		
		System.out.println("Press any key to Terminate");
		try {
			char ch = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
			}
	}
}


