## Running Jenkins

`./gradlew docker dockerRun`

## Remove/Stop Jenkins

`./gradlew dockerStop`

## Rebuilding after changes Jenkins

`./gradlew build docker dockerRun`


## Remove old containers

`docker system prune -a`

#### Look for message on the console 'Jenkins is fully up and running'
Jenkins will then be available at [http://localhost:8080](http://localhost:8080)

#### Click on the 'seed-job' from the browser and click on 'Build now' to build seed-job

#### Once it completed navigate to dashboard, and you will be able to see four other pipelines
#### Add maven from global setting (Dashboard->Manage Jenkins->Global Tool Configuration)
#### Add aws credential (Dashboard->Manage Jenkins->Manage Credentials)
#### To add github credential on the job, click on the job and scroll down to pipeline 
#### and click on 'Add', on the popup fill up git user name and access token and add a meaningful name on the description (e.g. github-credentials), 
#### press save and apply button 
#### This 'github-credentials' should be available to other jobs, just click on manage and select it from credential drop down list, the red error should disappear


