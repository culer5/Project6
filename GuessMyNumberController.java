package scott.dickinson.assignment6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// The Controller coordinates interactions
// between the View and Model


public class GuessMyNumberController {
	private GuessMyNumberView theView;
	
	    private GuessMyNumberModel theModel;
	
	     
	
	    public GuessMyNumberController(GuessMyNumberView theView, GuessMyNumberModel theModel) {
	
	        this.theView = theView;
	
	        this.theModel = theModel;

}
}