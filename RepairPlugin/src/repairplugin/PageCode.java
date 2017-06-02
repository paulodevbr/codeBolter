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

public class PageCode extends WizardPage{
	
	private Text codePath;
	private Text fileName;
	private Composite container;

	protected PageCode() {
		super("First Page");
		setTitle("Code parameters");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 1;
        Label codeLabel = new Label(container, SWT.NONE);
        codeLabel.setText("Path to your source");
        
        
        
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
        
        Label fileLabel = new Label(container, SWT.NONE);
        fileLabel.setText("File name .c");
        
        
        
        fileName = new Text(container, SWT.BORDER | SWT.SINGLE);
        fileName.setText("");
        fileName.addKeyListener(new KeyListener() {


			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				if (!fileName.getText().isEmpty()) {
                    setPageComplete(true);

                }
				
			}

        });
       
        
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        codePath.setLayoutData(gd);
        fileName.setLayoutData(gd);
        
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
		
	}
	

	public String getCodePath() {
		return codePath.getText();
	}
	public String getFileName() {
		return fileName.getText();
	}


}
