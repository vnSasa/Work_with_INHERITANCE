# Work with INHERITANCE

# ROBOT

Create a Robot class and CoffeRobot, RobotDancer, RobotCoocker classes, which will be descendants of Robot. Declare in Robot the method work (), which should describe the work that will be performed by each of the robots (ie, the method must be inherited):

For Robot, to display the text "I'm Robot - I'm just working".
For CoffeRobot, to display the text "I'm CoffeRobot - I'm making coffee" on the console.
For RobotDancer, to display the text "I'm RobotDancer - I'm just dancing."
For RobotCoocker, to display the text "I'm RobotCoocker - I'm just cooking".

Create instances of the above classes in the Main class and call the work () method to each of them.

Create an array of the Robot class in the Main class, fill the array with instances of the above classes. Create a for loop, go through all the elements of the array and call the method work () for each element of the array.

# ANIMAL

Create an Animal class. Describe it in the following fields: animal name, animal speed, animal age. These fields must be private.

Create a constructor with defined parameters, in which you must enter all the fields of the class. Create getters / setters for all fields in the class.
In the Main method. To create an instance of this class, by means of getter to deduce on the console in one line values of fields of this class.
Call setter, change the value of all fields of the class. Display all fields of the class on the console, again in one line. Field values are arbitrary.
In the Main method, only one object of the Animal class must be created. The output should be written as follows:

"Animal name = Leopard, Animal speed = 20 km / h, Animal age = 7 years"
"Animal name = Bull, Animal speed = 2 km / h, Animal age = 14 years"
