# Demo Project

Small Spring Boot demo application.

Build & run locally:

```powershell
mvnw spring-boot:run
```

Build Docker image (requires Docker):

```powershell
docker build -t demo .
docker run --rm -p 8080:8080 demo
```
