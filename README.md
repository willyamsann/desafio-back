# desafio Lista de Tarefas 1

 
 Proposto por: Accenture
 Autor: Willyam Santos
 
 # Back-End
 
 # Desafio

A empresa ACME decidiu criar uma lista de tarefas e a área de negócio definiu que o MVP deve
conter apenas as funcionalidades abaixo:
▪ Criar a lista
▪ Adicionar item à lista
▪ Remover item da lista
▪ Marcar item como concluído

# Ferramentas Dev

- VS Code
- PostMan
- PostMan
- MySQL WorkBeach

# Desenvolvimento

- SpringBoot 2.3.3
- Maven - Gerenciador
- MySQL
- Docker
- Lombok


# Depedencias Spring

- Web
- JPA
- MySQL
- JBDC
- Hibernate
- Lombok

# Tabela Mysql
CREATE TABLE `chaves`.`lista` (
 `id` INT NOT NULL,
 `name` VARCHAR(255) NULL,
 `status` VARCHAR(255) NULL,
 PRIMARY KEY (`id`));

 ALTER TABLE `chaves`.`lista`
 CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
 ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);
