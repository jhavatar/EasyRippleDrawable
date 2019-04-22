[![](https://jitpack.io/v/jhavatar/EasyRippleDrawable.svg)](https://jitpack.io/#jhavatar/EasyRippleDrawable)

# Easy Ripple Drawable (ERD)
A tiny library to display a ripple effect on touch/click anywhere in app.

## Setup
#### 1. Include the library

Add in your root build.gradle

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency

 ```
 dependencies {
     implementation "com.github.jhavatar:EasyRippleDrawable:1.0.0'
 }
 ```
 
 #### 2. Default configuration
 Add a default config to app's style for all the theming options.
 
 For example:
 ```
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    ...
    <item name="erd_color">@color/erd_color_default</item>
    <item name="erd_alpha">@color/erd_alpha_default</item>
    <item name="erd_shape">@drawable/erd_shape_rectangle</item>
    <item name="erd_corner_radius">@dimen/erd_corner_radius_default</item>
</style>
```
        

## Changelog
v1.0.0 
- initial release
