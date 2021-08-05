DELETE FROM comment;
DELETE FROM user;
DELETE FROM topic;
INSERT INTO user(ID, USERNAME, PASSWORD) VALUES
(1, 'anacprocha', 'ac2021'),
(2, 'zemaria', 'ac2021'),
(3, 'catpereira', 'ac2021'),
(4, 'diiipinto', 'ac2021'),
(5, 'megoo', 'ac2021');

INSERT INTO topic(ID, NAME, OPTIONANAME, OPTIONA, OPTIONBNAME, OPTIONB, TOTALVOTES, IMAGEPATH, DESCRIPTION) VALUES
(1, 'Pineapple Pizza', 'Pizza with pineapple', 33, 'Pizza without pineapple', 33, 66, 'resources/images/pineapple-pizza.jpg', 'Description'),
(2, 'Socks with Shoes', 'Sock Sock. Shoe Shoe', 34, 'Sock Shoe. Sock Shoe', 34, 68, 'resources/images/sock-shoe.jpg', 'Description'),
(3, 'Cereals and Milk', 'Cereals first', 33, 'Milk first', 33, 66, 'resources/images/cereals-milk.jpg', 'Description'),
(4, 'Family Tree', 'Siblings', 33, 'Not Siblings', 33, 66, 'resources/images/siblings.jpg', 'Description'),
(5, 'Carneiro', 'Cordeiro', 33, 'Caseiro', 33, 66, 'resources/images/carneiro.jpg', 'Description'),
(6, 'Who came first', 'Chicken', 33, 'Egg', 33, 66, 'resources/images/chicken-egg.jpg', 'Description'),
(7, 'Zebras', 'White with black stripes', 33, 'Black with white stripes', 33, 66, 'resources/images/zebra.jpg', 'Description'),
(8, 'Clap clap for Igreja', 'Clap Clap', 33, 'Enjoy the Silence', 33, 66, 'resources/images/igreja.jpg', 'Description'),
(9, 'Soda Wars', 'Coke', 34, 'Pepsi', 34, 68, 'resources/images/soda.jpg', 'Description'),
(10, 'Kitchenware', 'Cada panela com o seu testo', 34, 'Cada testo uma panela', 34, 68, 'resources/images/kitchenware.jpg', 'Description'),
(11, 'Stream and Chill', 'Netflix', 34, 'HBO', 34, 68, 'resources/images/stream.jpg', 'Description'),
(12, 'TV Hosts', 'Cristina Ferreira', 34, 'Goucha', 34, 68, 'resources/images/tv-host.jpg', 'Description'),
(13, 'GOAT', 'Ronaldo', 34, 'Messi', 34, 68, 'resources/images/goat.jpg', 'Description'),
(14, 'Best Repo', 'GitLab', 34, 'GitHub', 34, 68, 'resources/images/repo.jpg', 'Description'),
(15, 'Txt Editor', 'Emacs', 34, 'Vim', 34, 68, 'resources/images/txt-editor.jpg', 'Description');

INSERT INTO comment(ID, NUMBERLIKES, NUMBERDISLIKES, TOTALPOINTS, USER_ID, TOPIC_ID, CONTENT) VALUES
(1, 10, 3, 7, 1,1,'comment' ),
(2, 10, 3, 7, 1,2,'comment' ),
(3, 10, 3, 7, 2,4,'comment' ),
(4, 10, 3, 7, 3,5,'comment' ),
(5, 10, 3, 7, 4,3,'comment' ),
(6, 10, 3, 7, 5,1,'comment' ),
(7, 10, 3, 7, 1,3,'comment' ),
(8, 10, 3, 7, 2,4,'comment' ),
(9, 10, 3, 7, 3,5,'comment' ),
(10, 10, 3, 7, 4,2,'comment' );
















