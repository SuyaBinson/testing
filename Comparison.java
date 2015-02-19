import javax.swing.JOptionPane;    // GUI dialogs

public class Comparison
{
    public static void main( String args[] )
	{  String firstNumber,secondNumber,result;
	   int number1,number2;
	   
	   // read user numbers
	   firstNumber = JOptionPane.showInputDialog( 
	                    "Enter first integer:");
       secondNumber = JOptionPane.showInputDialog(
                        "Enter second integer:" );  

       // convert numbers     
	   number1 = Integer.parseInt( firstNumber );    
	   number2 = Integer.parseInt( secondNumber );    
	   
	   result = "";      
	   if ( number1 == number2 )         
	      result = number1 + " == " + number2;    
	   if ( number1 != number2 )        
	      result = number1 + " != " + number2;     
	   if ( number1 < number2 )        
	      result = result + "\n" + 	     
		    number1 + " < " + number2;      
	   if ( number1 > number2 )        
	      result = result + "\n" + 		
		    number1 + " > " + number2;
	   if ( number1 <= number2 )       
	      result = result + "\n" + 		
		    number1 + " <= " + number2;	
	   if ( number1 >= number2 )
	      result = result + "\n" + 
		    number1 + " >= " + number2;
			
	   // Display results
	   JOptionPane.showMessageDialog(        
	       null, result, "Comparison Results",
		   JOptionPane.INFORMATION_MESSAGE );

      } // end of main()
} // end of Comparison class

		  
		  
						
	   
	
	
