

Ariana [obsolete]
=======

Provide Multiple Gradients in ImageViews and Texts

Demo
----

![](media/web_256.png)
![](media/media.gif)
![](media/one.png)
![](media/two.png)
![](media/three.png)

Usage
-----
set Gradient background ImageView

```java

    imageView.setBackground(Ariana.drawable(Utils.getColors()),GradientAngle.LEFT_BOTTOM_TO_RIGHT_TOP);
    
```
set Gradient background for TextView

```java

    Ariana.setGradient(textView,Utils.getColors(),GradientAngle.LEFT_BOTTOM_TO_RIGHT_TOP);
    
```
add listener to ViewPager for background ImageView

```java

    viewPager.addOnPageChangeListener(new ArianaBackgroundListener(Utils.getColors(), imageView, viewPager));
    
```
 add listener to ViewPager for TextView

```java

    viewPager.addOnPageChangeListener(new ArianaTextListener(Utils.getColors(), textView, viewPager));
    
```

 
 

Download
--------

Grab via Gradle:
```groovy
compile 'com.fxn769:ariana:1.0'
```

or Maven:
```xml
<dependency>
  <groupId>com.fxn769</groupId>
  <artifactId>ariana</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```

or ivy:
```xml
<dependency org='com.fxn769' name='ariana' rev='1.0'>
  <artifact name='ariana' ext='pom' />
</dependency>
```




## License
Licensed under the Apache License, Version 2.0, [click here for the full license](/LICENSE.txt).

## Author & support
This project was created by [Akshay Sharma](https://akshay2211.github.io/).

> If you appreciate my work, consider buying me a cup of :coffee: to keep me recharged :metal: by [PayPal](https://www.paypal.me/akshay2211)

> I love using my work and I'm available for contract work. Freelancing helps to maintain and keep [my open source projects](https://github.com/akshay2211/) up to date!

[![forthebadge](http://forthebadge.com/images/badges/built-for-android.svg)](http://forthebadge.com)




