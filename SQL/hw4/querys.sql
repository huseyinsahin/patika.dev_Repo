--Sort the different values in the replacement_cost column in the movie table.
SELECT DISTINCT replacement_cost FROM film;

--How many different data are there in the replacement_cost column in the film table?
SELECT COUNT(DISTINCT replacement_cost) FROM film;

--How many of the film titles in the film table start with the character T and at the same time the rating is equal to 'G'?
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' AND rating = 'G';

--How many of the country names (country) in the country table consist of 5 characters?
SELECT COUNT(*) FROM country
WHERE country LIKE '_____';

--How many of the city names in the city table end with the character 'R' or r?
SELECT COUNT(*) FROM city
WHERE city ILIKE '%r';

