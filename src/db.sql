CREATE TABLE passengers (
    passenger_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    passport_number VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE flights (
    flight_id SERIAL PRIMARY KEY,
    flight_number VARCHAR(10) UNIQUE NOT NULL,
    destination VARCHAR(50) NOT NULL,
    capacity INT CHECK (capacity > 0)
);

CREATE TABLE bookings (
    booking_id SERIAL PRIMARY KEY,
    passenger_id INT REFERENCES passengers(passenger_id),
    flight_id INT REFERENCES flights(flight_id),
    seat_number VARCHAR(5)
);
INSERT INTO passengers (name, passport_number) VALUES
                                                   ('Ayan', 'P12345'),
                                                   ('Dana', 'P54321'),
                                                   ('Ali', 'P67890');

INSERT INTO flights (flight_number, destination, capacity) VALUES
                                                               ('KC101', 'Almaty', 180),
                                                               ('KC102', 'Astana', 160),
                                                               ('KC103', 'Madrid', 200);
INSERT INTO bookings (passenger_id, flight_id, seat_number) VALUES
                                                                (1, 1, '12A'),  -- Ayan на KC101
                                                                (2, 2, '18C'),  -- Dana на KC102
                                                                (3, 3, '5B');   -- Ali на KC103

SELECT * FROM passengers;
SELECT * FROM flights;
SELECT * FROM bookings;

UPDATE flights SET capacity = 200 WHERE flight_id = 1;

