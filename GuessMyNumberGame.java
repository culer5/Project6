package scott.dickinson.assignment6;

public class GuessMyNumberGame {


	public static void main(String[] args) {
		// Driver for program 
		GuessMyNumberView theView = new GuessMyNumberView();
		
		         
		GuessMyNumberModel theModel = new GuessMyNumberModel();
		        
	
		        GuessMyNumberController theController = new GuessMyNumberController(theView,theModel);
	
		         
	
		        theView.setVisible(true);
		
		         
	
		    }
		
		}


	}

}





