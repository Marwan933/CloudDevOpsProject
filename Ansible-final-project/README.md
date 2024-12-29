# Ansible Playbook for Setting Up Kubernetes, Docker, Jenkins, SonarQube, and Dependencies🚀

This project contains an **Ansible Playbook** to install and configure the following tools on **Ubuntu EC2 Instances**:
- **Kubernetes** (kubectl, kind)
- **Docker**
- **Jenkins**
- **SonarQube**
- **git**
- **common**
- **environment**
- **Java OpenJDK 17**
- **PostgreSQL** (for SonarQube)
- **Other dependencies** such as package updates and permission setups

----

# Ansible Roles⭐

An Ansible role is a way of organizing tasks, variables, and handlers into reusable units.

Roles provide a structured way to break down and manage complex automation tasks in Ansible.

## Purpose of Ansible Roles

1. **Modularity and Reusability**:
   - Roles promote modularity by encapsulating related tasks and files into a single unit.
   - They facilitate code reuse across different projects or environments, reducing duplication and improving maintainability.

2. **Standardization and Consistency**:
   - Roles define a standardized structure and approach to configuration management, ensuring consistent deployments.
   - They enforce best practices and help maintain a predictable execution order for tasks.

3. **Simplification of Playbooks**:
   - By abstracting complex tasks into roles, playbooks become more concise and easier to understand.
   - Roles simplify playbook maintenance and improve readability.

4. **Encapsulation of Functionality**:
   - Each role typically represents a specific function or component of a system (e.g., web server, database server).
   - This encapsulation allows roles to be developed, tested, and reused independently.

5. **Parameterization and Flexibility**:
   - Roles support parameterization through variables, enabling customization based on different environments or requirements.
   - They provide flexibility to adapt roles to diverse use cases without extensive modifications.

6. **Integration with Ansible Galaxy**:
   - Ansible Galaxy facilitates the sharing and distribution of Ansible roles developed by the community.
   - Users can leverage pre-built roles from Ansible Galaxy to accelerate automation projects and deployment workflows.

### Using Ansible Roles

To use an Ansible role in your playbook, include it by its name within the `roles` section of your playbook YAML file. Ensure the role is correctly structured with `tasks`, `vars`, `handlers`, and other necessary directories.

---

## Ansible Structure🏗️

```bash
.
├── ansible.cfg
├── ansible-key.pem
├── inventory
├── playbook.yml
└── roles
    ├── common
    │   └── tasks
    │       └── main.yml
    ├── dependance
    │   └── main.yml
    ├── docker
    │   └── tasks
    │       └── main.yml
    ├── environment
    │   └── tasks
    │       └── main.yml
    ├── git
    │   └── tasks
    │       └── main.yml
    ├── java
    │   └── tasks
    │       └── main.yml
    ├── jenkins
    │   └── tasks
    │       └── main.yml
    ├── kubernetes
    │   └── tasks
    │       └── main.yml
    └── sonarqube
        ├── handlers
        │   └── main.yml
        ├── tasks
        │   └── main.yaml
        └── vars
            └── main.yml

```

<img width="795" alt="tree-of-ANSIBLE" src="https://github.com/user-attachments/assets/d5249b69-856f-4e0b-854a-7834799934b9" />

---

## Setup Steps📚

### 1.Create [inventory file](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/inventory): 

<img width="794" alt="inventory" src="https://github.com/user-attachments/assets/89e667ba-4bf8-4919-a04a-da4684162a72" />

---

### 2. create [playbook.yml](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/playbook.yml): 
To configure your playbook.yml file, you'll need to structure it in such a way that it pulls in the relevant roles and defines the host group for deployment. Based on the list of roles you provided and the host group slave, here is an example configuration for your playbook.yml file:

<img width="730" alt="ansible-playbook" src="https://github.com/user-attachments/assets/00ec6a04-2c40-4d69-946a-65e4c3bacea5" />

---
### 3.Create [ansible.cfg](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/ansible.cfg): 

<img width="759" alt="ansibleeeeee marwan cfgg" src="https://github.com/user-attachments/assets/7c5b2080-f36c-4fc1-8b37-a9d111912ff0" />

---

