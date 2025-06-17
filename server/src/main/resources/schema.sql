CREATE TABLE IF NOT EXISTS book
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(100),
    isbn VARCHAR(20) UNIQUE,
    description TEXT,
    image TEXT,
    price DECIMAL(10, 2),
    available_copies INT DEFAULT 0
);
