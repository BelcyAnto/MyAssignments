package week3.day2;

//Base Class: WebElement
class WebElement
{
  public void click()
   {
    System.out.println("Click Event");
   }
   public void setText(String text)
   {
    System.out.println(text);
   }
}
//Subclasse1: Button inheriting from the WebElement base class.
class Button extends WebElement
{
  public void submit()
  {
   System.out.println("Submit Event");
   }
}
//Subclass2: TextField inheriting from the WebElement base class.
class TextField extends WebElement
{
  public void getText1()
  {
  System.out.println("getText Event");
  }
}
//Additional Subclass: CheckBoxButton inherits from the Button subclass.
class CheckBoxButton extends Button
{
  public void clickCheckButton()
  {
   System.out.println("clickCheckButton Event");
   }
}
//Additional Subclass: RadioButton inherits from the Button subclass.
class RadioButton extends Button
{
  public void selectRadioButton()
  {
   System.out.println("selectRadioButton Event");
   }
}
//Execution Class: Elements
public class Elements extends Button 
{
	public static void main(String[] args) 
	{
	 Elements a=new Elements();
	 a.submit();
	 a.click();
     a.setText("Inheritance from Elements Execution class");
     System.out.println("---------------------------------------");
     
     CheckBoxButton b=new CheckBoxButton(); 
	 b.clickCheckButton();
	 b.submit();
	 b.click();
     b.setText("Inheritance from CheckBoxButton Subclass");
     System.out.println("---------------------------------------");
     
	 RadioButton c=new RadioButton();
     c.selectRadioButton();
	 c.submit();
	 c.click();
     c.setText("Inheritance from RadioButton Subclass");
     System.out.println("---------------------------------------");
     
     TextField d=new TextField();
     d.getText1();
     d.click();
     d.setText("Inheritance from TextField Subclass");
	}

}
