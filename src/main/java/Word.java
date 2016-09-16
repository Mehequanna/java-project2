import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mTheWord;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;
  private List<Definition> mWordDefinitions;

  public Word(String theWord) {
    mTheWord = theWord;
    mId = instances.size();
    instances.add(this);
    mWordDefinitions = new ArrayList<Definition>();
  }

  public String getTheWord () {
    return mTheWord;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    instances.clear();
  }

  public static List<Word> all() {
    return instances;
  }

  public List<Definition> getWordDefinitions() {
    return mWordDefinitions;
  }

  public void addDefinition(Definition definition) {
    mWordDefinitions.add(definition);
  }

  public static Word find(int id) {
    try {
      return instances.get(id);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
