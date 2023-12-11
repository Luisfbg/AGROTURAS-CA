@Library('jenkins-sharedlib')

def repo_sh = "https://github.com/Luisfbg/AGROTURAS-CA.git"
def submodule_branch = '16.0'

buildPipelineOdooSH(repo_sh: "${repo_sh}", submodule_branch: "${submodule_branch}")
