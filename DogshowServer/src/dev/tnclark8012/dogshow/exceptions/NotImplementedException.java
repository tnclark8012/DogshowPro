package dev.tnclark8012.dogshow.exceptions;

public class NotImplementedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -158069350430548652L;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "This action is not yet implemented!";
	}
}
