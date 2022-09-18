job("pilot-environment/manage-mft-buckets-pilot") {
	description()
    label('tooling-node')
	scm {
		git {
			remote {
				github("WSO2/amp-mft-s3-buckets", "https", "gitlab.ccoe.ampaws.com.au")
				credentials("git-lab-credentials")
			}
			branch("*/feature/core-build")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("make build ENV_NAME=pilot")
	}
}