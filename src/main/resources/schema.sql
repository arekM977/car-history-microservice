CREATE TABLE VEHICLE (
    id LONG NOT NULL AUTO_INCREMENT,
    make VARCHAR(400),
    model VARCHAR(400),
    vin VARCHAR(400),
    PRIMARY KEY (id)
);

CREATE TABLE REPAIR (
    id LONG NOT NULL AUTO_INCREMENT,
    vehicle_id LONG NOT NULL,
    repair_description VARCHAR(2000) NULL,
    date_of_repair timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE INSPECTION (
    id LONG NOT NULL AUTO_INCREMENT,
    vehicle_id LONG NOT NULL,
    error_description VARCHAR(2000) NULL,
    date_of_inspection timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE ACCIDENT (
    id LONG NOT NULL AUTO_INCREMENT,
    vehicle_id LONG NOT NULL,
    description VARCHAR(2000) NULL,
    date_of_accident timestamp,
    PRIMARY KEY (id)
);