# Microservice & Reactjs

## Prerequisite
- Java version 8 (at least)
- Maven
- Docker environment
- Docker compose

## Build project
### Build backend project
```shell
mvn clean install
```

## Deploy all to docker
```shell
docker-compose up -d --force-recreate
```

## Remove all to docker network
```shell
docker rm -vf $(docker ps -a -q)
docker system prune # All on your system
```


## Testing
- Elasticsearch: http://localhost:9200
- Backend api swagger: http://localhost:8080/swagger-ui.html
- Front end UI: http://localhost:4200