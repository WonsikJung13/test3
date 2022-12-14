CREATE DATABASE prj1;
USE prj1;
CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
    content VARCHAR(1000) NOT NULL
);
SELECT * FROM Board ORDER BY 1 DESC;

-- 작성자 컬럼 추가
ALTER TABLE Board
ADD COLUMN writer VARCHAR(255) NOT NULL;
DESC Board;

-- 작성일시 컬럼 추가
ALTER Table Board
ADD COLUMN inserted DATETIME NOT NULL DEFAULT NOW();


-- 여러 게시물 추가하기
INSERT INTO Board (title, content, writer)
SELECT title, content, writer FROM Board;

SELECT COUNT(*) FROM Board;

-- page 처리 쿼리
SELECT
	*
FROM
	Board
ORDER BY id DESC
LIMIT 20, 10; -- ?1 : 어디서부터(0-base), 
              -- ?2 : 몇 개

-- 검색 쿼리
SELECT * 
FROM Board
WHERE title LIKE '%프링%'
   OR content LIKE '%프링%'
   OR writer LIKE '%프링%';

-- 댓글 테이블 만들기
CREATE TABLE Reply (
	id INT PRIMARY KEY AUTO_INCREMENT,
	boardId INT NOT NULL,
    content VARCHAR(1000) NOT NULL,
    inserted DATETIME DEFAULT NOW(),
    FOREIGN KEY (boardId) REFERENCES Board(id)
);
DESC Reply;
SELECT * FROM Reply ORDER BY 1 DESC;















