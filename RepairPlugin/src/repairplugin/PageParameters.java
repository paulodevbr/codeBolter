package repairplugin;

import java.awt.event.KeyEvent;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class PageParameters extends WizardPage{
	
	private Text codePath;
	private Text testPath;
	private Composite container;

	protected PageParameters() {
		super("Second Page");
		setTitle("Parameters to repair");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        
        Label codeLabel = new Label(container, SWT.NONE);
        codeLabel.setText("Path to your .c");
        

        codePath = new Text(container, SWT.BORDER | SWT.SINGLE);
        codePath.setText("");
        codePath.addKeyListener(new KeyListener() {


			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				if (!codePath.getText().isEmpty()) {
                    setPageComplete(true);

                }
				
			}

        });
        
        Label testLabel = new Label(container, SWT.NONE);
        testLabel.setText("\nTest cases path");
        
        testPath = new Text(container, SWT.BORDER | SWT.SINGLE);
        testPath.setText("");
        testPath.addKeyListener(new KeyListener() {


			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				if (!testPath.getText().isEmpty()) {
                    setPageComplete(true);

                }
				
			}

        });
        
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        codePath.setLayoutData(gd);
        testPath.setLayoutData(gd);
        
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
		
	}

	public String getCodePath() {
		return codePath.getText();
	}

	public void setText1(Text text1) {
		this.codePath = text1;
	}

	

}

