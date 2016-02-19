# Global-Earthquake-and-Life-Expectancy-Interactive-Map

### Introduction
This repo is created to share extended functionalities for the EarthquakeCityMap GUI project created by open course [Object Oriented Programming in Java](https://www.coursera.org/learn/object-oriented-java/home) offered by UCSanDiego. 
Please note that only the classes implement the extending functionalities are shown in this repo.

### Codes
There are three pieces of java codes in this repo. 
* CountryMarker.java - An extended class to costumize the SimplePolygonMarker for drawing country in the map
* CountryMultiMarker.java - An extended class to extract countries' geographic information stored in MultiMarker
* EarthquakeCityMap.java - The original code of EarthquakeCityMap.java is provided by UC San Diego team who developped the [Object Oriented Programming in Java](https://www.coursera.org/learn/object-oriented-java/home). But the version shown here has been modified to encorporate added functionalities providing by CountryMarker.java and CountryMultiMarker.java

### Functionalities
Compared to the original packages, adding the three pieces of codes in this repo will add some new functionalities to the EarthquakeCityMap GUI.
* When hovering over a continent area, the country of where the mouse is hovering over will be highlighed with black solid line to highlight the border; and the area will be shadowed in transparent color. The level of transparency is depending on the life expectancy data provided by world bank: 1) if the life expenctancy of this country is high, the shadowing color will be red and stronger; 2) if the life expectancy if this country is low, the shadowing color will be red and lighter; 3) if the life expectancy data of this country is not available in the dataset, the shadowing color will be gray.
* When hovering over a continent area, the name of the country which is being hovered over will be printed out on the right legend area.
* When hovering over a continent area, the life expentancy of a country which is being hovered over will be printed out on the right legend area if it is available in the world bank data; if not available, "not available" string will be printed out on the legend area.

### Screenshots
Screenshots are taken to exhibit the final GUI functionalities, which can be found in the screenshots folder.
