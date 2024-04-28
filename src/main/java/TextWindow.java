public class TextWindow {
    
    private StringBuilder currentText;
    // sets the textwindow class to hold the current text
    public TextWindow() {
        this.currentText = new StringBuilder();
    }
    // gets the current text in the window
    public String getCurrentText() {
        return currentText.toString();
    }
    // creates a way to add text to the current text
    public void addText(String text) {
        currentText.append(text);
    }
    // creates the memento object
    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }
    // resotres the most recently saved object
    public void restore(TextWindowState save) {
        currentText = new StringBuilder(save.getText());
    }
}
