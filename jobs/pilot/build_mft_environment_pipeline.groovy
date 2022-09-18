pipelineJob("pilot-environment/build-mft-environment-pilot") {
	description()
	keepDependencies(false)
	parameters {
		stringParam("ENV_NAME", "pilot", """Environment to run this pipeline for.
Leave as DEFAULT""")
	}
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
			scriptPath("Jenkinsfile_env")
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