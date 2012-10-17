import org.eclipse.swt.widgets.*;



public class GiaoDien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.open();
		shell.setText("Hello SWT!");
		
		// Create and check the event loop
		while (!shell.isDisposed()) {
		  if (!display.readAndDispatch())
		    display.sleep();
		}
		display.dispose();
	}

}
