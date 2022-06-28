--The length of the film is shown in the length column in the film table. How many films are there that are longer than the average film length?
SELECT COUNT(*) FROM film
WHERE length > 
(
    SELECT AVG(length) FROM film
);

--How many films have the highest rental_rate value in the film table?
SELECT COUNT(*) FROM film
WHERE rental_rate = 
(
    SELECT MAX(rental_rate) FROM film
);

--In the film table, sort the films with the lowest rental_rate and the lowest replacement_cost.
SELECT title FROM film
WHERE rental_rate = 
(
    SELECT MIN(rental_rate) FROM film
) AND replacement_cost = 
(
    SELECT MIN(replacement_cost) FROM film
)
ORDER BY film_id ASC;

--In the payment table, sort the customers who make the most purchases.
SELECT COUNT(payment_id), customer.customer_id, customer.first_name FROM payment
LEFT JOIN customer ON payment.customer_id = customer.customer_id
GROUP BY customer.customer_id
ORDER BY COUNT(payment_id) DESC;


