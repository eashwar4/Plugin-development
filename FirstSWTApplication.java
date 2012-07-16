import org.eclipse.swt.SWT;		//header files required
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class FirstSWTApplication 
{
    	public static void main(String[] args) 
    	{
    		Display display = new Display();
    		Shell shell = new Shell(display);	//creates a new shell(window)
    		
    		GridLayout layout = new GridLayout(10, false);	//new gridlayout with columns of unequal size
		
    		shell.setLayout(layout);	//setting the layout of the shell
    		
    		// Create new layout data
    		GridData data = new GridData(GridData.CENTER, GridData.CENTER, true, true, 1, 1);
    		    		
    		Composite composite = new Composite(shell, SWT.BORDER);
    		composite.setLayout(layout);
    		composite.setLayoutData(data);
    		
			Label label = new Label(composite, SWT.NONE);	//creating a label
    		label.setText("E-Mail i.d");
		
    		Text txt = new Text(composite, SWT.NONE);
			txt.setText("enter your email i.d here");
			
			    		
			label = new Label(composite, SWT.NONE);	// Create a new label that will span two columns
    		label.setText("password");
    		
    		txt = new Text(composite, SWT.NONE);
			txt.setText("enter your password here");
			
    		// Create a right aligned button
			data = new GridData(GridData.CENTER, GridData.CENTER, false, false, 1, 1);
    		Button b = new Button(shell, SWT.PUSH);
    		b.setText("submit");
    		b.setLayoutData(data);
		
    		b.addSelectionListener(new SelectionAdapter() 
    		{
    				public void widgetSelected(SelectionEvent e) {
    					System.out.println("Submit button clicked!");	//selection event handled here
    			}
    		}); 	
    		
			shell.pack();
			shell.open();
		
			while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
			}
		
			display.dispose();
	}
} 