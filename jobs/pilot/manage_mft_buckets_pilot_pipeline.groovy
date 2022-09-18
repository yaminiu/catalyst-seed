pipelineJob("pilot-environment/manage-mft-buckets-pilot-pipeline") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
				git {
					remote {
						github("https://gitlab.ccoe.ampaws.com.au/WSO2/amp-mft-s3-buckets.git", "https")
						credentials("git-lab-credentials")
					}
					branch("*/feature/core-build")
				}
			}
			scriptPath("Jenkinsfile")
		}
	}
	disabled(false)
	configure {
		it / 'properties' / 'com.coravy.hudson.plugins.github.GithubProjectProperty' {
			'projectUrl'('https://gitlab.ccoe.ampaws.com.au/WSO2/amp-mft-s3-buckets/')
			displayName()
		}
	}
}