import org.junit.jupiter.api.Test;

class TextEditorTest {

    @Test
    void givenTextEditor_whenAddTextSaveAddMoreAndUndo_thenSavecStateRestored() {
        // sets up a new text window in text editor
        TextEditor textEditor = new TextEditor(new TextWindow());
        // implements the write method, adding text to the window
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        // saves the current text window
        textEditor.hitSave();
        // adds more text to the window
        textEditor.write("Buy milk and eggs before coming home\n");
        // undoes the previous text, returning the window to how it was when it was saved
        textEditor.hitUndo();

        // asserts that what was outputted reflects the correct assumed output
        assert (textEditor.print()).equals ("The Memento Design Pattern\nHow to implement it in Java?\n");
    }
}