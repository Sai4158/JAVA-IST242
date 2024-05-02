package Model;
/**
 * Filename: Displayable.java
 * Short description: Displayable properties for the gui components
 * IST 242 Assignment: L04C
 * @author Sai Rangineeni
 * @version 3/28/2024
 */

//interface
public interface Displayable
{
    public int getFirstLineToDisplay();
    public int getLineToHighlight();
    public int getLastLineToDisplay();
    public int getLinesBeingDisplayed();

    public void setFirstLineToDisplay(int firstLine);
    public void setLineToHighlight(int highlightedLine);
    public void setLastLineToDisplay(int lastLine);
    public void setLinesBeingDisplayed(int numberOfLines);
}
