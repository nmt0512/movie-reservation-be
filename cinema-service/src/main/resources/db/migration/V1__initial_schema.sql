CREATE TABLE cinema (
  cinema_id INT AUTO_INCREMENT NOT NULL,
   created_at datetime NULL,
   updated_at datetime NULL,
   created_by VARCHAR(255) NULL,
   updated_by VARCHAR(255) NULL,
   cinema_name VARCHAR(255) NOT NULL,
   `description` VARCHAR(255) NULL,
   CONSTRAINT pk_cinema PRIMARY KEY (cinema_id)
);

CREATE TABLE seat (
  seat_id INT AUTO_INCREMENT NOT NULL,
   created_at datetime NULL,
   updated_at datetime NULL,
   created_by VARCHAR(255) NULL,
   updated_by VARCHAR(255) NULL,
   seat_code VARCHAR(255) NOT NULL,
   cinema_id INT NULL,
   CONSTRAINT pk_seat PRIMARY KEY (seat_id)
);

ALTER TABLE seat ADD CONSTRAINT FK_SEAT_ON_CINEMA FOREIGN KEY (cinema_id) REFERENCES cinema (cinema_id);