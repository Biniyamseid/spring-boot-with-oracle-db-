package oracleproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
//import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Main {
  // a few pre-wired recipes we can insert into the database as examples.
  public static List<Recipe> recipes = Arrays.asList(
      new Recipe("elotes",
              Arrays.asList("corn", "mayonnaise", "cotija cheese", "sour cream", "lime" ),
              35),
      new Recipe("loco moco",
              Arrays.asList("ground beef", "butter", "onion", "egg", "bread bun", "mushrooms" ),
              54),
      new Recipe("patatas bravas",
              Arrays.asList("potato", "tomato", "olive oil", "onion", "garlic", "paprika" ),
              80),
      new Recipe("fried rice",
              Arrays.asList("rice", "soy sauce", "egg", "onion", "pea", "carrot", "sesame oil" ),
              40)
  );

  public static void main(String[] args) {

  }

  // POJO (Plain Old Java Object) class defining a recipe. This class is a POJO because it contains getters and
  // setters for every member variable as well as an empty constructor.
  public static class Recipe {
    private String name;
    private List<String> ingredients;
    private int prepTimeInMinutes;

    public Recipe(String name, List<String> ingredients, int prepTimeInMinutes) {
      this.name = name;
      this.ingredients = ingredients;
      this.prepTimeInMinutes = prepTimeInMinutes;
    }

    // empty constructor required when we fetch data from the database -- getters and setters are later used to
    // set values for member variables
    public Recipe() {
      ingredients = new ArrayList<String>();
      name = "";
    }

    @Override
    public String toString() {
      final StringBuffer sb = new StringBuffer("Recipe{");
      sb.append("name=").append(name);
      sb.append(", ingredients=").append(ingredients);
      sb.append(", prepTimeInMinutes=").append(prepTimeInMinutes);
      sb.append('}');
      return sb.toString();
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<String> getIngredients() {
      return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
      this.ingredients = ingredients;
    }

    public int getPrepTimeInMinutes() {
      return prepTimeInMinutes;
    }

    public void setPrepTimeInMinutes(int prepTimeInMinutes) {
      this.prepTimeInMinutes = prepTimeInMinutes;
    }
  }
}
