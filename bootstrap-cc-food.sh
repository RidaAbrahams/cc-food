mvn -U io.quarkus:quarkus-maven-plugin:create \
-DprojectGroupId=za.co.cc.food \
-DprojectArtifactId=cc-food-service \
-DclassName="za.co.cc.food.boundary.FoodResource" \
-Dpath="/api/foods" \
-Dextensions="resteasy-jsonb, hibernate-orm, jdbc-postgresql, smallrye-openapi"
