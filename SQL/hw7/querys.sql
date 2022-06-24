--Group the films in the film table according to their rating values.
SELECT rating, COUNT(*) FROM film
GROUP BY rating;

--When we group the films in the film table according to the replacement_cost column, sort the replacement_cost value and the corresponding number of films whose number of films is more than 50.
SELECT replacement_cost, COUNT(*) FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;

--What are the customer counts corresponding to the store_id values in the customer table?
SELECT store_id, COUNT(*) FROM customer
GROUP BY store_id;

--After grouping the city data in the city table according to the country_id column, share the country_id information and the number of cities with the largest number of cities.
SELECT country_id, COUNT(*) FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;