//package oracleproject.db;
//
//
//import com.oracleproject.ConnectionString;
//import com.oracleproject.MongoClientSettings;
//import com.oracleproject.MongoException;
//import com.oracleproject.client.MongoClient;
//import com.oracleproject.client.MongoClients;
//import org.bson.codecs.configuration.CodecRegistry;
//import org.bson.codecs.pojo.PojoCodecProvider;
//
//import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
//import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
//
//public class DatabaseConnection {
//    public static MongoClient getMongoClient() {
//        ConnectionString mongoUri = new ConnectionString("oracleproject+srv://biniuix:Biniyam5982@cluster0.mz3osuv.oracleproject.net/?retryWrites=true&w=majority&appName=Cluster0");
//
//        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
//                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
//
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .codecRegistry(pojoCodecRegistry)
//                .applyConnectionString(mongoUri).build();
//
//        MongoClient mongoClient = null;
//        try {
//            mongoClient = MongoClients.create(settings);
//        } catch (MongoException me) {
//            System.err.println("Unable to connect to the MongoDB instance due to an error: " + me);
//            System.exit(1);
//        }
//
//        return mongoClient;
//    }
//}