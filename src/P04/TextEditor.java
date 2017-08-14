package P04;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("TextEditor constructor");
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Setting SpellChecker");
        this.spellChecker = spellChecker;
    }
    public void runSpellChecker() {
        spellChecker.spellCheck();
    }
}
