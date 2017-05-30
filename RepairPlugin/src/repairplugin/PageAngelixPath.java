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

public class PageAngelixPath extends WizardPage{
	
	private Text toolPath;
	private Composite container;

	protected PageAngelixPath() {
		super("First Page");
		setTitle("Angelix Path");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 1;
        Label label1 = new Label(container, SWT.NONE);
        label1.setText("Angelix Path");
        
        
        
        toolPath = new Text(container, SWT.BORDER | SWT.SINGLE);
        toolPath.setText("");
        toolPath.addKeyListener(new KeyListener() {


			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				if (!toolPath.getText().isEmpty()) {
                    setPageComplete(true);

                }
				
			}

        });
        Label label2 = new Label(container, SWT.NONE);
        label2.setText("\nNote that you need Angelix installed \n"
        		+ "In case you don't, you can download it here:\n"
        		+ "http://angelix.io/");
        
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        toolPath.setLayoutData(gd);
        
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
		
	}

	public String getText1() {
		return toolPath.getText();
	}

	public void setText1(Text text1) {
		this.toolPath = text1;
	}

}
