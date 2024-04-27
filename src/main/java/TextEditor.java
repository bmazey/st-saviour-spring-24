public class TextEditor {

    private TextWindow textWindow;
    private TextWindowState savedTextWindow;
    // sets up a text editor which takes a text window
    public TextEditor(TextWindow textWindow) {
        //sets the value of text window
        this.textWindow = textWindow;
    }
    //creates write which adds text to the window
    public void write(String text) {
        textWindow.addText(text);
    }
    //this returns the text window
    public String print() {
        return textWindow.getCurrentText();
    }
    // creates a save method that sets the window to the current window
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }
    // creates undo which returns the most recently saved text window
    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }
    
}
