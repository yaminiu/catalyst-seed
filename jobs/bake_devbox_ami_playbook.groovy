job("bake-devbox-ami") {
	description()
    label('tooling-node')
	scm {
		git {
			remote {
				github("WSO2/bake-devbox-ami", "https", "gitlab.ccoe.ampaws.com.au")
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