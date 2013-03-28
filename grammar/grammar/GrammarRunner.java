package dev.tclark.dogshow.grammar;

import java.io.PrintStream;

public abstract class GrammarRunner {
	private PrintStream origSystemErr;
	private PrintStream origSystemOut;
	
	protected void setOutputStream(PrintStream newStream)
	{
		origSystemOut = System.out;
		System.setOut(newStream);
	}
	protected void setErrStream(PrintStream newStream)
	{
		origSystemErr = System.err;
		System.setErr(newStream);
	}
	protected void resetStreams() {
		if (origSystemOut != null) {
			System.setOut(origSystemOut);
			origSystemOut = null;
		}
		if (origSystemErr != null) {
			System.setErr(origSystemErr);
			origSystemErr = null;
		}
	}

}
