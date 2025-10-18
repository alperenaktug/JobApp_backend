
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app

# pom ve kaynakları kopyala
COPY pom.xml .
COPY src ./src

# Build et (testleri atlamak istersen -DskipTests kullanabilirsin)
RUN mvn clean package -DskipTests

# ===========================
# RUN STAGE
# ===========================
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Build aşamasından çıkan jar dosyasını kopyala
COPY --from=build /app/target/JobApp-0.0.1-SNAPSHOT.jar app.jar

# Ortam değişkeni (platformların PORT vermesi için)
ENV PORT=8080
EXPOSE 8080

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "app.jar"]
