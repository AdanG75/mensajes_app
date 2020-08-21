drop database if exists mensajes_app;
create database mensajes_app;
use mensajes_app;

CREATE TABLE IF NOT EXISTS Mensajes (
  id_mensaje 		INT(7) NOT NULL AUTO_INCREMENT,
  mensaje 			VARCHAR(280) NOT NULL,
  autor_mensaje 	VARCHAR(50) NOT NULL,
  fecha_mensaje 	TIMESTAMP NOT NULL,
  
  PRIMARY KEY (`id_mensaje`)
)ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

show databases;