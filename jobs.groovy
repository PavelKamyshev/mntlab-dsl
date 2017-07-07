freeStyleJob('EPBYMINW2033/MNTLAB-hpashuto-main-build-job') {
    description 'DSL task main job.'
    scm {
        github ''
    }
    steps {
        g
    }
    publishers {
        archiveJunit ''
    }
}
(1..4).each {
            def jobN = it.value
            freeStyleJob("EPBYMINW2033/MNTLAB-hpashuto-child$jobN-build-job") {
                description "DSL task child$jobN job."
                scm {
                    github ''
                }
                steps {
                    gradle 'test'
                }
                publishers {
                    archiveJunit ''
                }
            }
        }