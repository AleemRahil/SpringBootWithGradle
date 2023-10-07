pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/AleemRahil/SpringBootWithGradle'
                    }
                    branch 'master'
                }
            }
        }
    }
}