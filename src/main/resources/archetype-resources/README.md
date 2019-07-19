# Bean-Builder

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.toolisticon.beanbuilder/beanbuilder-processor/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.toolisticon.beanbuilder/beanbuilder-processor)
[![Build Status](https://travis-ci.org/toolisticon/bean-builder.svg?branch=master)](https://travis-ci.org/toolisticon/bean-builder)
[![codecov](https://codecov.io/gh/toolisticon/bean-builder/branch/master/graph/badge.svg)](https://codecov.io/gh/toolisticon/bean-builder)

# Why you should use this project?


# Features
Annotation processor that

...

# How does it work?

Just add the ${rootArtifactId} annotation processor dependency to your
	<dependencies>
	    <!-- must be on provided scope since it is just needed at compile time -->
	    <dependency>
	        <groupId>${groupId}</groupId>
	        <artifactId>${rootArtifactId}-processor</artifactId>
	        <scope>provided</scope>
	    </dependency>
	</dependencies>


## Preconditions

## Example
    
# Contributing

We welcome any kind of suggestions and pull requests.

## Building and developing the Bean-Builder

The ${rootArtifactId} is built using Maven.
A simple import of the pom in your IDE should get you up and running. To build the ${rootArtifactId} on the commandline, just run `mvn` or `mvn clean install`

## Requirements

The likelihood of a pull request being used rises with the following properties:

- You have used a feature branch.
- You have included a test that demonstrates the functionality added or fixed.
- You adhered to the [code conventions](http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html).

## Contributions


# License

This project is released under the revised [MIT License](LICENSE).

This project includes and repackages the [Annotation-Processor-Toolkit](https://github.com/holisticon/annotation-processor-toolkit) released under the  [MIT License](/3rdPartyLicenses/annotation-processor-toolkit/LICENSE.txt).
