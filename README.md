## Running Jenkins

`./gradlew docker dockerRun`

## Remove/Stop Jenkins

`./gradlew dockerStop`

## Rebuilding after changes Jenkins

`./gradlew build docker dockerRun`


## Remove old containers

`docker system prune -a`


Jenkins will then be available at [http://localhost:8080](http://localhost:8080).