### 4. Create [Docker Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/docker/tasks/main.yml)

 ### - Install Docker:
 -  This role involves installing Docker from the official Docker repository.
 -  Docker is a platform that enables building, shipping, and running applications in containers
 - Installing Docker ensures the server is prepared to manage containerized applications.


<img width="785" alt="vimmdocker" src="https://github.com/user-attachments/assets/639e713b-c489-47eb-9bae-91b937ca90fa" />

---

### 5. Create [git Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/git/tasks/main.yml)

### - Install Git:
 - Git is a distributed version control system crucial for developers to clone repositories, track code changes, and collaborate effectively.
 - This role ensures Git is installed on the target server for seamless version control.

<img width="699" alt="gitt" src="https://github.com/user-attachments/assets/eb73052a-712e-4033-9d59-14387c0b04df" />

---

### 6. Create [jenkins Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/jenkins/tasks/main.yml)

### - Install Jenkins:
 - Jenkins, an open-source automation server, facilitates continuous integration and continuous delivery (CI/CD).
 - This role installs Jenkins on the server, enabling automated building, testing, and deployment of applications.

<img width="803" alt="jenkinss" src="https://github.com/user-attachments/assets/b500bd9c-1091-4055-b817-1e406c0221db" />

---

### 7. Create [common Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/common/tasks/main.yml)

  - Package Updates: Updates system packages to ensure the system is running with the latest available versions.
  - Install Essential Packages: Installs tools like curl and wget to ensure the necessary utilities are available

<img width="687" alt="commonn" src="https://github.com/user-attachments/assets/4d4fecfd-a85d-4679-81fd-f8974289324f" />

---

### 7. Create [dependance Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/dependance/tasks/main.yml)

 - Sets up configuration directories for Jenkins.
 - Changes permissions for the Docker socket file.
 - Copies the kube configuration for Jenkins.

<img width="790" alt="depppndd" src="https://github.com/user-attachments/assets/b823d96e-d21d-4e96-9576-b4cb36c29ca1" />

---

### 8. Create [kubernetes Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/kubernetes/tasks/main.yml)

#### -   Install Kubernetes CLI Tools:

 - kubectl: A command-line tool to interact with Kubernetes clusters, essential for deploying, managing, and troubleshooting applications. 
 - kind (Kubernetes in Docker): A tool for running Kubernetes clusters locally using Docker, ideal for testing and development without a full cloud setup.
 - this role ensures the necessary Kubernetes CLI tools are installed, equipping the server to interact effectively with Kubernetes clusters.

   <img width="779" alt="kuberrneteess" src="https://github.com/user-attachments/assets/db32c55c-a20a-453a-8944-c1da5cb4ecc8" />
---

### 9. Create [java Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/java/tasks/main.yml)

- Installs OpenJDK 17 to run Java-based applications.

<img width="801" alt="javaaa" src="https://github.com/user-attachments/assets/d53c5dec-0651-45f3-9e51-ab539bc1f696" />

---

### 10. Create [environment Role](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/environment/tasks/main.yml)

<img width="801" alt="environment" src="https://github.com/user-attachments/assets/feab1a92-5f9e-41ef-9afb-b2799c3b313d" />

---

### 11. Create [sonarqube Role](https://github.com/Marwan933/CloudDevOpsProject/tree/main/Ansible-final-project/roles/sonarqube)

- Installs PostgreSQL and configures it to work with SonarQube.
-  Installs SonarQube and configures it to use PostgreSQL as the database.
- Sets up SonarQube as a systemd service to start automatically.

├── [**tasks**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/sonarqube/tasks/main.yaml)
<br />
├── [**handlers**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/sonarqube/handlers/main.yml)
<br />
└── [**vars**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/Ansible-final-project/roles/sonarqube/vars/main.yml)

 ### 11.1- create tasks:

 - Installs PostgreSQL and configures it to work with SonarQube.
 - Installs SonarQube and configures it to use PostgreSQL as the database.
 - Sets up SonarQube as a systemd service to start automatically.

<img width="786" alt="vimmsonar11" src="https://github.com/user-attachments/assets/8e95068c-4ca4-4706-aa18-d36b201c4290" />

<img width="780" alt="vimmsonar22" src="https://github.com/user-attachments/assets/8cd336ef-d23f-4135-b92a-bc36427a7139" />

