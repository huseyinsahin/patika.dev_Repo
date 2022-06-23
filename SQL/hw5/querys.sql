--Sort the 5 longest films in the film table that end with the 'n' character of the film name (title).
SELECT title FROM film
WHERE title LIKE '%n'
ORDER BY length DESC
LIMIT 5;

--Sort the second 5 shortest (length) films (6,7,8,9,10) in the film table that end with the 'n' character of the film name(title).
SELECT title FROM film
WHERE title LIKE '%n'
ORDER BY length ASC
OFFSET 5
LIMIT 5;

--Sort the first 4 data, provided that store_id is 1 in the descending order according to the last_name column in the customer table.
SELECT last_name, store_id FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4