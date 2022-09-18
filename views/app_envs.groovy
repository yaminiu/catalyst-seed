listView('app-envs') {
    description('Jobs for application environment management')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*environment.*/)
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