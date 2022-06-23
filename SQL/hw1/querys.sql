--Sort the data in the title and description columns in the movie table.
SELECT title, description FROM film;

--Sort the data in all columns in the movie table with the movie length greater than 60 and less than 75.
SELECT * FROM film
WHERE length > 60 AND length < 75;

--Sort the data in all columns in the movie table with rental_rate 0.99 and replacement_cost 12.99 or 28.99.
SELECT * FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);

--What is the value in the last_name column of the customer whose value is 'Mary' in the first_name column of the customer table?
SELECT last_name FROM customer
WHERE first_name = 'Mary';

--Sort the data in the movie table that is not have a length greater than 50 and also rental_rate is not 2.99 or 4.99.
SELECT * FROM film
WHERE NOT length > 50 AND NOT(rental_rate = 2.99 OR rental_rate = 4.99);

