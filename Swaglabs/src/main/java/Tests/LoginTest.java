package Tests;

import org.testng.annotations.Test;

import Library.Baseclass;
import PagesPOM.Loginpage;

public class LoginTest extends Baseclass
{

	Loginpage Login;

@Test
public void Testcase1() {

	Login=new Loginpage();
	Login.verifylogo();
}
    
}
