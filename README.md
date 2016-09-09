# Jukebox Application Project (Java)

The Song:
A Song class consists of an artist, a title, a price, a play count (the number of times that song has been played) and a length. Song class has appropriate constructors and the following methods:
1. Getter methods for each of the variables within the Song.
2. A method to change the price within the Song.
3. A method to “play” the song – this will increase the number of times the Song has been played, then print a message indicating that this song is now playing and giving the Song’s details.
4. A toString method.

The Jukebox:
The Jukebox class consists of a name and a list of Song objects. It has appropriate constructors, as well as methods to do the following:
1. Get the name of the jukebox.
2. Calculate the total price required to play all Songs in the list and return the value.
3. Search for a Song in the list based on the Title (check that a certain Song is in the list, given its name), and if it is, return it.
4. Search for all of the Songs in the list by a given Artist, and if any are present, return them all.
5. Add a new Song to the jukebox if it not already present. If the Song is present, it should not be added again. The method should return a piece of text indicating whether or not the Song was added.
6. Remove a Song from the jukebox (check if the Song is present in the jukebox and if it is, remove it) and return a boolean indicating whether or not it has been removed.
7. Display all Songs in the list.
8. Find the most expensive Song and return it.
9. Find the shortest Song and return it.
10. Find the most-played Song (i.e. the one with the highest play count) & return it.

The Application:
The Jukebox application class allows the user to create a named Jukebox. It then provide a menu to allow the user to repeatedly select one of the following actions:
1. Add a Song to the Jukebox.
2. Remove a Song from the Jukebox.
3. Search for a specific Song and play that Song.
4. Display the total price required to pay for playing all of the songs in the Jukebox.
5. Display the most expensive Song in the Jukebox.
6. Display the shortest Song in the Jukebox.
7. Display the most-played Song in the Jukebox.
8. Display all Songs in the Jukebox.
9. Display all Songs by a specific artist in the Jukebox.
10. Get the name of the jukebox.
11. Exit the program.
