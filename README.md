# Struts Example

## Build the app with maven

```
$ mvn clean package
```

## Deploy the war to PCF

```
$ cf push struts-example -p target/struts.war
```
