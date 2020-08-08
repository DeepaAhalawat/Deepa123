package reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import initiateTests.initClass;

public class ListenersImplementation implements  ITestListener{

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}	

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println(result.getName()+"--- Test case Failed");
		try {
			ReportingClass.reportFailure("--------------------> Fail", initClass.driver);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		ReportingClass.infoLogSkip("--------------------------------> Skip");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println(result.getName()+"--- Test case Started");	
		ReportingClass.initReports(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println(result.getName()+" ---Test case Success");
		ReportingClass.infoLogPass("---------------------> Pass");
	}    

	
	
	
}
