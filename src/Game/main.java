package Game;

import java.util.Scanner;

public class main {
	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerWon = false;
	public static boolean playing = true;
	
	
    public static tictactoe board = new tictactoe ();
    
    public static void main (String [] args){

  if  (board.isVisible() ==false){
	  board.setVisible(true);
  }  	
    	}
    public static void checkforwin(){
    	// check to see if user  x got combination
    	
    	
    	if (board.button1.getText().equals("X")){
    		if (board.button4.getText().equals("X")){
    			if (board.button7.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	// check to see if user  x got combination
    	if (board.button1.getText().equals("X")){
    		if (board.button5.getText().equals("X")){
    			if (board.button9.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	// check to see if user x got combination
    	if (board.button1.getText().equals("X")){
    		if (board.button2.getText().equals("X")){
    			if (board.button3.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	// check to see if user x got combination 
    	
    	if (board.button3.getText().equals("X")){
    		if (board.button5.getText().equals("X")){
    			if (board.button7.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	// check to see if user x got combination 
    	if (board.button3.getText().equals("X")){
    		if (board.button6.getText().equals("X")){
    			if (board.button9.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	// check to see if user x got combination 
    	if (board.button7.getText().equals("X")){
    		if (board.button8.getText().equals("X")){
    			if (board.button9.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	
    	// check to see if user x got combination 
    	if (board.button4.getText().equals("X")){
    		if (board.button5.getText().equals("X")){
    			if (board.button6.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	// check to see if user x  got combination 
    	
    	
    	if (board.button2.getText().equals("X")){
    		if (board.button5.getText().equals("X")){
    			if (board.button8.getText().equals("X")){
    				playerWon = true;
    				computerWon = false;
    				System.out.println("player Won! ");
    				
    			}
    		}
    	}
    	
    	// check to see if user  o got  combination 
    	
    	
    	if (board.button1.getText().equals("O")){
    		if (board.button4.getText().equals("O")){
    			if (board.button7.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	
    	// check to see if user o got combination 
    	
    	
    	if (board.button1.getText().equals("O")){
    		if (board.button5.getText().equals("O")){
    			if (board.button9.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	// check to see if user  o got  combination 
    	
    	if (board.button1.getText().equals("O")){
    		if (board.button2.getText().equals("O")){
    			if (board.button3.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	
    	
    	// check to see if user o got combination 
    	
    	
    	if (board.button3.getText().equals("O")){
    		if (board.button5.getText().equals("O")){
    			if (board.button7.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	
    	// check to see if user  o got combination 
    	
    	
    	if (board.button3.getText().equals("O")){
    		if (board.button6.getText().equals("O")){
    			if (board.button9.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	
    	
    	// check to see if user o got combination 
    	
    	
    	if (board.button7.getText().equals("O")){
    		if (board.button8.getText().equals("O")){
    			if (board.button9.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	
    	// check to see if user o got combination 
    	
    	
    	if (board.button4.getText().equals("O")){
    		if (board.button5.getText().equals("O")){
    			if (board.button6.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}
    	
    	// check to see if user o got combination 
    	
    	
    	if (board.button2.getText().equals("O")){
    		if (board.button5.getText().equals("O")){
    			if (board.button8.getText().equals("O")){
    				playerWon = false;
    				computerWon = true;
    				System.out.println("Player 2 won!");
    				
    			}
    		}
    	}	
  
    
    	
}
}

