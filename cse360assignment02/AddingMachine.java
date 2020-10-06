package cse360assignment02;

public class AddingMachine {
/**
 * instant variable
 */
  private int total;
  private String history = "0";
/**
 * default constructor
 */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
/**
 * method to get total
 * @return
 */
  public int getTotal () {
    return total;
  }
/**
 * method to add value to total 
 * @param value
 */
  public void add (int value) {
	  total = total + value;
	  history += " + " + value;
  }
/**
 * method to subtract value from total
 * @param value
 */
  public void subtract (int value) {
	  total = total - value;
	  history += " - " + value;
  }
/**
 * method to get history
 */
  public String toString () {
    return history + " ";
  }
/**
 * clear memory
 */
  public void clear() {
	  return ;
  }
}
