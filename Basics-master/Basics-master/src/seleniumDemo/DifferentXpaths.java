package seleniumDemo;

public class DifferentXpaths {

	public static void main(String[] args) {
		// absolute Xpath and relative xpath
		// absolute xpath - complete path 
		// relative xpath - partial xpath
		
		//------- this is multiple attribute --------
		//.//a[contains(@href,'edit.hp')][text()='posts']  
		//.//input[@name='typetext' or @type()='button']
		//.//input[@name='typetext' AND @type()='button']
		
		
		//.//[text()='nbc']//following::a[contains(@href,'edit.hp')][text()='posts']
		//.//[text()='nbc']//following::a[contains(@href,'edit.hp')][text()='posts']
	   ////*[@id='tools1']//preceding::a[1] -- this is opposite to following
		
		// below one will go to parent of it, go to its preceeding sibling td and click on an element
		////*[@id='test']/parent:://preceding-sibling::td//input[@name='input'] -- this is opposite to following
		//.//*[text()='Not Sorted Tools for Testing']//following::a[10]
		
		// ---------  elements who property value is dynamically changing ---------
		//.//*[contains(@id,'abc')]
		//.//*[starts-with(@id,'123')]	
       
		
		// use this URL To test : http://seleniumpractise.blogspot.com/ // Example below
		////*[@id='tools1']//following::a[contains(@href,'plus')][@class='g-profile'][@title='author profile'][1]
		
		//below desendant will be helpful to get the childs of an element;Example used here is for google
		////ul[@role='listbox']//li/descendant::div[@class='sbl1']
		
		// to find an object which is located in a parent and its preceding sibling and its childs child
		////input[@class='test2']//parent::td[@class='run']//preceding-sibling::div[@id='check']//input[@id='click']
		
	//  descendant - this will give u the childs of an element
	//  following - by this we can find the any selected following elements.Even it can be the child of any other element
	// EX: //*[@id='APH_Primary_Sales_UOM']//following::option -- this will keep getting all the option in the html

	// preceding - this is quiet opposite to following -
	// following-sibling - this will get the following tag name of same tag name

		
		
		
		
	}

}
