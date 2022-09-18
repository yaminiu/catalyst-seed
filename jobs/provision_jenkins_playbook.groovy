job("tooling-nonprod/provision-jenkins-cluster") {
	description()
	scm {
		git {
			remote {
				github("WSO2/amp-jenkins-service-cluster", "https", "gitlab.ccoe.ampaws.com.au")
				credentials("git-lab-credentials")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("make build ENV_NAME=esi-pilot ENV_GIT_TAG=master")
	}
}