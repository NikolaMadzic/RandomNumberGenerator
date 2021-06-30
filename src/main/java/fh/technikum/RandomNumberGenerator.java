package fh.technikum;

import javax.ws.rs.*;
import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.*;
import java.util.Random;

@Path("/api")
public class RandomNumberGenerator {

    //https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    @GET
    @Path("/calcRandomNumber")
    @Produces(MediaType.TEXT_PLAIN)
    public int calcRandomNumber() {

        //https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values
        Random r = new Random();
        int low = 500;
        int high = 600;
        int result = r.nextInt(high-low) + low;
        System.out.println("Random integer value from 0 to" + (high-1) + " : "+ result);
        return result;

    }

}
