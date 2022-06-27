--Enter the LEFT JOIN query, where we can see the names of the city (city) and country (country) located in the city table and the country table together.
SELECT city, country FROM city
LEFT JOIN country
ON city.country_id = country.country_id

--Enter the RIGHT JOIN query, where we can see the customer table and the payment_id in the payment table and the first_name and last_name names in the customer table together.
SELECT payment_id, first_name, last_name FROM payment
RIGHT JOIN customer
ON customer.customer_id = payment.customer_id

--Enter the FULL JOIN query, where we can see the names first_name and last_name in the customer table together with the rental_id in the customer table and the rental table.
SELECT rental_id, first_name, last_name FROM customer
FULL OUTER JOIN rental
ON customer.customer_id = rental.customer_id