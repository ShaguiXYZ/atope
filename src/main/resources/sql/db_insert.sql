/*
-- Query: SELECT * FROM atopesys.users
LIMIT 0, 1000

-- Date: 2019-02-27 11:40
*/
INSERT INTO `atopesys.users` (`id`,`username`,`password`,`enabled`) VALUES (1,'system','$2a$10$K7A7czHCz/pCUBplHfQNEOVFUOI7RxlDMl.GUAg0f8j2CWNQtHhsi',1);
INSERT INTO `atopesys.users` (`id`,`username`,`password`,`enabled`) VALUES (2,'atope','$2a$10$fHNlmchC96FokLtNU2qf3OtM7fYU8P3PVT/l9iN2wJvLlRxyTwlEO',1);

/*
-- Query: SELECT * FROM atopesys.roles
LIMIT 0, 1000

-- Date: 2019-02-27 11:44
*/
INSERT INTO `atopesys.roles` (`id`,`name`) VALUES (1,'ROLE_ADMIN');
INSERT INTO `atopesys.roles` (`id`,`name`) VALUES (2,'ROLE_USER');

/*
-- Query: SELECT * FROM atopesys.authorities
LIMIT 0, 1000

-- Date: 2019-02-27 11:45
*/
INSERT INTO `atopesys.authorities` (`id`,`user_id`,`authority`) VALUES (8,1,'ROLE_ADMIN');
INSERT INTO `atopesys.authorities` (`id`,`user_id`,`authority`) VALUES (9,1,'ROLE_USER');
INSERT INTO `atopesys.authorities` (`id`,`user_id`,`authority`) VALUES (10,2,'ROLE_USER');

/*
-- Query: SELECT * FROM atopesys.personas
LIMIT 0, 1000

-- Date: 2019-02-27 11:46
*/
INSERT INTO `atopesys.persona` (`id`,`user_id`,`nombre`,`apellido1`,`apellido2`,`mail`,`fecha_alta`,`fecha_baja`) VALUES (1,1,'administrador',NULL,NULL,'system@atope',NULL,NULL);
INSERT INTO `atopesys.persona` (`id`,`user_id`,`nombre`,`apellido1`,`apellido2`,`mail`,`fecha_alta`,`fecha_baja`) VALUES (2,2,'usuario',NULL,NULL,'atope@atope',NULL,NULL);
