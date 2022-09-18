listView('pilot-environment/MFT') {
    description('Jobs for managing the MFT application in the pilot environment')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex(/.*mft.*/)
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