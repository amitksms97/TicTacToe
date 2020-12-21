import java.util.*;
public class Tic_Tac_Toe {

	static Scanner sc= new Scanner(System.in);
	String board[];
	public Tic_Tac_Toe()
	{
		System.out.println("Welcome to Tic Tac Toe Game");
		board= new String[9];
	}
	public void initialize()
	{
		for (int i=0;i<9;i++)
		{
			board[i]=String.valueOf(i+1);
		}
	}
	public void print()
	{
		for(int i=0; i<9; i++)
		{
			if((i+1)%3==0) {
				System.out.print(board[i]);
				System.out.println();}
			else
				System.out.print(board[i]);
		}
	}
	public void X_update()
	{
		System.out.println("Enter the place you want to place X");
		print();
		int n=sc.nextInt();
		board[n-1]="X";
	}
	public void O_update()
	{
		System.out.println("Enter the place you want to place O");
		print();
		int n=sc.nextInt();
		board[n-1]="O";
	}
	public String check()
	{
		for (int i = 0; i < 8; i++) { 
            String line = ""; 
  
            switch (i) { 
            case 0: 
                line = board[0] + board[1] + board[2]; 
                break; 
            case 1: 
                line = board[3] + board[4] + board[5]; 
                break; 
            case 2: 
                line = board[6] + board[7] + board[8]; 
                break; 
            case 3: 
                line = board[0] + board[3] + board[6]; 
                break; 
            case 4: 
                line = board[1] + board[4] + board[7]; 
                break; 
            case 5: 
                line = board[2] + board[5] + board[8]; 
                break; 
            case 6: 
                line = board[0] + board[4] + board[8]; 
                break; 
            case 7: 
                line = board[2] + board[4] + board[6]; 
                break; 
            } 
            if (line.equals("XXX")) { 
                return "X"; 
            } 
            else if (line.equals("OOO")) { 
                return "O"; 
            }
		}
		return null;
	}
	public static void main(String[] args) {
		Tic_Tac_Toe obj=new Tic_Tac_Toe();
		obj.initialize();
		//int counter=0;
		//System.out.println("Which player should start first X or O");
		//String str=sc.next();
		while ((obj.check() != "X")&&(obj.check() != "O"))
		{
			/*counter++;
			System.out.println(counter);
			if(counter==9) {
				break;
				}*/
			obj.X_update();
			obj.O_update();
			/*if(str.equalsIgnoreCase("X"))
				obj.X_update();
			else if(str.equalsIgnoreCase("O"))
				obj.O_update();
			else
				System.out.println("Invalid Input");*/
		}
		if(obj.check()== "X")
			System.out.println("X wins");
		else if(obj.check()=="O")
			System.out.println("O wins");
		else
			System.out.println("Draw");
	}

}
