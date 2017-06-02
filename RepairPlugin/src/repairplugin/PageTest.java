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

public class PageTest extends WizardPage{
	
	private GridData gd;
	private Text numberOfTests, assertJsonPath;
	private Label testLabel, assertJsonLabel;
	private Composite container;

	protected PageTest() {
		super("Second Page");
		setTitle("Test parameters");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 1;
        
        gd = new GridData(GridData.FILL_HORIZONTAL);
        
        startNumberOfTestsTextField();
        
        startAssertJsonTextField();
        
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);
		
	}

	public String getNumberOfTests() {
		return numberOfTests.getText();
	}

	
	public void startNumberOfTestsTextField(){
		testLabel = new Label(container, SWT.NONE);
        testLabel.setText("\nNumber of tests");
        
        numberOfTests = new Text(container, SWT.BORDER | SWT.SINGLE);
        numberOfTests.setText("");
        numberOfTests.addKeyListener(new KeyListener() {


			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				if (!numberOfTests.getText().isEmpty()) {
                    setPageComplete(true);

                }
				
			}

        });
        numberOfTests.setLayoutData(gd);
	}
	
	public void startAssertJsonTextField(){
		assertJsonLabel = new Label(container, SWT.NONE);
        assertJsonLabel.setText("\n assert.json path");
        
        assertJsonPath = new Text(container, SWT.BORDER | SWT.SINGLE);
        assertJsonPath.setText("");
        assertJsonPath.addKeyListener(new KeyListener() {


			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				// TODO Auto-generated method stub
				if (!assertJsonPath.getText().isEmpty()) {
                    setPageComplete(true);

                }
				
			}

        });
        assertJsonPath.setLayoutData(gd);
	}

	public String getAssertJsonPath() {
		return assertJsonPath.getText();
	}

	public void setAssertJsonPath(Text assertJsonPath) {
		this.assertJsonPath = assertJsonPath;
	}
	
	

}

