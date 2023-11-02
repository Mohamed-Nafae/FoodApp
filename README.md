# Food App Documentation

**Author:** Benmeddour Mohamed Nafae

## Overview

The Food App is an Android application that allows users to explore a collection of food items. Users can view food items in a grid, click on them to get more details, and perform actions like deleting and adding food items. This documentation provides an overview of the app's structure and features.

## Package: `com.benmeddour.foodapp`

This package contains the Android app for the Food App.

### Class: `MainActivity`

#### Overview

The `MainActivity` class is the main activity for the Food App. It displays a grid of food items, and users can click on individual items to view more details. This class handles the initialization of the app, loading food data, and managing the grid of food items.

#### Constructor

- `constructor(listOfFoods: ArrayList<Food>, context: Context)`: The constructor for the `FoodAdapter` inner class takes a list of foods and a context as parameters and initializes the adapter.

#### Functions

- `onCreate(savedInstanceState: Bundle)`: This function is called when the activity is created. It sets the content view, loads food data, and initializes the `FoodAdapter` to populate the grid.

- `LoadFood()`: This function populates the `listOfFoods` with sample food items. You can customize this function to load actual food data.

- `inner class FoodAdapter`: This inner class is an adapter for the grid view. It handles the rendering of food items and responds to item clicks.

  - `getCount()`: Returns the number of food items in the adapter.

  - `getItem(position: Int)`: Returns the food item at the specified position.

  - `getItemId(position: Int)`: Returns the item ID for the given position.

  - `getView(position: Int, convertView: View?, parent: ViewGroup?)`: Inflates and returns the view for a food item in the grid. It also sets click listeners to open detailed views.

- `delete(i: Int)`: Removes a food item at the specified position and updates the adapter.

- `add(i: Int)`: Adds a food item at the specified position and updates the adapter.

#### Usage

1. Launch the app on your Android device.
2. The grid will display food items.
3. Click on a food item to view more details.
4. Use the delete and add functions to modify the list of food items.

### Class: `Food`

#### Overview

The `Food` class represents individual food items in the app. Each food item has a name, description, and an associated image.

### Layouts and Resources

The app uses XML layout files and image resources for displaying food items. These files are part of the Android project and are not included in this documentation.

### Dependencies

This app is developed using Android Studio and relies on Android SDK and resources for its functionality. The app may use additional libraries or dependencies based on your project's specific requirements.





