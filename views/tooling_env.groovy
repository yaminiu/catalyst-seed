listView('tooling-env') {
    description('Jobs for tooling environment management')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*nonprod.*/)
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