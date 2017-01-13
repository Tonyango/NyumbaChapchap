package tonyango.nyumbachapchap;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by homeboyz on 13/01/2017.
 */

public class AllHouses {

    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("OneBedrooms");

   // myRef.setValue("Hello, World!");



}
