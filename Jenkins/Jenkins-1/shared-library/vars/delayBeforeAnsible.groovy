def call() {
    script {
        echo "Waiting for 1 minute before proceeding..."
        sleep time: 2, unit: 'MINUTES'
        echo "Proceeding to run Ansible playbook..."
    }
}
