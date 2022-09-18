job("dev-utilities/provision-any-ami") {
	description()
	scm {
		git {
			remote {
				github("WSO2/provision-any-ami", "https", "gitlab.ccoe.ampaws.com.au")
				credentials("git-lab-credentials")
			}
			branch("*/master")
		}
	}
	parameters{
    	stringParam('AMI', 'Provide the AMI that you wish to provision')
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("make build")
	}
}