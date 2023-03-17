package org.howard.edu.lsp.midterm.problem51;

/**
 * Custom IntegerSetException
 * @author brianthaddeushunt
 *
 */
public class EmptyRangeException extends Exception {
	/**
	 * Custom EmptyRangeException
	 * @param errorMessage message
	 */
    public EmptyRangeException(String errorMessage) {  
    	super(errorMessage);  
    }  
}
