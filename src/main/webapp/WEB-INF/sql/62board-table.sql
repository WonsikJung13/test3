CREATE DATABASE prj1;
USE prj1;
CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
    content VARCHAR(1000) NOT NULL
);
SELECT * FROM Board ORDER BY 1 DESC;

ALTER TABLE Board
ADD COLUMN writer VARCHAR(255) NOT NULL;



