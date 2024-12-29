// vars/runAnsible.groovy
def call() {
    stage('Run Ansible') {
        dir('Ansible-final-project') {
            ansiblePlaybook(
                credentialsId: 'ansible-ssh',
                inventory: 'inventory',
                playbook: 'playbook.yml',
                extras: '-e "ansible_ssh_extra_args='-o StrictHostKeyChecking=no'"'
            )
            sh """
                ls
            """
        }
    }
}

return this
