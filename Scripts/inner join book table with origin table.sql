SELECT Genre, YearOfPublication, Publisher
FROM origin
INNER JOIN book 
ON book.Isbn=origin.Isbn;