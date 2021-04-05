package Game;



class Board extends Gamestart {
	
	void Createboard()
	{ 
		for (int i = 0; i < 50; ++i) System.out.println();  
		System.out.println("\n\n\tTic Tac Toe\n\n");
		System.out.println("Player 1 (X)  -  Player 2 (O)\n");
	
		System.out.println("     |     |     ");
		System.out.println("  "+square[1]+"  |  "+square[2]+"  |  "+square[3]+" " );
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  "+square[4]+"  |  "+square[5]+"  |  "+square[6]+" " );
		System.out.println("_____|_____|_____");
		System.out.println("     |     |     ");
		System.out.println("  "+square[7]+"  |  "+square[8]+"  |  "+square[9]+" " );
		System.out.println("     |     |     ");
	}
}
