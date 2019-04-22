[![](https://jitpack.io/v/jhavatar/EasyRippleDrawable.svg)](https://jitpack.io/#jhavatar/EasyRippleDrawable)

# Easy Ripple Drawable (ERD)
A tiny library to display a customizable ripple effect on view touch/click anywhere in app. 

*Note minimum SDK is 21 (Lollipop).*

## Setup
#### 1. Include the library

Add in your root build.gradle

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency

 ```groovy
 dependencies {
     implementation "com.github.jhavatar:EasyRippleDrawable:1.0.0'
 }
 ```
 
 #### 2. Set default configuration
 Add a default config to app's style -- need to set a value for all the config options.
 
 For example:
 ```xml
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    ...
    <item name="erd_color">@color/erd_color_default</item>
    <item name="erd_alpha">@color/erd_alpha_default</item>
    <item name="erd_shape">@drawable/erd_shape_rectangle</item>
    <item name="erd_corner_radius">@dimen/erd_corner_radius_default</item>
</style>
```

## Usage

Basic usage is as simple as setting `@drawable/easy_ripple` as view's background or foreground. NB, view must have a click or touch listener set or `android:clickable="true"` for ripple to work.

Note, by default the customization set in the app's style is used.

Example:
 ```xml
 <TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/my_button"
    android:text="Round cornered button"
    android:background="@drawable/easy_ripple"
    android:clickable="true"/>
 ```

## Customize

To do view specific styling, create a style and set it as the view's theme.

In app's resources:
 ```xml
<style name="my_button_theme">
    <item name="erd_color">#009688</item>
    <item name="erd_shape">@drawable/erd_shape_rectangle</item>
    <item name="erd_corner_radius">16dp</item>
</style>
 ```
 
 In layout file:
 ```xml
 <TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/my_button"
    android:text="Round cornered button"
    android:background="@drawable/easy_ripple"
    android:clickable="true"
    android:theme="@style/my_button_theme"/>
 ```
 
#### Customize programmatically
 
Retrieve the drawable `@drawable/easy_ripple` with the method that takes a theme as parameter -- this allows you to apply the desired theme. Then set the retrieved drawbable as the view's background/foreground as normal.

Example in activity's onCreate:
```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButtonTheme = this.theme
        myButtonTheme.applyStyle(R.style.my_button_theme, true)
        findViewById<View>(R.id.my_button).background = ResourcesCompat.getDrawable(resources, 
            R.drawable.easy_ripple, 
            myButtonTheme)
    }
```

## Config Options

- **erd_color** : The ripple's color. The default is a light gray.
- **erd_shape** : The ripple's shape. can be either rectangular using `@drawable/erd_shape_rectangle` or oval, for circular views, using `@drawable/erd_shape_oval`. The default is rectangular.
- **erd_corner_radius** : The corner radius when using `erd_shape == @drawable/erd_shape_rectangle`. The default is 0dp.
- **erd_alpha** : The transparency of the ripple. You only need to change the alpha value on black. The default is `#FF000000`.


## Changelog
v1.0.0 
- initial release
