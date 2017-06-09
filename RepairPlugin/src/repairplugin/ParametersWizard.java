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
	    	
	    	String codePath = one.getCodePath()+" ";
	    	String fileName = one.getFileName()+" ";
	    	String numberOfTests = two.getNumberOfTests() + " ";
	    	String assertPath = two.getAssertJsonPath();
				
//	    	final Process p = Runtime.getRuntime().exec(ANGELIX + codePath + fileName
//	    			+ ORACLE + numberOfTests + ASSERT + assertPath);
	    		
	    	String[] cmd = {
			        "/bin/bash",
			        "-c",
			        "cd /home/angelix; python Shell.py"
			    };

			System.out.println(executeCommand(cmd));
	    		
	    	System.out.println(ANGELIX + codePath + fileName
	    				+ ORACLE + numberOfTests + ASSERT + assertPath);
	    	
	        return true;
	    }
	    
	    private String executeCommand(String[] command) {

			StringBuffer output = new StringBuffer();

			Process p;
			try {
				p = Runtime.getRuntime().exec(command);
				p.waitFor();
				BufferedReader reader =
	                            new BufferedReader(new InputStreamReader(p.getInputStream()));

	                        String line = "";
				while ((line = reader.readLine())!= null) {
					output.append(line + "\n");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			return output.toString();

		}
	
	
	

}
