# Use official OpenJDK image
FROM eclipse-temurin:17-jdk


# Set working directory inside container
WORKDIR /app

# Copy Java source code into container
COPY src/demo.java .

# Compile Java program
RUN javac demo.java

# Run the program
CMD ["java", "demo"]
