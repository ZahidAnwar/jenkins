pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('track-github-activities-pipeline') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ZahidAnwar/track-github-activities.git'
                    }
                    branch 'gradle'
                }
            }
        }
    }
}