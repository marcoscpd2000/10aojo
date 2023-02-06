CREATE TABLE `assistances` (
                               `id` bigint NOT NULL AUTO_INCREMENT,
                               `description` varchar(300) NOT NULL,
                               `name` varchar(100) NOT NULL,
                               PRIMARY KEY (`id`)
) ;

INSERT INTO assistances (name, description) VALUES ('TROCA DE APARELHO', 'TROCAR EQUIPAMENTO COMPLETO');
INSERT INTO assistances (name, description) VALUES ('TROCA DE CABO', 'TROCAR CABO');
INSERT INTO assistances (name, description) VALUES ('MANUTENCAO DE MAQUINA', 'FORMAT C');
INSERT INTO assistances (name, description) VALUES ('SOFTWARE', 'MUDAR OFFICE');