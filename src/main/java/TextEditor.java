public class TextEditor {
    
    private TextWindow textWindow;
    private TextWindowState savedTextWindow;
    // sets up a texteditor which takes a text window
    public TextEditor(TextWindow textWindow) {
        // sets the value of the text window
        this.textWindow = textWindow;
    }
    // creates the write method which adds text to the text window
    public void write(String text) {
        textWindow.addText(text);
    }
    // creates the print method which returns the text window
    public String print() {
        return textWindow.getCurrentText();
    }
    // creates the save method which sets the window with the current window
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }
    // creates the undo method which returns the window to the most recently saved version
    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }
}
    

