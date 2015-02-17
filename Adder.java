import javax.swing.JOptionPane;    // GUI dialogs

public class Adder
{
    public static void main( String args[] )
	{  String firstNumber,secondNumber,result;
	   int sum,number1,number2;
	   
	   // read user numbers
	   firstNumber = JOptionPane.showInputDialog( 
	                    "Enter first integer:");
       secondNumber = JOptionPane.showInputDialog(
                        "Enter second integer:" );  

       // convert numbers     
	   number1 = Integer.parseInt( firstNumber );    
	   number2 = Integer.parseInt( secondNumber );    
	   
	   sum = number1 + number2;
	   
	   result = number1 + "+" + number2 + "=" + sum;  
       	   			
	   // Display results
	   JOptionPane.showMessageDialog(        
	       null, result, "Adder Results",
		   JOptionPane.INFORMATION_MESSAGE );

      } // end of main()
} // end of Comparison class

		  
		  
						
	   
	
	
