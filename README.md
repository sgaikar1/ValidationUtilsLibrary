# ValidationUtilsLibrary


The goal of this library is to help you in your development of validation forms.

currently it works on follow entities:
* First name:  if first name is blank or other than alphabets it will throw error.
* Last name: if last name is blank or other than alphabets it will throw error.
* Email: if email is not in vald format it will throw error.
* password: length 8-20 char, prevention from sql-injection
* Confirm Password: checks does password matches with confirmation password.
* Age: maximum 3 digits allowed, if empty will throw error.
* Mobile no: will check f empty or not, if filled will check for 10 digits, starting with 7/8/9 numeric.
* Address: will check if empty or not
* pincode: maximum  6 digits allowed,
* any string: if edit text is empty it will throw error.


### Installation

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
    compile 'com.github.sgaikar1:ValidationUtilsLibrary:1.0.2'
}
```

### Usage

* For implementation please refer to the sample app.
 
 
 ## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2016 Santosh Gaikar....

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
