# Trump Tweets API
This project implements a REST API for the Trump Tweets angular app. The API has 2 microservices: one which gets an image of Donald Trump from Getty Images API, and another which uses Twitter API to get a random tweet by Donald Trump.

## Heroku

[Heroku deployment link](https://homework4-bdagg.herokuapp.com/)

## Theme
The theme of the Trump Tweets app is making Donald Trump look stupid by showing his famous tweets and an image of him.

The microservices reflect this theme by implementing microservice REST APIs for the front end client to call to get images and tweets of Donald Trump.

## Software Engineering Principles
This project is based on the MSA (Microservice Architecture) which aims to make server side APIs easier to scale and implement by seperating larger taks into several smaller taks which can each be scaled as needed.

## Known Bugs
Getty images api key may expire which will make the frontend not be able to display images until it is renewed. 

I didnt figure out how to use enviornment variables to store the twitter and getty api keys so they are hard coded into the requests
