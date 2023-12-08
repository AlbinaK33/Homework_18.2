CREATE TABLE `note_database`.`users` (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         username VARCHAR(50),
                                         password VARCHAR(500),
                                         enabled BOOLEAN);