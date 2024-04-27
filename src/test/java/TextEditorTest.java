import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TextEditorTest {
    
    @Test
    void TestTextEditor() {
        // creates a new text window in text editor
        TextEditor textEditor = new TextEditor(new TextWindow());
        // adds this text to the window
        textEditor.write("Memento design pattern\n");
        textEditor.write("Writing it in Java\n");
        // saves this text window
        textEditor.hitSave();
        //adds more text
        textEditor.write("Hello I wrote this!\n");
        // undoes the text just above, but keeps the other text before
        textEditor.hitUndo();
        //asserts that the code runs as intended, checking the text against the intended text
        assert (textEditor.print()).equals ("Memento design pattern\nWriting it in Java\n");
    }
}
