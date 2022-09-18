listView('image-builds') {
    description('Jobs that build container images')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*image.*/)
    }
        columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}