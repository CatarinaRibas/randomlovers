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
(1, 'Pineapple Pizza', 'Pizza with pineapple', 33, 'Pizza without pineapple', 33, 66, 'resources/images/pineapple-pizza.jpg', 'Lets make it serious,. Your pizza is with or without pineapple? '),
(2, 'Socks with Shoes', 'Sock Sock. Shoe Shoe', 34, 'Sock Shoe. Sock Shoe', 34, 68, 'resources/images/sock-shoe.jpg', 'You´´e getting ready in the morning, in which order do you put your socks and shoes?'),
(3, 'Cereals and Milk', 'Cereals first', 33, 'Milk first', 33, 66, 'resources/images/cereals-milk.jpg', 'Cereals or milk? Which goes first to the bowl?'),
(4, 'Family Tree', 'Siblings', 33, 'Not Siblings', 33, 66, 'resources/images/siblings.jpg', 'When you look at this two '),
(5, 'Carneiro', 'Cordeiro', 33, 'Caseiro', 33, 66, 'resources/images/carneiro.jpg', 'Description'),
(6, 'Who came first', 'Chicken', 33, 'Egg', 33, 66, 'resources/images/chicken-egg.jpg', 'Description'),
(7, 'Black and White', 'White with black stripes', 33, 'Black with white stripes', 33, 66, 'resources/images/zebra.jpg', 'Description'),
(8, 'Clap clap for Igreja', 'Clap Clap', 33, 'Enjoy the Silence', 33, 66, 'resources/images/igreja.jpg', 'Description'),
(9, 'Soda Wars', 'Coke', 34, 'Pepsi', 34, 68, 'resources/images/soda.jpg', 'Description'),
(10, 'Kitchenware', 'Cada panela com o seu testo', 34, 'Cada testo uma panela', 34, 68, 'resources/images/kitchenware.jpg', 'Description'),
(11, 'Stream and Chill', 'Netflix', 34, 'HBO', 34, 68, 'resources/images/stream.jpg', 'Description'),
(12, 'TV Hosts', 'Cristina Ferreira', 34, 'Goucha', 34, 68, 'resources/images/tv-host.jpg', 'Description'),
(13, 'GOAT', 'Ronaldo', 34, 'Messi', 34, 68, 'resources/images/goat.jpg', 'Description'),
(14, 'Best Repo', 'GitLab', 34, 'GitHub', 34, 68, 'resources/images/repo.jpg', 'Description'),
(15, 'Txt Editor', 'Emacs', 34, 'Vim', 34, 68, 'resources/images/txt-editor.jpg', 'Description');

INSERT INTO comment(ID, NUMBERLIKES, NUMBERDISLIKES, TOTALPOINTS, USER_ID, TOPIC_ID, CONTENT) VALUES
(1, 10, 3, 7, 1,1,'People that can´t accept pineapple in the pizza are just stupid. Can´t understand that shit'),
(2, 10, 3, 7, 1,2,'Sock Shoe. Shock Shoe is definitely the better way to do it. So more effective.'),
(3, 10, 3, 7, 2,4,'OMG!!! I think they are twins!! Can´t believe the similarities'),
(4, 10, 3, 7, 3,5,'Caseiro!! No doubts.' ),
(5, 10, 3, 7, 4,3,'Obviously milk!!! If you put cereals first you are a cereal killer!!' ),
(6, 10, 3, 7, 5,1,'How can this person say that pineapple in the pizza is a great choice? Oh lord please send help from above.' ),
(7, 10, 3, 7, 1,3,'Then i´m a proud cereal killer' ),
(8, 10, 3, 7, 2,4,'Seriously dude, why the hell would you think they are even related??' ),
(9, 10, 3, 7, 3,12,'OMG I just love them both. Can´t choose!!' ),
(10, 10, 3, 7, 4,15,'I just love Emacs, can´t imagine my life without it!!!' );
















