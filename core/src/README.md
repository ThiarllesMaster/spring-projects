The main package responsible to use the IoC is the moment when the container start
and there is the class CoreApplication.java 

Developer ---------------> AnnotationConfigApplicationContext (Container)
Developer <--------------- (create the bean)

The AnnotationConfigApplicationContext uses the class ContextConfiguration 
which will be the Bean definition to be used inside container

Use the @Primary declared in the @Configuration this call the method having @Primary
