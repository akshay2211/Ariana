

Ariana
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



License
--------

    Copyright 2017 Akshay Sharma

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


