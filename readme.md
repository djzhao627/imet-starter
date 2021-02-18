In the process, you’ll learn:

- To create a Room database to store and retrieve data.
- To use ViewModel to isolate use cases from the View.
- To view data and observe changes using LiveData.
- To simplify navigation and data passing within the app using Navigation Components.
And More!

> [https://www.raywenderlich.com/6729-android-jetpack-architecture-components-getting-started](https://www.raywenderlich.com/6729-android-jetpack-architecture-components-getting-started)

Steps:

 1. Adding Dependencies for Architecture Components
    - Room Components: Add local persistence in your app. Room is an object-mapping library wrapping SQLite to make your database management concise and painless.
    - Lifecycle Components: Lift the responsibility of managing your app’s lifecycle with ease. They add lifecycle-aware components like ViewModel and LiveData that allows you to forget about writing code for handling configuration changes or loading data into your UI when there’s an update.
    - Navigation Components: Add helper classes like NavController to simplify navigation and passing of data throughout your app.
 2. Creating ROOM 
    - Entity: A model class that represents a table in a Room database.
    - Data Access Object (DAO): A helper class to access and query the database.
    - Database: An abstract class that directly extends RoomDatabase. It’s main responsibility is creating the database and exposing entities through Data Access Objects (DAO).
 3. Live Updates With LiveData
    You only need to wrap the return type from the database with LiveData and Room will do all the heavy lifting for you! Now your app can observe changes in the model with very little effort!
 4. Introducing ViewModel
    - ViewModel‘s are lifecycle-aware, which means they know when the attached Activity or Fragment is destroyed and can immediately release data observers and other resources.
    - They survive configuration changes, so if your data is observed or fetched through a ViewModel, it’s still available after your Activity or Fragment is re-created. This means you can re-use the data without fetching it again.
    - ViewModel takes the responsibility of holding and managing data. It acts as a bridge between your Repository and the View. Freeing up your Activity or Fragment from managing data allows you to write more concise and unit-testable code.
 5. Architecture Layers
    ![Architecture Layers](https://koenig-media.raywenderlich.com/uploads/2018/08/Recommended-Architecure-650x488.png)
 6. Exploring Navigation Components
    Navigation Architecture Components are meant to simplify navigation within different parts of your app. They also help you visualize the navigation flow by generating a navigation graph. The navigation graph actually consists of a set of navigation points, which can be an Activity, Fragment or even a Custom Navigation Type. Navigation points are usually called destinations.
    