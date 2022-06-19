# batch-sjms2-oaq-camel
Camel project that consume an Oracle AQ in batch

## description

This project allow to cosume an OAQ (Oracle advance queue) in batch using Camel and sjms2
Notice that only the version 2 of [sjms2](https://camel.apache.org/components/2.x/sjms2-component.html) has the batch option

You can build it from scratch with the next command:

```sh
╰─$ mvn archetype:generate -DarchetypeGroupId="org.apache.camel.archetypes" -DarchetypeArtifactId=camel-archetype-java -DarchetypeVersion="2.25.4"
```
## build and run

To build this project use

    mvn install

To run this project from within Maven use

    mvn exec:java

