## Running Jenkins

`./gradlew docker dockerRun`

## Remove/Stop Jenkins

`./gradlew dockerStop`

## Rebuilding after changes Jenkins

`./gradlew build docker dockerRun`

Jenkins will then be available at [http://localhost:8080](http://localhost:8080).