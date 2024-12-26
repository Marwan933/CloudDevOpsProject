# Terraform Modules🚀

Terraform modules are a fundamental component of Terraform's architecture, enabling you to organize, reuse, and manage your infrastructure as code (IaC) efficiently. Instead of writing all your Terraform code in a single file, modules allow you to encapsulate and abstract away common configurations, making your Terraform code more modular, reusable, and maintainable.

# Benefits of Using Terraform Modules⭐

1-Reusability: Modules allow you to define common infrastructure components once and reuse them across multiple environments or projects. This reduces duplication and ensures consistency in your infrastructure.

2- Organization: By breaking down your Terraform configuration into modules, you can organize your code in a logical and manageable way. This makes it easier to navigate, understand, and maintain your infrastructure code.

3- Abstraction: Modules provide a way to encapsulate implementation details, exposing only the necessary inputs and outputs. This abstraction simplifies the usage of complex infrastructure components and reduces the potential for errors.

4- Maintainability: With modules, you can update and maintain your infrastructure code more easily. Changes to a module can be propagated to all places where the module is used, ensuring consistency and reducing the effort required to make updates.

5-Collaboration: Modules make it easier for teams to collaborate on infrastructure code. Each team member can work on different modules independently, reducing conflicts and improving productivity.


# Terraform Structure🏗️

<img width="600" alt="tree final terraform-marwanhesham" src="https://github.com/user-attachments/assets/f5d1114a-8d50-4f02-a68c-a0a25974c55a" />

## Create Terraform Modules📚

### 1.Create Vpc Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/vpc/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/vpc/variables.tf)

#### 1.1. main.tf file:

<img width="510" alt="vpcmainmarwan" src="https://github.com/user-attachments/assets/9ad3075c-cefd-4a68-9165-d38f7ba14fb8" />

#### 1.2. variables.tf file:

<img width="321" alt="vpcvarmarwan" src="https://github.com/user-attachments/assets/bb26e7a1-fccd-4b02-8277-956e24748c93" />

--- 

### 2.Create IGW Module And Route table:


├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/internet-gateway/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/internet-gateway/variables.tf)

#### 2.1. main.tf file:
<img width="670" alt="igw,rtmarwan" src="https://github.com/user-attachments/assets/8ca37916-836b-497f-a795-f96cf96b7b39" />

The Output Of Igw and Rt

<img width="385" alt="outputrt,igwmarwan" src="https://github.com/user-attachments/assets/6bcafa34-0999-47ed-90c8-2c18078c0f3a" />

#### 2.2. variables.tf file:

<img width="794" alt="igwvarsmarwan" src="https://github.com/user-attachments/assets/90598e1f-3cb0-4fad-9834-ad391eb54167" />

---

### 3.Create Subnet Module:


├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/subnet/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/subnet/variables.tf)

#### 3.1. main.tf file:

<img width="795" alt="subnetmarwan" src="https://github.com/user-attachments/assets/30a305c9-b1b0-4fc1-b986-77f6c515274a" />

#### 3.2. variables.tf file

<img width="539" alt="varssub marwan" src="https://github.com/user-attachments/assets/d94d3a0e-5b4f-43db-a6f9-ae3472fc1638" />

---

#### 4.Create Security Group Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/security-group/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/security-group/variables.tf)

#### 4.1. main.tf file:

<img width="714" alt="sgmarwan" src="https://github.com/user-attachments/assets/0de81013-1e37-43b9-8b57-5500a3d2fa1f" />


#### 4.2. variables.tf file

<img width="792" alt="sgvarsmarwan" src="https://github.com/user-attachments/assets/41f1e501-c473-4a41-aaaf-8a3bf3e1de1b" />

---

### 5. Create EC2 Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/ec2/main.tf)
<br />
├── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/ec2/variables.tf)
<br />
└── [**output.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/ec2/outputs.tf)

#### 5.1. main.tf file:

<img width="796" alt="ec2main marwan" src="https://github.com/user-attachments/assets/d4848812-e07b-4732-b6e6-e04c40ba34dd" />

<img width="795" alt="ec2main--marwan" src="https://github.com/user-attachments/assets/fb8c3c8e-99ef-48bc-8150-8d12ff1afbdc" />


#### 5.2. variables.tf:

<img width="609" alt="varsmarwan" src="https://github.com/user-attachments/assets/898a2b40-7a25-46a1-a19c-23959bfa5bdd" />


#### 5.3. output.tf

<img width="791" alt="opec2,marwan" src="https://github.com/user-attachments/assets/68e65fcf-90c8-4d56-9915-fb8b33d3c1e8" />

---

### 6. Create Cloudwatch Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/cloudwatch/main.tf)
<br />
├── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/cloudwatch/variables.tf)

#### 6.1. main.tf file:

<img width="792" alt="cloudwatch main marwan" src="https://github.com/user-attachments/assets/b646a45e-687c-45d7-baa8-955110651fdc" />

#### 6.2. variables.tf:

<img width="797" alt="vars cloudmarwan" src="https://github.com/user-attachments/assets/b3d0b1b4-53e7-4d93-a884-036f65323c7a" />

---

### 7. create main.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/main.tf)

<img width="795" alt="main tffmarwan" src="https://github.com/user-attachments/assets/d0d701b1-34e0-49b5-896d-27627b20f6a0" />

<img width="792" alt="main 22marwan" src="https://github.com/user-attachments/assets/87658c3c-876d-4e1f-a26b-5e895fa7452c" />

---

### 8. create variables.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/variables.tf)

<img width="797" alt="vars1marwan" src="https://github.com/user-attachments/assets/6b8df88d-6ddf-407b-85a9-7c0fa30e2538" />

<img width="786" alt="vars2marwan" src="https://github.com/user-attachments/assets/00c14df3-eaa2-410f-8ac5-3f16423d2d66" />

---

### 9. create terraform.tfvars

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/terraform.tfvars)

<img width="793" alt="tfvars marwan" src="https://github.com/user-attachments/assets/1f936b2d-df55-4527-b696-373783beb537" />

---

### 10. create backend.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/backend.tf)


<img width="790" alt="backend marwan" src="https://github.com/user-attachments/assets/72af87ec-a0bf-4024-8eb8-f277abf10169" />

---

### 11. create output.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/outputs.tf)

<img width="796" alt="outputmarwan" src="https://github.com/user-attachments/assets/102bfbc9-c28f-43ac-a318-453224dadddf" />

---

### After Creating the Terraform Modules run it using this commands
```bash
terraform init
```
### terraform init Purpose:

terraform init initializes a new or existing Terraform configuration.
It initializes the working directory containing Terraform configuration files (*.tf files).
During initialization, Terraform downloads the necessary providers and modules specified in the configuration files.
This command prepares the environment for Terraform to manage your infrastructure.

```bash
terraform plan
```
### terraform plan Purpose:

terraform plan generates an execution plan for Terraform.
It compares the current state of the infrastructure (as recorded by Terraform state) with the desired state defined in your configuration files.
This command calculates and shows the changes that Terraform will apply when you run 

```bash
terraform apply
```
### terraform apply Purpose:

terraform apply applies the changes required to achieve the desired state defined in your Terraform configuration.
It creates, modifies, or deletes resources as necessary to match the configuration.
This command executes the execution plan generated by terraform plan.
It interacts with the cloud provider APIs or other infrastructure components to make the desired changes.

---

## Troubleshooting🔍
- Ensure your AWS credentials are correctly configured.
- Check for any syntax errors in the Terraform files.
- Review logs in the AWS Management Console if resources fail to provision.

---
