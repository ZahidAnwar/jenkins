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
                        url 'https://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@github.com/ZahidAnwar/track-github-activities.git'
                    }
                    branch 'pipeline'
                }
            }
        }
    }
}