/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author aisham
 */
@Path("/service")
@RequestScoped
public class RestService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestService
     */
    public RestService() {
    }

    /**
     * Retrieves representation of an instance of service.RestService
     * @return an instance of java.lang.String
     */
    @GET
    @Path("getTime")
    @Produces("text/html")
    public String getHtml() {
        //TODO return proper representation object
       return "<html><body>Hello!... Now Server time is"+ Calendar.getInstance().getTime()+"</body></html>";
    }
    
    
     @GET
     @Path("getNameTime")
    @Produces("text/html")
    public String getTime(@QueryParam("name") String name) {
        //TODO return proper representation object
       return "<html><body>Hello "+name+"!... Now Server time is"+ Calendar.getInstance().getTime()+"</body></html>";
    }

    /**
     * PUT method for updating or creating an instance of RestService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
    
    /**
     *
     * @param person
     * @return
     */
//    public Person saveFormData(@ModelAttribute Person person ){
//        return null;
//    }
}
