## Technical design 

### Table of content 

- [Implementation languages]()
- [Implamentation framework]()
- [Data storage plan]()
- [Entity relatioship diagram]()
- [Entity/Field description]()
- [Data examples]()
- [Database seed data]()
- [Authentication/Authorization plan]()
- [Coding style guide]()

## Implementation language

The SSP store sales project will be implemented using Java. I choose Java due to it's security and scalability which will come in handy when handling transactions on an e-commerce website. In addition to feeling confortable writing code in java, the programming language is widely used in building website that are secure and reliable.

## Implementation framework 

This program's implimentation language will be pair with the following frameworks:

- Springboot is a versitile framework that steamlines and accelarates the production of a program due to the auto-configuation feature which will save a great amount when setting up to implement the project.
- Maven is a production management tool  that helps with the enforcement of the structure of the project by : compile, test and package track.

## Data storage plan 

This project will be using SQLite for the database storage plan due to the fact it is perfect for small to meduim scale e-commerce websites while being able to add development or test the program 

## Entity relationship diagram 

Using mermaid, i have create an ERD using crows foot notation which will show you the connection between the entities of the website. use the following [link](/TechnicalDesign/assets/entity-relationship-diagram.md) to access a picture of the ERD created for this program.

## Table of field descriptions for each entity 

- Admin
<img width="1544" height="548" alt="image" src="https://github.com/user-attachments/assets/ed8388f6-e89f-4509-b8fc-bdcb5818fd9f" />

- Customer 
<img width="1608" height="430" alt="image" src="https://github.com/user-attachments/assets/e4403228-a2df-483c-91c3-39040362f19d" />

- Login
<img width="1522" height="500" alt="image" src="https://github.com/user-attachments/assets/11fb2141-ecb4-4be2-be23-8de6fb0d9c48" />

- inventory
  <img width="1282" height="1012" alt="image" src="https://github.com/user-attachments/assets/364db5b6-7648-4969-b8a9-7b46e12af7d8" />

- Search
  <img width="1244" height="560" alt="image" src="https://github.com/user-attachments/assets/5ae1b63e-9f56-4992-973a-4382b7037bf8" />

- Sign up
  <img width="1262" height="478" alt="image" src="https://github.com/user-attachments/assets/9173a601-3ddd-4347-925b-33f3c5d31c22" />

- Shopping cart
  <img width="1244" height="770" alt="image" src="https://github.com/user-attachments/assets/6fa377ea-ae19-41ea-aec7-554b53e8dd1e" />

- Checkout
  <img width="1168" height="1112" alt="image" src="https://github.com/user-attachments/assets/e756325e-ee11-4698-b4c6-67ff2f623615" />

- Receipt
  <img width="1212" height="1092" alt="image" src="https://github.com/user-attachments/assets/4198a582-261c-4d74-a6ca-49c2de615166" />

- Sales report
  <img width="1186" height="390" alt="image" src="https://github.com/user-attachments/assets/526962fd-8f32-4e8d-8a6f-f066a5eead72" />


