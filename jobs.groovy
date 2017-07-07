job('MNTLAB-{akarzhou}-main-build-job') {
    scm {
        git {
            remote {
                name('remoteB')
                url('https://github.com/MNT-Lab/mntlab-dsl.git')
            }
            branches('akarzhou', 'master')
            extensions {
                choosingStrategy {
                    alternative()
                }
            }
        }
    }
}}
