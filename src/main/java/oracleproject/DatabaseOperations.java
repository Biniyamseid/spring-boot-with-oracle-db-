//package oracleproject;
//
//import com.oracleproject.client.MongoClient;
//import com.oracleproject.client.MongoCollection;
//import com.oracleproject.client.MongoDatabase;
//import oracleproject.db.DatabaseConnection;
//import oracleproject.model.Recipe;
//import org.bson.Document;
//
//import java.util.Arrays;
//
//public class DatabaseOperations {
//    public static void main(String[] args) {
//        MongoClient mongoClient = DatabaseConnection.getMongoClient();
//
//        // Use the MongoClient instance to perform database operations
//        MongoDatabase database = mongoClient.getDatabase("myDatabase");
//        MongoCollection<Recipe> collection = database.getCollection("recipes", Recipe.class);
//
//        // Insert a new document into the collection
//        Recipe recipe = new Recipe("Pizza", Arrays.asList("Dough", "Tomato Sauce", "Cheese"), 20);
//        collection.insertOne(recipe);
//
//        // Find a document in the collection
//        Recipe foundRecipe = collection.find(new Document("name", "Pizza")).first();
//        System.out.println("Found recipe: " + foundRecipe.getName());
//
//        // Delete a document from the collection
//        collection.deleteOne(new Document("name", "Pizza"));
//
//        mongoClient.close();
//    }
//}