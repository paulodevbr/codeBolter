package repairplugin;

import java.util.function.ToDoubleBiFunction;

import org.eclipse.jface.wizard.Wizard;

public class ParametersWizard extends Wizard {
	protected PageAngelixPath one;
    protected PageParameters two;
	
	public ParametersWizard() {
        super();
        setNeedsProgressMonitor(true);
    }
	
	 @Override
	    public String getWindowTitle() {
	        return "Export My Data";
	    }

	    @Override
	    public void addPages() {
	        one = new PageAngelixPath();
	        two = new PageParameters();
	        addPage(one);
	        addPage(two);
	    }

	    @Override
	    public boolean performFinish() {
	        // Print the result to the console
	        System.out.println(one.getText1());
	        System.out.println(two.getCodePath());

	        return true;
	    }
	
	
	

}
