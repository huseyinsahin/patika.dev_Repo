--Sort all the data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer;

--Sort the intersecting data for the first_name columns in the actor and customer tables.
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

--For the first_name columns in the actor and customer tables, sort the data in the first table that is not in the second table.
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;

--Let's also do the first 3 queries for repeating data.
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;

SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;