package za.co.cc.food;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Food Microservice",
                description = "This microservice maintains nutritional info about food",
                version = "1.0",
                contact = @Contact(name = "@RidaAbrahamz", url = "http://rida.com")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/RidaAbrahams/cc-food", description = "Part of the Calorie Counter suite of products"),
        tags = {
                @Tag(name = "calories", description = "Capture and maintain calorie and other nutritional info about food")
        }
)
public class FoodService extends Application {
}
