job("bake-ecs-ami") {
	description()
    label('tooling-node')
	scm {
		git {
			remote {
				github("WSO2/bake-ecs-ami", "https", "gitlab.ccoe.ampaws.com.au")
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