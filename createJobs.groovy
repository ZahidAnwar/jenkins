pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('track-github-activities') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ZahidAnwar/track-github-activities.git'
                    }
                    branch 'maven-build'
                }
            }
        }
    }
}

pipelineJob('track-github-activities-api-acceptance-test') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ZahidAnwar/track-github-activities-api-acceptance-test.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}

pipelineJob('track-github-activities-api-ecs-services') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ZahidAnwar/track-github-activities-ecs-services.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}