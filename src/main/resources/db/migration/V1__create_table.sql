CREATE TABLE `note_database`.`notes` (
                                         `id` INT NOT NULL AUTO_INCREMENT,
                                         `titles` VARCHAR(300) NOT NULL,
                                         `contents` VARCHAR(700) NOT NULL,
                                         PRIMARY KEY (`id`));