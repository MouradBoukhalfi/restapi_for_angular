package com.test.restapi;


import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;	
import javax.ws.rs.Produces;



/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @Produces("application/json")
	@GET 
    public String datas() {
    	return Json.createArrayBuilder().
    			add(data(1,"Titanic",1998,"Dramatique")).
    			add(data(2,"Transformers 1",2004,"Fantastique")).
    			add(data(3,"Fast and Furious",2007,"Action")).
    			build().toString();
    }
    
    public JsonObject data(int id, String title, int year, String type) {
    	return Json.createObjectBuilder().
    			add("id",id).
    			add("title",title).
    			add("year",year).
    			add("type",type).
    			build();
    }
}
