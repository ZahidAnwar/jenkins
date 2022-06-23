pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('track-github-activities-pipeline') {
    authenticationToken('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')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ZahidAnwar/track-github-activities.git'
                    }
                    branch 'pipeline'
                }
            }
        }
    }
}