### 11.2- create handlers:

<img width="803" alt="handlersvim" src="https://github.com/user-attachments/assets/77836b65-e9d7-45b3-9f17-4eff329370b7" />

### 11.3- create vars:

In the ansible/roles/sonarqube/vars/main.yml file, modify the following variables to match your setup:

- postgres_root_user: The root PostgreSQL username
- postgres_root_pass: The root PostgreSQL password
- psql_sonar_username: PostgreSQL username for the SonarQube database
- psql_sonar_password: PostgreSQL password for the SonarQube database
- sonarqube_version: The version of SonarQube you want to install
- sonar_web_port: The port SonarQube will run on (default is 9000)

  <img width="797" alt="varsss" src="https://github.com/user-attachments/assets/8540f94b-df33-4b31-bc16-84395e76f56d" />

---

### 12. Run the Playbook:

Run the Ansible playbook to install and configure the systems:
```bash
ansible-playbook -i inventory playbook
```
<img width="796" alt="install git,common" src="https://github.com/user-attachments/assets/89c7d7f7-9253-441b-919b-ecfd25b603c2" />

<img width="799" alt="install jenkins java docker-output" src="https://github.com/user-attachments/assets/68f506ec-eefc-41cf-bcf3-2dd291f2ecfe" />

<img width="796" alt="install kubernetes" src="https://github.com/user-attachments/assets/84521eb2-2e11-4a6e-b64d-029ab3076c85" />

<img width="776" alt="install-docker" src="https://github.com/user-attachments/assets/378d6572-b6db-4120-9af8-4a67d5ea7fd7" />

<img width="793" alt="sonar-install" src="https://github.com/user-attachments/assets/f28ae053-5d0a-4ab2-adbf-2b68c0d222ba" />

And here, The output of All tasks:

<img width="794" alt="install-alltasks" src="https://github.com/user-attachments/assets/75ab439a-de6f-46bb-b58c-2942aa209f43" />

### The playbook will perform the following tasks:

- Install OpenJDK 17 for Java-based applications
- Install and configure Jenkins to run automatically
- Install SonarQube and configure it to use PostgreSQL as the database
- Install Kubernetes CLI tools like kubectl and kind
- Set up dependencies and required files for each service

---

### 13. Verify the Installation
After running the playbook, verify that the services are running correctly:

## Jenkins
 - Open your browser and go to http://<your_ec2_instance_ip>:8080
 - Follow the instructions to complete the Jenkins setup.
   
## Kubernetes
- To verify kubectl installation, use the following command:
```bash
kubectl version --client
```
To verify kind installation, use the command:
```bash
kubectl version 
```

## SonarQube
- Open your browser and go to http://<your_ec2_instance_ip>:9000
- Default login credentials:
  Username: admin
  Password: admin

<img width="869" alt="loginsonar" src="https://github.com/user-attachments/assets/46e9a283-3888-4764-ba0f-408e15e4b600" />

<img width="954" alt="into-sonar-gui" src="https://github.com/user-attachments/assets/866a19fe-b25d-4f75-94bf-20fd973036f4" />

----
## Troubleshooting Guide 🔍

Common Issues:

- 1.Service Won't Start
  - Check Java installation
  - Verify port availability
  - Review service logs

- 2.Access Problems

  - Check firewall settings
  - Verify port configuration
  - Confirm network access

- 3.Installation Failures

  - Verify dependencies
  - Check disk space
  - Review package repository

 - 4.Memory Problems

    - Check Java options
    - Monitor heap usage
    - Verify system resources

- 5.Permission Errors

   - Verify user/group
   - Check directory permissions
  - Review log files

- 6.Database Connection
   
   - Verify credentials
   - Check connectivity
  - Review database logs

 ---
 
## **important note:**🎯

- we should edit in the configuration file of sonarqube by using this command:
  
```bash
  sudo vim /opt/sonarqube-9.6.1.59531/conf/sonar.properties
```

<img width="960" alt="sonarprop-2" src="https://github.com/user-attachments/assets/f8f94369-a501-4cd3-a62d-46a133b44579" />

<img width="960" alt="sonar prop" src="https://github.com/user-attachments/assets/bf894e8f-42e2-4b91-a311-9df2e8f00b29" />


### Done..!☕
