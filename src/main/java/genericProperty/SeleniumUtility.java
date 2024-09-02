package genericProperty;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	WebDriver driver = null;
	Actions act = null;
	Select s =null;
	
	/**
	 * this is a generic method for implicit wait
	 * @param perticularSeconds
	 */
	 public void implicitlyWait(WebDriver driver, int perticularSeconds) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(perticularSeconds));
	 }
	 /**
	  * this is generic method for maximize the window
	  */
	 public void maximizeWindow(WebDriver driver) {
		 driver.manage().window().maximize();
	 }
	 
	/*---------------Actions class Generic Functions----------------*/
	 /**
	  * this is a generic method to right click on an Element
	  * @param element
	  */
	 
	 public void rightClickOnAnElement(WebDriver driver, WebElement element) {
		 act = new Actions(driver);
		 act.contextClick(element).perform();
	 }
	 
	 /**
	  * this is a generic method to click on Element
	  * @param element
	  */
	 public void ClickOnAnElement(WebDriver driver, WebElement element) {
		 act = new Actions(driver);
		 act.click(element).perform();
	 }
	 
	 /**
	  * this is a generic method to drag and drop an Element
	  * @param src
	  * @param target
	  */
	 public void dragAndDropElement(WebDriver driver, WebElement src, WebElement target) {
		 act = new Actions(driver);
		 act.dragAndDrop(src,target).perform();
	 }
	 /**
	  * this is a generic method to drag and drop a pointer
	  * @param src
	  * @param xOffset
	  * @param yOffset
	  */
	 public void dragAPointer(WebDriver driver, WebElement src, int xOffset, int yOffset) {
		 act = new Actions(driver);
		 act.dragAndDropBy(src,xOffset,yOffset).perform();
	 }
	 /**
	  * this is a generic method to perform scroll down operation
	  * @param element
	  */
	 
	 public void scrollToAPerticulaElement(WebDriver driver, WebElement element) {
		 act = new Actions(driver);
		 act.scrollToElement(element).perform();
	 }
	 /**
	  * this is a generic method to move cursor on particular element
	  * @param element
	  */
	 public void moveCursorToAnElement(WebDriver driver, WebElement element) {
		 act = new Actions(driver);
		 act.moveToElement(element).perform();
	 }
	 /**
	  * this is a generic method to hold an element
	  * @param element
	  */
	 public void holdAnElement(WebDriver driver, WebElement element) {
		 act = new Actions(driver);
		 act.clickAndHold(element).perform();
	 }
	 /**
	  * this is a generic method to release an element
	  * @param element
	  */
	 public void releaseAnElement(WebDriver driver, WebElement element) {
		 act = new Actions(driver);
		 act.release(element).perform();
	 }
	/*------------------------Select Class generic Function*/
	 /**
	  * this is generic method select an option by index value
	  * @param element
	  * @param indexNum
	  */
	 public void selectElementByIndex(WebElement element,int indexNum) {
		 s = new Select(element);
		 s.selectByIndex(indexNum);
	 }
	 /**
	  * this is generic method select an option by visible text
	  * @param element
	  * @param text
	  */
	 public void selectElementVisibleText(WebElement element,String text) {
		 s = new Select(element);
		 s.selectByVisibleText(text);
	 }
	 /**
	  * this is generic method select an option by value
	  * @param element
	  * @param value
	  */
	 public void selectElementByValue(WebElement element,String value) {
		 s = new Select(element);
		 s.selectByValue(value);
	 }
	 /**
	  * this is generic method deselect an option by index value
	  * @param element
	  * @param indexNum
	  */
	 public void deSelectElementByIndex(WebElement element,int indexNum) {
		 s = new Select(element);
		 s.deselectByIndex(indexNum);
	 }
	 /**
	  * this is generic method deselect an option by visible text
	  * @param element
	  * @param text
	  */
	 public void deSelectElementVisibleText(WebElement element,String text) {
		 s = new Select(element);
		 s.deselectByVisibleText(text);
	 }
	 /**
	  * this is generic method select an option by value
	  * @param element
	  * @param value
	  */
	 public void deSelectElementByValue(WebElement element,String value) {
		 s = new Select(element);
		 s.deselectByValue(value);
	 }
	 /**
	  * this is generic method de-select all option 
	  * @param element
	  */
	 public void deSelectAllOptions(WebElement element) {
		 s = new Select(element);
		 s.deselectAll();
	 }
	 /**
	  * this is generic method to fetch  all selected option 
	  * @param element
	  * @return
	  */
	 public List<WebElement> fetchAllSelectedOptions(WebElement element){
		 s = new Select(element);
		 List<WebElement> all = s.getAllSelectedOptions();
		 return all;
	 }
	 /**
	  *  this is generic method to fetch  all option
	  * @param element
	  * @return
	  */
	 public List<WebElement> fetchAllOptions(WebElement element){
		 s = new Select(element);
		 List<WebElement> all = s.getOptions();
		 return all;
	 }
	 /*------------------------Alert----------------------*/
	 /**
	  * this is generic method accept the alert
	  */
	 public void acceptAlert()
	 {
		driver.switchTo().alert().accept(); 
	 }
	 /**
	  * this is generic method dismiss the alert
	  */
	 public void dissmissAlert()
	 {
		 driver.switchTo().alert().dismiss(); 
	 }
	 /*------------------------------Frame----------------*/
	 /**
	  * this is generic method 
	  * @param childFrameIndex
	  */
	 
	 public void switchTochildFrame(int childFrameIndex)
	 {
		driver.switchTo().frame(childFrameIndex); 
	 }
}
