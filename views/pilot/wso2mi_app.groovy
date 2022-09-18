listView('pilot-environment/WSO2MI') {
    description('Jobs for managing the WSO2MI application in the pilot environment')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*ESI_MI.*/)
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