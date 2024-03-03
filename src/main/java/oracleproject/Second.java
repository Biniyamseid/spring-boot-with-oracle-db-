//package oracleproject;
//
//import com.oracleproject.ConnectionString;
//import com.oracleproject.MongoClientSettings;
//import com.oracleproject.MongoException;
//import com.oracleproject.client.MongoClient;
//import com.oracleproject.client.MongoClients;
//import com.oracleproject.client.MongoDatabase;
//import org.bson.Document;
//
//public class Second {
//    public static void main(String[] args) {
//        String connectionString = "oracleproject://biniuix:Biniyam5982@ac-i52qzea-shard-00-00.mz3osuv.oracleproject.net:27017,ac-i52qzea-shard-00-01.mz3osuv.oracleproject.net:27017,ac-i52qzea-shard-00-02.mz3osuv.oracleproject.net:27017/?ssl=true&replicaSet=atlas-r7pcmw-shard-0&authSource=admin&retryWrites=true&w=majority&appName=Cluster0";
//
//
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(new ConnectionString(connectionString))
//                .build();
//
//        // Create a new client and connect to the server
//        try (MongoClient mongoClient = MongoClients.create(settings)) {
//            try {
//                // Send a ping to confirm a successful connection
//                MongoDatabase database = mongoClient.getDatabase("admin");
//                database.runCommand(new Document("ping", 1));
//                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
//            } catch (MongoException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
