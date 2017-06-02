package repairplugin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.ToDoubleBiFunction;

import org.eclipse.jface.wizard.Wizard;

public class ParametersWizard extends Wizard {
	private  final String ANGELIX = "angelix ";
	private  final String ORACLE = "oracle ";
	private  final String ASSERT = "--assert ";
	protected PageCode one;
    protected PageTest two;
	
	public ParametersWizard() {
        super();
        setNeedsProgressMonitor(true);
    }
	
	    public String getWindowTitle() {
	        return "Repair by I4soft";
	    }

	    @Override
	    public void addPages() {
	        one = new PageCode();
	        two = new PageTest();
	        addPage(one);
	        addPage(two);
	    }

	    @Override
	    public boolean performFinish() {
	        // Print the result to the console
	    	Runtime rt = Runtime.getRuntime();
//	    	try {
	    		String codePath = one.getCodePath()+" ";
	    		String fileName = one.getFileName()+" ";
	    		String numberOfTests = two.getNumberOfTests() + " ";
	    		String assertPath = two.getAssertJsonPath();
				
//	    		final Process p = Runtime.getRuntime().exec(ANGELIX + codePath + fileName
//	    				+ ORACLE + numberOfTests + ASSERT + assertPath);
//
//	    		new Thread(new Runnable() {
//	    		    public void run() {
//	    		     BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
//	    		     String line = null; 
//
//	    		     try {
//	    		        while ((line = input.readLine()) != null)
//	    		            System.out.println(line);
//	    		     } catch (IOException e) {
//	    		            e.printStackTrace();
//	    		     }
//	    		    }
//	    		}).start();
//
//	    		p.waitFor();
	    		
	    		System.out.println(ANGELIX + codePath + fileName
	    				+ ORACLE + numberOfTests + ASSERT + assertPath);
	    		
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	    	
	    	

	        return true;
	    }
	
	
	

}
