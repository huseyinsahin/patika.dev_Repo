--What is the average of the values in the rental_rate column in the film table?
SELECT AVG(rental_rate) FROM film

--How many of the films in the film table start with the character 'C'?
SELECT COUNT(*) FROM film
WHERE title LIKE 'C%'

--How many minutes is the longest (length) film with rental_rate equal to 0.99 among the films in the film table?
SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;

--How many different replacement_cost values are there for the films longer than 150 minutes in the film table?
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;