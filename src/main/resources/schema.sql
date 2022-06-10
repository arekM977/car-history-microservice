CREATE TABLE POST (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    title VARCHAR(400),
    content VARCHAR(2000),
    created timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE COMMENT (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    post_id INTEGER NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp,
    PRIMARY KEY (id)
);

ALTER TABLE COMMENT
 ADD CONSTRAINT comment_post_id
 FOREIGN KEY (post_id) REFERENCES post(id)