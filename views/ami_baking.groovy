listView('ami-baking') {
    description('Jobs that bake aws amis')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*bake.*/)
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