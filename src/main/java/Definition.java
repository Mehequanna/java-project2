import java.util.ArrayList;
import java.util.List;

public class Definition {
  private String mTheDefiniton;
  private static List<Definition> instances = new ArrayList<Definition>();
  private int mId;

  public Definition(String theDefinition) {
    mTheDefiniton = theDefinition;
    mId = instances.size();
    instances.add(this);
  }

  public String getTheDefinition() {
    return mTheDefiniton;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    instances.clear();
  }

  public static List<Definition> all() {
    return instances;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
