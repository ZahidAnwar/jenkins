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