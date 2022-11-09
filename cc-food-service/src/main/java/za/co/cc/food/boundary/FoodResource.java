package za.co.cc.food.boundary;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import za.co.cc.food.control.FoodService;
import za.co.cc.food.entity.FoodRequest;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

@Path("/api/foods")
@Tag(name = "Food REST endpoint")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FoodResource {

    @Inject
    FoodService service;

    @POST
    public Response createFood(FoodRequest request) {
        service.addFood(request);
        URI location = UriBuilder.fromResource(FoodResource.class)
                .path("/{foodName}")
                .resolveTemplate("foodName", request.getFoodName())
                .build();
        return Response.created(location).build();
    }

    @GET
    public Response getAllFoods() {
        return Response.ok(service.findAll()).build();
    }
}
