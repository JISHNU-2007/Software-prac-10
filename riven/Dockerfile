FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn -B package -DskipTests

FROM eclipse-temurin:17-jre
COPY --from=build /app/target/riven.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
