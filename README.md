# sample-graphql

## Purpose

Question: What are you trying to solve in this project?

Answer: To understand how GraphQL implementation works

* Application.java is the entry point for Spring.
* build.gradle defines com.graphql-java-kickstart. This automatically picks up an resolvers in the code repo.
* Query implements GraphQLQueryResolver. GraphQL uses GraphQLQueryResolver to identify resolvers.
* GraphQL automatically pics up any *.graphqls files in the class path (hency why schema.graphqls is under mains/resource).
* Note that the 'Query' and 'method' in the schema match the name of the Query resolver and the hello method. 

## Instructions

### Running the App via Gradle

From the root directory of this project, run the following command:

```
./gradlew clean bootRun
```

This will run the application locally as a Spring boot app inside a gradle task.

### Running the App via Jar

From the root directory of the project, run the following command to build the jar:

```
./gradlew clean build
```

Now run the following command to run the jar locally:

```
java -jar build/libs/sample-graphql-1.0.0-SNAPSHOT.jar
```

### Running GraphQL Examples

Note: You will need to use a GraphQL Client in order to run the commands below.
Example client (https://insomnia.rest/)

Create a POST and set the URL to:

```
localhost:8082/graphql
```

Use the following data as the BODY of the POST:

```
query {
  hello (
    name : "batman"
  )
}
```

### Testing

From the root directory, run the following command to run all unit tests:

```
./gradlew clean test
```