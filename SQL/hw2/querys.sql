--sort the data in all columns in the film table provided that the replacement cost value is greater than or equal to 12.99 and less than or equal to 16.99. (Use the BETWEEN - AND construct.)
SELECT * FROM film
WHERE replacement_cost BETWEEN 12.99 AND 16.99;

--Sort the data in the first_name and last_name columns in the actor table provided that first_name is 'Penelope' or 'Nick' or 'Ed'. (Use the IN operator.)
SELECT first_name, last_name FROM actor
WHERE first_name IN ('Penelope','Nick','Ed');

--sort the data in all the columns in the film table with the conditions that rental_rate is 0.99, 2.99, 4.99 AND replacement_cost is 12.99, 15.99, 28.99.(Use the IN operator.)
SELECT * FROM film
WHERE rental_rate IN (0.99,2.99,4.99) AND replacement_cost IN (12.99, 15.99, 28.99);