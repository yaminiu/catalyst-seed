job("jenkins-agent-tooling-image") {
	description()
    label('docker-node')
	scm {
		git {
			remote {
				github("WSO2/amp-jenkins-tooling-agent-image", "https", "gitlab.ccoe.ampaws.com.au")
				credentials("git-lab-credentials")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("make build")
	}
}