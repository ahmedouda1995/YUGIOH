package eg.edu.guc.yugioh.exceptions;

@SuppressWarnings("serial")
public class UnexpectedFormatException extends Exception{
private	String sourceFile;
private	int sourceLine;
public UnexpectedFormatException(){
super();	
}
public UnexpectedFormatException(String m){
	super(m);
}
public UnexpectedFormatException(String sourceFile, int sourceLine,String m){
	super(m);
	this.sourceFile= sourceFile;
	this.sourceLine=sourceLine;
	
}
public String getSourceFile() {
	return sourceFile;
}
public void setSourceFile(String sourceFile) {
	this.sourceFile = sourceFile;
}
public int getSourceLine() {
	return sourceLine;
}
public void setSourceLine(int sourceLine) {
	this.sourceLine = sourceLine;
}
}
