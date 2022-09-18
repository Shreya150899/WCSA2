package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="Functional")
  public void ft1() {
	  Reporter.log("Ft test case 1",true);
  }
  @Test(groups="Integration")
  public void it1() {
	  Reporter.log("it test case 1",true);
  }
  @Test(groups="Smoke")
  public void st1() {
	  Reporter.log("st test case 1",true);
  }
  //----------------------------------------/
  @Test(groups="Functional")
  public void ft2() {
	  Reporter.log("Ft test case 2",true);
  }
  @Test(groups="Integration")
  public void it2() {
	  Reporter.log("it test case 2",true);
  }
  @Test(groups="Smoke")
  public void st2() {
	  Reporter.log("st test case 2",true);
  }
  //------------------------------------
  @Test(groups="Functional")
  public void ft3() {
	  Reporter.log("Ft test case 3",true);
  }
  @Test(groups="Integration")
  public void it3() {
	  Reporter.log("it test case 3",true);
  }
  @Test(groups="Smoke")
  public void st3() {
	  Reporter.log("st test case 3",true);
  }
  //-------------------------------
  @Test(groups="Functional")
  public void ft4() {
	  Reporter.log("Ft test case 4",true);
  }
  @Test(groups="Integration")
  public void it4() {
	  Reporter.log("it test case 4",true);
  }
  @Test(groups="Smoke")
  public void st4() {
	  Reporter.log("st test case 4",true);
  }
  //-------------------
  @Test(groups="Functional")
  public void ft5() {
	  Reporter.log("Ft test case 5",true);
  }
  @Test(groups="Integration")
  public void it5() {
	  Reporter.log("it test case 5",true);
  }
  @Test(groups="Smoke")
  public void st5() {
	  Reporter.log("st test case 5",true);
  }
  //--------------------------
  @Test(groups="Functional")
  public void ft6() {
	  Reporter.log("Ft test case 6",true);
  }
  @Test(groups="Integration")
  public void it6() {
	  Reporter.log("it test case 6",true);
  }
  @Test(groups="Smoke")
  public void st6() {
	  Reporter.log("st test case 6",true);
  }
}
