CREATE TABLE POST (
    id LONG NOT NULL AUTO_INCREMENT,
    title VARCHAR(400),
    content VARCHAR(2000),
    created timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE VEHICLE (
    id LONG NOT NULL AUTO_INCREMENT,
    title VARCHAR(400),
    content VARCHAR(2000),
    created timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE COMMENT (
    id LONG NOT NULL AUTO_INCREMENT,
    post_id LONG NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE REPAIR (
    id LONG NOT NULL AUTO_INCREMENT,
    vehicle_id LONG NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE INSPECTION (
    id LONG NOT NULL AUTO_INCREMENT,
    vehicle_id LONG NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE ACCIDENT (
    id LONG NOT NULL AUTO_INCREMENT,
    vehicle_id LONG NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp,
    PRIMARY KEY (id)
);