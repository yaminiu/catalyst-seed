listView('utilities') {
    description('Jobs for various tools, services and utilities')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*utilities.*/)
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