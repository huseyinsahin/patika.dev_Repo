--Sort the country names in the country column in the country table, starting with the 'A' character and ending with the 'a' character.
SELECT country FROM country
WHERE country LIKE 'A%a'

--Sort the country names in the country column in the country table that consist of at least 6 characters and end with an 'n' character.
SELECT country FROM country
WHERE country LIKE '%_____n'

--Sort the film names containing the 'T' character regardless of whether they are at least 4 uppercase or lowercase letters from the film names in the title column in the film table.
SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%'


--Sort the data in all columns in the film table starting with the character title 'C' and length (length) greater than 90 and rental_rate 2.99 from the data in all columns.
SELECT * FROM film
WHERE title LIKE 'C%'AND length > 90 AND rental_rate = 2.99;