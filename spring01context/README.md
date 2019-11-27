qa1. HelloWorld
    maven依赖
    xml配置文件
    ApplicationContext的创建
    getBean的2种用法
    
2  工厂
    工厂类的静态方法
    工厂类的实例方法
    FactoryBean
3 作用域
    prototype
    singleton
    request
    session
    作用域的设置
    对象的创建时机
4  对象的初始化方法与销毁方法
    bean
    beans
    InitializingBean,DisposableBean

5  aware接口
    ApplicationContextAware
    BeanNameAware
    
作业:
1.百度找出BeanFactory与ApplicationContext的不同
BeanFactory在启动的时候不会去实例化Bean，中有从容器中拿Bean的时候才会去实例化
（BeanFactory 的实现是使用懒加载的方式，这意味着 beans 只有在我们通过 getBean() 
方法直接调用它们时才进行实例化实现 BeanFactory 最常用的 API 是 XMLBeanFactory）

延迟实例化的优点：（BeanFactory）
应用启动的时候占用资源很少；对资源要求较高的应用，比较有优势；

ApplicationContext在启动的时候就把所有的Bean全部实例化了。
它还可以为Bean配置lazy-init=true来让Bean延迟实例化

不延迟实例化的优点： （ApplicationContext）
1. 所有的Bean在启动的时候都加载，系统运行的速度快； 
2. 在启动的时候所有的Bean都加载了，我们就能在系统启动的时候，尽早的发现系统中的配置问题 
3. 建议web应用，在启动的时候就把所有的Bean都加载了。（把费时的操作放到系统启动中完成） 

2.spring-core,spring-beans,spring-web各个
依赖里面大致有哪些功能?
spring-core：依赖commons-logging
spring-beans：依赖spring-core（依赖commons-logging）
spring-web：依赖spring-context（依赖spring-beans、spring-expression、spring-aop）
spring-aop：依赖spring-beans、spring-core、aoplliance
spring-expression：依赖spring-core

3.把案例中AFactory类的createB
方法的代码改为return new A();
请问这种方式A的作用域是单例还是原型
是否单例与bean配置的scope有关，单例
如果有prototype那就是原型。

4.配置bean的时候,其lazy-init是什么意思?
（懒加载），表示该bean在容器初始化的时候不进行初始化

5.理解prototype作用域时,为什么销毁方法不生效?
当设置Bean的作用域为prototype时，销毁方法会出现冲突。
因为当作用域为prototype时，Spring容器不能够对Bean的整个生命周期进行管理，
最终对象的销毁和资源回收由使用者负责。
singleton则整个生命周期由容器负责。

自学内容(可选):
    学习案例中dynamic包下相关内容
  目标:
  1.能理解BeanDefinition
  2.能理解BeanDefinitionBuilder
  3.能了解BeanDefinitionRegistry
  4.理解动态注解的作用与使用场景 

