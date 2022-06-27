--Enter the INNER JOIN query, where we can see the names of the city (city) and country (country) located in the city table and country table together.
SELECT city, country FROM city
INNER JOIN country
ON city.country_id = country.country_id

--Enter the INNER JOIN query, where we can see the names first_name and last_name in the customer table together with the payment_id in the customer table and the first_name in the customer table.
SELECT payment_id, first_name, last_name FROM payment
INNER JOIN customer
ON payment.customer_id = customer.customer_id

--Enter the INNER JOIN query, where we can see the names first_name and last_name in the customer table together with the rental_id in the customer table and the rental table.
SELECT rental_id, first_name, last_name FROM rental
INNER JOIN customer
ON customer.customer_id = rental.customer_id